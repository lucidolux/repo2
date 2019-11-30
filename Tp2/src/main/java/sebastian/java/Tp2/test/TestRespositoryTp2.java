package sebastian.java.Tp2.test;
import java.sql.Connection;
import sebastian.java.Tp2.connector.Connector;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.ennumerados.Turno;
import sebastian.java.Tp2.entities.Gato;
import sebastian.java.Tp2.entities.Perro;
import sebastian.java.Tp2.entities.Responsable;
import sebastian.java.Tp2.entities.Veterinario;
import sebastian.java.Tp2.repositories.interfaces.I_GatoRepository;
import sebastian.java.Tp2.repositories.interfaces.I_PerroRepository;
import sebastian.java.Tp2.repositories.interfaces.I_ResponsableRepository;
import sebastian.java.Tp2.repositories.interfaces.I_VeterinarioRepository;
import sebastian.java.Tp2.repositories.interfaces.jdbc.GatoRepository;
import sebastian.java.Tp2.repositories.interfaces.jdbc.PerroRepository;
import sebastian.java.Tp2.repositories.interfaces.jdbc.ResponsableRepository;
import sebastian.java.Tp2.repositories.interfaces.jdbc.VeterinarioRepository;
public class TestRespositoryTp2 {
    public static void main(String[] args) {
//        try (Connection conn=Connector.getConnection()){
//            I_GatoRepository gr= new GatoRepository(conn);

//             //***********************SAVE************************"
//            Gato gato=new Gato(
//                      "canguro"
//                    , "mestizo"
//                    , 12
//                    , Genero.hembra
//                    , 2
//                    , Adopcion.adoptado
//                    , 1
//                    , "2018-06-11");
//            gr.save(gato);
//            System.out.println(gato);
//            
//             //"**************************REMOVE*********************************");
//                       gr.remove(gr.getByIdGato(35));
//
//           
//             //"************************UPDATE***********************************");
// 
//                       gato = gr.getByIdGato(2);
//                       gato.setNombre("lucas");
//                       gato.setRaza("mestizo");
//                       gato.setEdad(4);
//                       gato.setGenero(Genero.hembra);
//                       gato.setIdVeterinario(2);
//                       gato.setAdopcion(Adopcion.adoptado);
//                       gato.setIdResponsable(3);
//                       gato.setF_adopcion("2015-07-04");
//                       gr.update(gato);
//                       gr.getAll().forEach(System.out::println); // getALl
//   
//           } catch (Exception e) { e.printStackTrace(); }
//    
//        
//        //**************************PERROS**************************************
//        try (Connection conn= Connector.getConnection()){
//            I_PerroRepository pr=new PerroRepository(conn);
//            
//        //********************SAVE****************************
//             Perro perro = new Perro(
//                  "kusturika"
//                 , "labrador"  
//                 , 11
//                 , Genero.hembra
//                 , 4
//                 , Adopcion.adoptado
//                 , 3
//                 ,"2018-10-23");
//            pr.save(perro);
//            System.out.println(perro);
//            
////            **********************************REMOVE***************************
//            pr.remove(pr.getByIdPerro(3));
//            
////            ***********************************UPDATE**************************
//                  perro=pr.getByIdPerro(4);
//                  perro.setNombre("frida");
//                  perro.setRaza("pitbull");
//                  perro.setEdad(5);
//                  perro.setGenero(Genero.hembra);
//                  perro.setIdVeterinario(5);
//                  perro.setAdopcion(Adopcion.adoptado);
//                  perro.setIdResponsable(8);//nota no permite el campo null
//                  perro.setF_adopcion("2019-03-02");
//                  pr.update(perro);
//                  pr.getAll().forEach(System.out::println);//getAll
//   
//        } catch (Exception e) { e.printStackTrace();} 
//    
//        
//        
        
     //**************************REPONSABLES********************************   
    
        try (Connection conn= Connector.getConnection()){
            I_ResponsableRepository  rr = new ResponsableRepository(conn); 
            
            
            //************************SAVE*****************************
            Responsable responsable = new Responsable(
                //nombre,apellido,direccion,telefono,ciudad,email,dni
                    "fernando"
                    ,"delgadillo"
                    ,"azcuenaga 3033 piso 6"
                    ,1234321234
                    ,1029384756
            );
            rr.save(responsable);
            System.out.println(responsable);
            
            
//            ***********************REMOVE************************
              rr.remove(rr.getByIdResponsable(6));
              
             //*******************UPDATE**************************
            responsable=rr.getByIdResponsable(7);
            responsable.setNombre("carlos");    
            responsable.setApellido("pizarro");
            responsable.setDireccion("peron 2559 depto 5");
            responsable.setTelefono(1131952);
            responsable.setDni(556781234);
            //********************getall************************
            rr.getAll().forEach(System.out::println); 

        
        } catch (Exception e) { e.printStackTrace(); }

//        
//
////        *********************************VETERINARIOS*******************    
//        try (Connection conn= Connector.getConnection();){
//            I_VeterinarioRepository vr= new VeterinarioRepository(conn);
//            
//            //*****************************SAVE*************************
//            Veterinario veterinario = new Veterinario( 
//                    "bruno"
//                    , "diaz"
//                    , "brudi@gmail.com"
//                    , Turno.tarde
//            );
//                    //nombre,apellido,email,turno,salario
//     
//                
//            vr.save(veterinario);
//            System.out.println(veterinario);
//            
//            //*********************************REMOVE***************************
//            vr.remove(vr.getByIdVeterinario(2));
//            
//            
//            //**************************UPDATE*********************************
//            veterinario=vr.getByIdVeterinario(4);
//            veterinario.setNombre("clark");
//            veterinario.setApellido("ken");
//            veterinario.setEmail("clarken@gmail.com");
//            veterinario.setTurno(Turno.tarde);
//            //**********************getAll*************************************
//            vr.getAll().forEach(System.out::println);
//        } catch (Exception e) { e.printStackTrace();}
//
//       
    }

}
