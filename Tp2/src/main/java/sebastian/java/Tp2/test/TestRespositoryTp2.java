package sebastian.java.Tp2.test;
import java.sql.Connection;
import sebastian.java.Tp2.connector.Connector;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Esterilizacion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.ennumerados.V_leucemia;
import sebastian.java.Tp2.ennumerados.V_rabia;
import sebastian.java.Tp2.ennumerados.V_trivalente;
import sebastian.java.Tp2.entities.Gato;
import sebastian.java.Tp2.repositories.interfaces.I_GatoRepository;
import sebastian.java.Tp2.repositories.interfaces.jdbc.GatoRepository;

public class TestRespositoryTp2 {
    public static void main(String[] args) {
        try (Connection conn=Connector.getConnection()){
            I_GatoRepository gr= new GatoRepository(conn);

            //guardar
            Gato gato=new Gato(
                      "rolling"
                    , "mestizo"
                    , 12
                    , V_trivalente.si
                    , V_leucemia.si
                    , V_rabia.si
                    , Esterilizacion.esterilizado
                    , 8.5
                    , Genero.hermbra
                    , (2018-06-12)
                    , 2
                    , Adopcion.adoptado
                    , 1
                    , (2018-06-11),
            gr.save(gato);
            System.out.println(gato);
            
            //borrar
            gr.remove(gr.getByIdGato(5));

         } catch (Exception e) { e.printStackTrace(); }
        
    }

}
