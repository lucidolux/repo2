package sebastian.java.Tp2.connector;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
private static String driver="com.mysql.jdbc.Driver";     // driver mysql 5  
//  private static String driver="com.mysql.cj.jdbc.Driver";    // driver mysql 6 o sup


   // Localhost
    private static String url="jdbc:mysql://127.0.0.1:3306/hogarmascotas";
    private static String user="root";
    private static String pass="root";
   


        //remotemysql.com
//    private static String url="jdbc:mysql://remotemysql.com:3306/vNXTSt9W4T";
//    private static String user="vNXTSt9W4T";
//    private static String pass="JimfIMuLhm";
    
    private static Connection conn=null;
    private Connector(){}
    public synchronized static Connection getConnection(){
        if(conn==null){
            try {
                Class.forName(driver);
                conn=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) { e.printStackTrace(); }
        }
        return conn;
    
    }
}

//Nombre de usuario: vNXTSt9W4T
//
//Nombre de la base de datos: vNXTSt9W4T
//
//Contraseña: JimfIMuLhm
//
//Servidor: remotemysql.com
//
//Puerto: 3306