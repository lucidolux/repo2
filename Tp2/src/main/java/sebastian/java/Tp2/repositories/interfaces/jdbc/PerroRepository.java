package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Esterilizacion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.ennumerados.V_adenovirus;
import sebastian.java.Tp2.ennumerados.V_hepatitis;
import sebastian.java.Tp2.ennumerados.V_moquillo;
import sebastian.java.Tp2.ennumerados.V_parvovirus;
import sebastian.java.Tp2.ennumerados.V_rabia;
import sebastian.java.Tp2.entities.Perro;
import sebastian.java.Tp2.repositories.interfaces.I_PerroRepository;

public class PerroRepository implements I_PerroRepository{
    private Connection conn;
    public PerroRepository(Connection conn ){this.conn=conn;}

    
    
    @Override
    public void save(Perro perro) {
        if(perro==null);
        try ( PreparedStatement ps=conn.prepareStatement("insert into perros(nombre,raza,edad,v_parvovirus,"
                + "v_moquillo,v_adenovirus,v_hepatitis,v_rabia,esterilizacion,peso,genero,f_Ingreso,idVeterinario,"
                + "adopcion,idResponsable,f_adopcion) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS)){
            ps.setString(1, perro.getNombre());
            ps.setString(2, perro.getRaza());
            ps.setInt(3, perro.getEdad());
            ps.setString(4, perro.getV_parvovirus().toString());
            ps.setString(5, perro.getV_moquillo().toString());
            ps.setString(6, perro.getV_adenovirus().toString());
            ps.setString(7, perro.getV_hepatitis().toString());
            ps.setString(8, perro.getV_rabia().toString());
            ps.setString(9, perro.getEsterilizacion().toString());
            ps.setDouble(10, perro.getPeso());
            ps.setString(11, perro.getGenero().toString());
            ps.setString(12, perro.getF_ingreso());
            ps.setInt(13, perro.getIdVeterinario());
            ps.setString(14, perro.getAdopcion().toString());
            ps.setInt(15, perro.getIdResponsable());
            ps.setString(16, perro.getF_adopcion());
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
                "update perros set nombre=?, raza=?, edad=?, v_parvovirus=?, v_moquillo=?, v_adenovirus=?, v_hepatitis=?,"
                        + " v_rabia=?, esterilizacion=?, peso=?, genero=?, f_Ingreso=?, idVeterinario=?, adopcion=?,"
                        + " idResponsable=?,f_adopcion=?, where idPerro=?")){
            ps.setString(1, perro.getNombre());
            ps.setString(2, perro.getRaza());
            ps.setInt(3, perro.getEdad());
            ps.setString(4, perro.getV_parvovirus().toString());
            ps.setString(5, perro.getV_moquillo().toString());
            ps.setString(6, perro.getV_adenovirus().toString());
            ps.setString(7, perro.getV_hepatitis().toString());
            ps.setString(8, perro.getV_rabia().toString());
            ps.setString(9, perro.getEsterilizacion().toString());
            ps.setDouble(10, perro.getPeso());
            ps.setString(11, perro.getGenero().toString());
            ps.setString(12, perro.getF_ingreso());
            ps.setInt(13, perro.getIdVeterinario());
            ps.setString(14, perro.getAdopcion().toString());
            ps.setInt(15, perro.getIdResponsable());
            ps.setString(16,perro.getF_adopcion());
            ps.setInt(17, perro.getIdPerro());
            ps.execute();
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public List<Perro> getAll() {
        List<Perro>list= new ArrayList();
        try (ResultSet rs=conn.createStatement().executeQuery("select from perros")){
            while(rs.next()){
                list.add(new Perro(
                        //rs.getInt --> es string o int?
                        rs.getInt("idPerro"), 
                        rs.getString("nombre"),
                        rs.getString("raza"),
                        rs.getInt("edad"),
                        V_parvovirus.valueOf(rs.getString("v_parvovirus")),
                        V_moquillo.valueOf(rs.getString("v_moquillo")),
                        V_adenovirus.valueOf(rs.getString("v_adenovirus")),
                        V_hepatitis.valueOf(rs.getString("v_hepatitis")),
                        V_rabia.valueOf(rs.getString("v_rabia")),
                        Esterilizacion.valueOf(rs.getString("esterilizacion")),
                        rs.getDouble("peso"),
                        Genero.valueOf(rs.getString("genero")),
                        rs.getString("f_ingreso"),
                        rs.getInt("idVeterinario"),
                        Adopcion.valueOf(rs.getString("adopcion")),
                        rs.getInt("idResponsable"),
                        rs.getString("f_adopcion")));
            }
            
        } catch (Exception e) { e.printStackTrace(); }
        return list;
        
    }
}
