package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sebastian.java.Tp2.ennumerados.Turno;
import sebastian.java.Tp2.entities.Veterinario;
import sebastian.java.Tp2.repositories.interfaces.I_VeterinarioRepository;

public class VeterinarioRepository implements I_VeterinarioRepository{
    private Connection conn;
    public VeterinarioRepository (Connection conn) { this.conn=conn;}

    @Override
    public void save(Veterinario veterinario) {
        if(veterinario==null);
        try (PreparedStatement ps=conn.prepareStatement("insert into veterinarios (nombre,apellido,email,turno,) values(?,?,?,?)",
                    PreparedStatement.RETURN_GENERATED_KEYS
        )){
           ps.setString(1, veterinario.getNombre());
           ps.setString(2, veterinario.getApellido());
           ps.setString(3, veterinario.getEmail());
           ps.setString(4, veterinario.getTurno().toString());
           ps.execute();
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()) veterinario.setIdVeterinario(rs.getInt(1));// aque hace referencia el 1 ? 
                  
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Veterinario veterinario) {
            if(veterinario==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from veterinarios where idVeterinarios=?")){
            ps.setInt(1, veterinario.getIdVeterinario());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void update(Veterinario veterinario) {
            if(veterinario==null) return;
        try  (PreparedStatement ps=conn.prepareStatement(
         "update veterinarios set nombre=?, apellido=?, email=?, turno=?"
        )){
             ps.setString(1, veterinario.getNombre());
             ps.setString(2, veterinario.getApellido());
             ps.setString(3, veterinario.getEmail());
             ps.setString(4, veterinario.getTurno().toString());
             ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
         
    }

    @Override
    public List<Veterinario> getAll() {
           List<Veterinario>list=new ArrayList();
             try (ResultSet rs=conn.createStatement().executeQuery("select * from veterinarios")){
                 while (rs.next()){
                     list.add(new Veterinario(
                             rs.getInt("idVeterinario"),
                             rs.getString("nombre"),
                             rs.getString("apellido"),
                             rs.getString("mail"),
                             Turno.valueOf(rs.getString("turno"))
                       
                    ));
                     
              }    
        } catch (Exception e) { e.printStackTrace(); }
             return list;
    }
        
           

    }
        
