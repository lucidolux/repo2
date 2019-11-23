package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.PreparedStatement;
import java.util.List;
import sebastian.java.Tp2.entities.Responsable;
import java.sql.Connection;
import java.sql.ResultSet;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import sebastian.java.Tp2.repositories.interfaces.I_ResponsableRepository;

public class ResponsableRepository implements I_ResponsableRepository{
     private Connection conn;
     public ResponsableRepository (Connection conn){ this.conn=conn; }  

    @Override
    public void save(Responsable responsable) {
      if(responsable==null) return;
        try (PreparedStatement ps=conn.prepareStatement("insert into responsables (nombre,apellido,direccion,telefono,ciudad,email,dni) values (?,?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
            
        )) {
             ps.setString(1, responsable.getNombre());
             ps.setString(2, responsable.getApellido());
        } catch (Exception e) { e.printStackTrace();      }
      
     }
    

    @Override
    public void remove(Responsable responsable) {
        if(responsable==null) return;
        try (PreparedStatement ps=conn.prepareStatement("delete  from reponsables where idResponsable=?"
        )) {
            ps.setInt(1, responsable.getIdResponsable());
            ps.execute();
         } catch (Exception e) { e.printStackTrace();}
        
    }

    @Override
    public void update(Responsable responsable) {
        if(responsable==null) return;
        try (PreparedStatement ps=conn.prepareStatement("update responsables nombre=?, apellido=?, direccion=?, telefono=?, ciudad=?, email=?, dni=? "
        )) {
            ps.setString(1, responsable.getNombre());
            ps.setString(2, responsable.getApellido() );
            ps.setString(3, responsable.getDireccion());
            ps.setInt(4, responsable.getTelefono());
            ps.setString(5, responsable.getCiudad());
            ps.setString(6, responsable.getEmail());
            ps.setInt(7, responsable.getDni());
            ps.execute();
     
        } catch (Exception e) { e.printStackTrace();}
        
    }

    @Override
    public List<Responsable> getAll() {
        List<Responsable>list = new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from responsables"
        )) {
            while(rs.next()){
                list.add(new Responsable( 
                        rs.getInt("idResponsable"), 
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("direccion"),
                        rs.getInt("telefono"),
                        rs.getString("ciudad"),
                        rs.getString("email"),
                        rs.getInt("dni")
                ));
            }
            
         } catch (Exception e) { e.printStackTrace();}
         return list;
                
      }
}