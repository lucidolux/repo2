package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.entities.Perro;
import sebastian.java.Tp2.repositories.interfaces.I_PerroRepository;

public class PerroRepository implements I_PerroRepository{
    private Connection conn;
    public PerroRepository(Connection conn ){this.conn=conn;}

    
    
    @Override
    public void save(Perro perro) {
        if(perro==null);
        try ( PreparedStatement ps=conn.prepareStatement("insert into perros(nombre,raza,edad,"
                + "genero,idVeterinario,adopcion,idResponsable,f_adopcion) values(?,?,?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)){
            ps.setString(1, perro.getNombre());
            ps.setString(2, perro.getRaza());
            ps.setInt(3, perro.getEdad());
            ps.setString(4, perro.getGenero().toString());
            ps.setInt(5, perro.getIdVeterinario());
            ps.setString(6, perro.getAdopcion().toString());
            ps.setInt(7, perro.getIdResponsable());
            ps.setString(8, perro.getF_adopcion());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) perro.setIdPerro(rs.getInt(1));
          
        } catch (Exception e) { e.printStackTrace(); }
    }

  
    @Override
    public void remove(Perro perro) {
    if(perro==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from perros where idPerro=?")){
            ps.setInt(1, perro.getIdPerro());
            ps.execute();
            
        } catch (Exception e) { e.printStackTrace();}
    }

    
    @Override
    public void update(Perro perro) {
    if(perro==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "update perros set nombre=?, raza=?, edad=?,"
                 + " genero=?, idVeterinario=?, adopcion=?, idResponsable=?, f_adopcion=?, where idPerro=?")){
            
            ps.setString(1, perro.getNombre());
            ps.setString(2, perro.getRaza());
            ps.setInt(3, perro.getEdad());
            ps.setString(4, perro.getGenero().toString());
            ps.setInt(5, perro.getIdVeterinario());
            ps.setString(6, perro.getAdopcion().toString());
            ps.setInt(7, perro.getIdResponsable());
            ps.setString(8,perro.getF_adopcion());
            ps.setInt(9, perro.getIdPerro());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Perro> getAll() {
        List<Perro>list= new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select * from perros")){
            while(rs.next()){
                list.add(new Perro(
                        rs.getInt("idPerro"), 
                        rs.getString("nombre"),
                        rs.getString("raza"),
                        rs.getInt("edad"),
                        Genero.valueOf(rs.getString("genero")),
                        rs.getInt("idVeterinario"),
                        Adopcion.valueOf(rs.getString("adopcion")),
                        rs.getInt("idResponsable"),
                        rs.getString("f_adopcion")));
            }
            
        } catch (Exception e) { e.printStackTrace(); }
        return list;
        
    }
}
