package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.entities.Responsable;

public interface I_ResponsableRepository {
    void save (Responsable responsable); //insert
    void remove (Responsable responsable); // drop-delete
    void update (Responsable responsable); // alter 
    List<Responsable>getAll(); //select  * from responsable 
    
    
    //select
    default Responsable getByIdResponsable (int idResponsable){
        return getAll()
                .stream()
                .filter(i->i.getIdResponsable()==idResponsable)
                .findFirst()
                .orElse(new Responsable());
    }

    default List<Responsable>getLikeNombre(String nombre){
        if (nombre==null) return new ArrayList<Responsable>();
        return getAll()
                .stream()
                .filter(n->n.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Responsable>getLikeApellido (String apellido){
        if (apellido==null) return new ArrayList<Responsable>();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());           
    }

    default Responsable getByDni (Integer dni){
        return getAll()
                .stream()
                .filter(d->d.getDni()==dni)
                .findFirst()
                .orElse(new Responsable());           
    }


}
