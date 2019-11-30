package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.entities.Gato;
import sebastian.java.Tp2.repositories.interfaces.I_GatoRepository;

public class GatoRepository implements I_GatoRepository{
    private Connection conn;

    public GatoRepository(Connection conn) { this.conn=conn; }

    @Override
    public void save(Gato gato) {
        if(gato==null) return;
        try (PreparedStatement ps=conn.prepareStatement("insert into gatos(nombre,raza,"
                + "edad,genero,idVeterinario,adopcion,idResponsable,f_adopcion) values(?,?,?,?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS)){
                ps.setString(1, gato.getNombre());
                ps.setString(2, gato.getRaza());
                ps.setInt(3, gato.getEdad());
                ps.setString(4, gato.getGenero().toString());
                ps.setInt(5, gato.getIdVeterinario());
                ps.setString(6, gato.getAdopcion().toString());
                ps.setInt(7, gato.getIdResponsable());
                ps.setString(8,  gato.getF_adopcion());
                ps.execute();
                ResultSet rs=ps.getGeneratedKeys();
                if(rs.next()) gato.setIdGato(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Gato gato) {
        if(gato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from gatos where idGato=?" )){
            ps.setInt(1, gato.getIdGato());
            ps.execute();
        
        } catch (Exception e) {e.printStackTrace(); }
    }

    @Override
    public void update(Gato gato) {
    if(gato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                    "update gatos set nombre=?, raza=?, edad=?,"
                     + "genero=?, idVeterinario=?,adopcion=?, idResponsable=?, f_adopcion=? where idGato=?")){
            ps.setString(1, gato.getNombre());
            ps.setString(2, gato.getRaza());
            ps.setInt(3, gato.getEdad());
            ps.setString(4, gato.getGenero().toString());
            ps.setInt(5, gato.getIdVeterinario());
            ps.setString(6, gato.getAdopcion().toString());
            ps.setInt(7, gato.getIdResponsable());
            ps.setString(8, gato.getF_adopcion());
            ps.setInt(9, gato.getIdGato());
            ps.execute();
                
        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public List<Gato> getAll() {
        List<Gato>list=new ArrayList();
        try(ResultSet rs=conn.createStatement().executeQuery("select * from gatos")) {
            while(rs.next()){
             list.add(new Gato(
                rs.getInt("idGato"),
                rs.getString("nombre"),
                rs.getString("raza"),
                rs.getInt("edad"),
                Genero.valueOf(rs.getString("genero")),
                rs.getInt("idVeterinario"),
                Adopcion.valueOf(rs.getString("adopcion")),
                rs.getInt("idResponsable"),
                rs.getString("f_adopcion")
                
             )); 
            }
        
         } catch (Exception e) {e.printStackTrace(); }
          return list;
    
    }
}