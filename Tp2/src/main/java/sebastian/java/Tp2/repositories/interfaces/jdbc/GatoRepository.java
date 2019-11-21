package sebastian.java.Tp2.repositories.interfaces.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import sebastian.java.Tp2.ennumerados.V_trivalente;
import sebastian.java.Tp2.entities.Gato;
import sebastian.java.Tp2.repositories.interfaces.I_GatoRepository;

public class GatoRepository implements I_GatoRepository{
    private Connection conn;

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
            ps.setDate(10, (java.sql.Date) gato.getF_ingreso());
            ps.setInt(11, gato.getIdVeterinario());
            ps.setString(12, gato.getAdopcion().toString());
            ps.setInt(13, gato.getIdResponsable());
            ps.setDate(14, (java.sql.Date) gato.getF_adopcion());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()) gato.setIdGato(rs.getInt(1));
            
        } catch (Exception e) { e.printStackTrace(); }
    }

    @Override
    public void remove(Gato gato) {
        if(gato==null) return;
        try (PreparedStatement ps=conn.prepareStatement(
                "delete from alumnos where idGato=?" )){
            ps.setInt(1, gato.getIdGato());
            ps.execute();
        
        } catch (Exception e) {e.printStackTrace(); }
    }

    @Override
    public void update(Gato gato) {
    if(gato==null) return;
        try {
            PreparedStatement ps=conn.prepareStatement(
                    "upadate gato set nombre=?, raza=?, edad=?, v_trivalente=?,v_leucemia=?,v_rabia=?,"
                            + "esterilizacion=?, peso=?, genero=?, f_iingreso=?, idVeterinario=?,"
                            +" adopcion=?  f_adopcion=?");
                                        
        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public List<Gato> getAll() {
        List<Gato>list=new ArrayList();
        try(ResultSet rs=conn.createStatement().executeQuery("select * from gato")) {
            while(rs.next()){
             list.add(new Gato(
                rs.getInt("idGato"),
                rs.getString("nombre"),
                rs.getString("raza"),
                rs.getInt("edad"),
                rs.getString("v_trivalente"),
                rs.getString("v_leucemia"),
                rs.getString("v_rabia"),
                rs.getString("esterilizacion"),
                rs.getDouble("peso"),
                rs.getString("genero"),
                rs.getDate("f_ingreso"),
                rs.getInt("idVeterinario"),
                rs.getString("adopcion"),
                rs.getInt("idResponsable"),
                rs.getDate("f_adopcion")
                
             )); 
            }
        
         } catch (Exception e) {e.printStackTrace(); }
          return list;
    
    }
}