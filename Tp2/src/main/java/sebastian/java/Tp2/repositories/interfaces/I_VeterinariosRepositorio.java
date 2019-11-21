package sebastian.java.Tp2.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.entities.Veterinarios;

public interface I_VeterinariosRepositorio {
    void save (Veterinarios veterinarios);
    void remove (Veterinarios veterinarios);
    void update (Veterinarios veterinarios);
    List<Veterinarios>getAll();
    
    default Veterinarios getByIdVeterinario (int idVeterinario){
        return getAll()
                .stream()
                .filter(i->i.getIdVeterinario()==idVeterinario)
                .findFirst()
                .orElse(new Veterinarios());
    }
    
    default List<Veterinarios>getLikeNombre(String nombre){
        if(nombre==null) return new ArrayList<Veterinarios>();
        return getAll()
                .stream()
                .filter(n->n.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Veterinarios>getLikeApellido (String apellido){
       if(apellido==null) return new ArrayList<Veterinarios>();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    
           
    }    
    
    
    
    
    

