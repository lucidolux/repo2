package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.entities.Veterinario;

public interface I_VeterinarioRepository {
    void save (Veterinario veterinarios);
    void remove (Veterinario veterinarios);
    void update (Veterinario veterinarios);
    List<Veterinario>getAll();
    
    default Veterinario getByIdVeterinario (int idVeterinario){
        return getAll()
                .stream()
                .filter(i->i.getIdVeterinario()==idVeterinario)
                .findFirst()
                .orElse(new Veterinario());
    }
    
    default List<Veterinario>getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList<Veterinario>();
        return getAll()
                .stream()
                .filter(n->n.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Veterinario>getLikeApellido (String apellido){
       if(apellido==null) return new ArrayList<Veterinario>();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    
           
    }    
    
    
    
    
    

