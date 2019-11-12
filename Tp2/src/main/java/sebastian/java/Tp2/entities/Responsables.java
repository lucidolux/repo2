package sebastian.java.Tp2.entities;
public class Responsables {
private int idResponsable;
private String nombre;
private String apellido;
private String direccion;
private int  telefono ;
private String  ciudad;             
private String email; 
private int dni;

    public Responsables() {
    }

    public Responsables(int idResponsable, String nombre, String apellido, String direccion, int telefono, String ciudad, String email) {
        this.idResponsable = idResponsable;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
    }

    public Responsables(int idResponsable, String nombre, String apellido, String direccion, int telefono, String ciudad, String email, int dni) {
        this.idResponsable = idResponsable;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Responsables{"
                + "idResponsable=" + idResponsable + ", nombre=" + nombre
                + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" 
                + telefono + ", ciudad=" + ciudad + ", email=" + email + ", dni=" + dni + '}';
        
        
    }
 
    
}

