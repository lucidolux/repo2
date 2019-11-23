package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
//
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

//    default Gato getByV_trivalente (enum V_trivalente){
//        return getSll()
//                .stream().filter(v->v.getV_trivalente()==v_trivalente)
//                .collect(Collectors.toList());
//    }
//    
//    default Gato getLikeMayor_edad (Integer mayor_edad){
//        if(edad==null) return new ArrayList<Gatos>();
//        return getAll()
//                .stream()
//                .filter(me->me.getMayor_edad()==mayor_edad)
//                .Collectors.toList());
//    }
//                
    


}
