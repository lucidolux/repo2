package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Esterilizacion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.ennumerados.V_leucemia;
import sebastian.java.Tp2.ennumerados.V_rabia;
import sebastian.java.Tp2.ennumerados.V_trivalente;
import sebastian.java.Tp2.entities.Gato;
import sebastian.java.Tp2.repositories.interfaces.I_GatoRepository;

public class GatoRepository implements I_GatoRepository{
    private Connection conn;

    public GatoRepository(Connection conn) { this.conn=conn; }

    @Override
    public void save(Gato gato) {
        if(gato==null) return;
        try (PreparedStatement ps=conn.prepareStatement("insert into gatos(nombre,raza,"
                + "edad,v_trivalente,v_leucemia,v_rabia,esterilizacion,peso,genero,"
                + "f_ingreso,idVeterinario,adopcion,idResponsable,f_adopcion) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
            PreparedStatement.RETURN_GENERATED_KEYS)){
                ps.setString(1, gato.getNombre());
                ps.setString(2, gato.getRaza());
                ps.setInt(3, gato.getEdad());
                ps.setString(4, gato.getV_trivalente().toString());
                ps.setString(5, gato.getV_leucemia().toString());
                ps.setString(6, gato.getV_rabia().toString());
                ps.setString(7, gato.getEsterilizacion().toString());
                ps.setDouble(8, gato.getPeso());
                ps.setString(9, gato.getGenero().toString());
                ps.setString(10, gato.getF_ingreso());
                ps.setInt(11, gato.getIdVeterinario());
                ps.setString(12, gato.getAdopcion().toString());
                ps.setInt(13, gato.getIdResponsable());
                ps.setString(14,  gato.getF_adopcion());
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
                    "upadate gatos set nombre=?, raza=?, edad=?, v_trivalente=?,v_leucemia=?,v_rabia=?,"
                            + "esterilizacion=?, peso=?, genero=?, f_iingreso=?, idVeterinario=?,"
                            +" adopcion=?, idResponsable=?, f_adopcion=? where idGato=?")){
            ps.setString(1, gato.getNombre());
            ps.setString(2, gato.getRaza());
            ps.setInt(3, gato.getEdad());
            ps.setString(4, gato.getV_trivalente().toString());
            ps.setString(5, gato.getV_leucemia().toString());
            ps.setString(6, gato.getV_rabia().toString());
            ps.setString(7, gato.getEsterilizacion().toString());
            ps.setDouble(8, gato.getPeso());
            ps.setString(9, gato.getGenero().toString());
            ps.setString(10, gato.getF_ingreso());
            ps.setInt(11, gato.getIdVeterinario());
            ps.setString(12, gato.getAdopcion().toString());
            ps.setInt(13, gato.getIdResponsable());
            ps.setString(14, gato.getF_adopcion());
            ps.setInt(15, gato.getIdGato());
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
                V_trivalente.valueOf(rs.getString("v_trivalente")),
                V_leucemia.valueOf(rs.getString("v_leucemia")),
                V_rabia.valueOf(rs.getString("v_rabia")),
                Esterilizacion.valueOf(rs.getString("esterilizacion")),
                rs.getDouble("peso"),
                Genero.valueOf(rs.getString("genero")),
                rs.getString("f_ingreso"),
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