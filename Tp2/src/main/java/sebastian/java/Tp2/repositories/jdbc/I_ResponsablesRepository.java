package sebastian.java.Tp2.repositories.jdbc;

import java.util.List;
import sebastian.java.Tp2.entities.Responsables;

public interface I_ResponsablesRepository {
    void save (Responsables responsables);
    void remove (Responsables responsables);
    void update (Responsables responsables);
    
    List<Responsables>getAll();
    default Responsables getByIdResponsable (int idResponsable){
        return getAll()
                .stream()
                .filter(i->i.getIdResponsable()==idResponsable)
                .findFirst()
                .orElse(new Responsables());
    }








}
