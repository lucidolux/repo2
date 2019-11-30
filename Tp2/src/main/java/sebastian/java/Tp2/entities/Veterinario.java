package sebastian.java.Tp2.entities;
import sebastian.java.Tp2.ennumerados.Turno;

public class Veterinario {
  private int idVeterinario; 
  private String nombre;
  private String apellido ;
  private String email; 
  private Turno turno;


    public Veterinario() {
    }

    public Veterinario(String nombre, String apellido, String email, Turno turno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.turno = turno;
    }

    public Veterinario(int idVeterinario, String nombre, String apellido, String email, Turno turno) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.turno = turno;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "idVeterinario=" + idVeterinario + ", nombre=" + nombre + ", apellido=" + apellido
                + ", email=" + email + ", turno=" + turno + '}';
    }


    
    }





   
    

   
    