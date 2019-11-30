package sebastian.java.Tp2.entities;
public class Responsable {
private int idResponsable;
private String nombre;
private String apellido;
private String direccion;
private int  telefono ;
private int dni;

    public Responsable() {
    }
    
    
      public Responsable(String nombre, String apellido, String direccion, int telefono, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public Responsable(int idResponsable, String nombre, String apellido, String direccion, int telefono, int dni) {
        this.idResponsable = idResponsable;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Responsable{" + "idResponsable=" + idResponsable + ", nombre=" + nombre + ", apellido=" + apellido
                + ", direccion=" + direccion + ", telefono=" + telefono + ", dni=" + dni + '}';
    }
    
}
      
      


        
        


