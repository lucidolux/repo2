package sebastian.java.Tp2.repositories.interfaces.jdbc;
import java.sql.PreparedStatement;
import java.util.List;
import sebastian.java.Tp2.entities.Responsables;
import sebastian.java.Tp2.repositories.interfaces.I_ResponsablesRepository;
import java.sql.Connection;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class ResponsablesRepositorio implements I_ResponsablesRepository{
     private Connection conn;
     public ResponsablesRepositorio (Connection conn){ this.conn=conn; }  

    @Override
    public void save(Responsables responsables) {
      if(responsables==null) return;
        try {PreparedStatement ps=conn.prepareStatement(
                 "insert into responsables (nombre,apellido,direccion,telefono,ciudad,email,dni) values (?,?,?,?,?,?,?)",
                  PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, responsables.getNombre());
            ps.setString(2, responsables.getApellido());
        }
                        
            
        } catch (Exception e) { e.printStackTrace();}
    }

    @Override
    public void remove(Responsables responsables) {
  
    }

    @Override
    public void update(Responsables responsables) {
      }

    @Override
    public List<Responsables> getAll() {
  
      }
}