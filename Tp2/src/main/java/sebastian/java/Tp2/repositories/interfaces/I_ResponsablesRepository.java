package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.entities.Responsables;

public interface I_ResponsablesRepository {
    void save (Responsables responsables); //insert
    void remove (Responsables responsables); // drop-delete
    void update (Responsables responsables); // alter 
    List<Responsables>getAll(); //select  * from resonsables 
    
    
    //select
    default Responsables getByIdResponsable (int idResponsable){
        return getAll()
                .stream()
                .filter(i->i.getIdResponsable()==idResponsable)
                .findFirst()
                .orElse(new Responsables());
    }

    default List<Responsables>getLikeNombre(String nombre){
        if (nombre==null) return new ArrayList<Responsables>();
        return getAll()
                .stream()
                .filter(n->n.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Responsables>getLikeApellido (String apellido){
        if (apellido==null) return new ArrayList<Responsables>();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());           
    }

    default Responsables getByDni (Integer dni){
        return getAll()
                .stream()
                .filter(d->d.getDni()==dni)
                .findFirst()
                .orElse(new Responsables());           
    }


}
