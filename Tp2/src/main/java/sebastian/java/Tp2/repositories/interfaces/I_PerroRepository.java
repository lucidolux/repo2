package sebastian.java.Tp2.repositories.interfaces;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import sebastian.java.Tp2.entities.Perro;
public interface I_PerroRepository {
      
        void save (Perro perro);
        void remove (Perro perro);
        void update (Perro perro);
        List<Perro> getAll();
        
        default Perro getByIdPerro (Integer idPerro){
            return getAll()
                    .stream().filter(i->i.getIdPerro()==idPerro)
                    .findFirst()
                    .orElse(new Perro());
        }

        default List<Perro> getLikeNombre (String nombre){
            if(nombre==null) return new ArrayList<Perro>();
            return getAll()
                    .stream()
                    .filter(n->n.getNombre()
                    .toLowerCase()
                    .contains(nombre.toLowerCase()))
                    .collect(Collectors.toList());
        }        

        default List<Perro> getLikeRaza (String raza){
            if(raza==null) return new ArrayList<Perro>();
            return getAll()
                    .stream()
                    .filter(r->r.getRaza()
                    .contains(raza.toLowerCase()))
                    .collect(Collectors.toList());

        }    
        
        default List<Perro> getLikeEdad (Integer edad){
               if(edad==null) return new ArrayList<Perro>();
               return getAll()
                       .stream()
                       .filter(e->e.getEdad()==edad)
                       .collect(Collectors.toList());
        }
         
            
            /*
     
                default List<Perro> getLikeEdad (Integer edad){
        if(edad==null) return new ArrayList<Perro>();
            return getAll()
                    .stream()
                    .filter(e->e.getEdad()==edad)
                    .collect(Collectors.toList());
            }
        */
}
