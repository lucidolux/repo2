package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.ennumerados.V_trivalente;
import sebastian.java.Tp2.entities.Gato;

public interface I_GatoRepository {

    void save(Gato gato);
    void remove(Gato gato);
    void update(Gato gato);
    List<Gato>getAll();

    default Gato getByIdGato (Integer idGato){
        return getAll()
                .stream()
                .filter(i->i.getIdGato()==idGato)
                .findFirst()
                .orElse(new Gato());
    }    
    
    default List<Gato> getLikeNombre(String nombre){
         if(nombre==null) return new ArrayList<Gato>();
         return getAll()
                 .stream()
                 .filter (n->n.getNombre()
                 .toLowerCase()
                 .contains(nombre.toLowerCase()))
                 .collect(Collectors.toList());
    }

    default List<Gato> getLikeRaza (String raza){
        if(raza==null) return new ArrayList<Gato>();
        return getAll()
                .stream()
                .filter(r->r.getRaza()
                .toLowerCase()
                .contains(raza.toLowerCase()))
                .collect(Collectors.toList());
        
    }
    default List<Gato> getLikeEdad (Integer edad){
        if(edad==null) return new ArrayList<Gato>();
            return getAll()
                    .stream()
                    .filter(e->e.getEdad()==edad)
                    .collect(Collectors.toList());
            }

    default List<Gato> getByV_trivalente (V_trivalente V_trivalente ){
        if(V_trivalente==null) return new ArrayList<Gato>();
        return getAll()
                .stream()
                .filter(g->g.getV_trivalente()==V_trivalente.si)
                .collect(Collectors.toList());
    }
//    
//    default List<Gato> getLikeMayor_edad (Integer mayor_edad){
//        if(mayor_edad==null) return new ArrayList<Gato>();
//        return getAll()
//                .stream()
//                .filter(g->g.getMayor_edad()==mayor_edad)
//                .collect(Collectors.toList());
//    }
//    default List<Gato> getByMayorEdad(Integer mayorEdad){
//        if(mayorEdad==null) return new ArrayList<Gato>();
//        mayorEdad=
//                .getAll()
//                .stream()
//                .max(Comparator.comparingInt(Gato::getEdad))
//                .get()
//                .getEdad();
//        return getAll()
//                .stream()
//                .filter(g->g.get)
//    }
                

}
