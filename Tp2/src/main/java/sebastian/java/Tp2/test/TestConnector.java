package sebastian.java.Tp2.test;
import java.sql.Connection;
import java.sql.Statement;
import sebastian.java.Tp2.connector.Connector;

public class TestConnector {
    public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
           Statement st=conn.createStatement(); 
           String query="insert into veterinarios (nombre,apellido,email,turno,salario) values ("
                   +"'victor','lopez','vilo@gmail.com','mañana',25000)";
                   st.execute(query);
                   
                    conn.createStatement().execute(
              "insert into responsables(nombre,apellido,direccion,telefono,ciudad,email,dni) values("
      +"'vanessa','martinez','sarmiento 666 depto 30',384657364,'caba','vama@gmail.com',019287678)"
                            );
           
        } catch (Exception e) { e.printStackTrace(); }         
    }
    
}
