package sebastian.java.Tp2.entities;
public class Veterinarios {
  private int idVeterinario; 
  private String nombre;
  private String apellido ;
  private String email; 
  private String turno;
  private double salario;

    public Veterinarios() {
    }

    public Veterinarios(String nombre, String apellido, String email, String turno, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.turno = turno;
        this.salario = salario;
    }

    public Veterinarios(int idVeterinario, String nombre, String apellido, String email, String turno, double salario) {
        this.idVeterinario = idVeterinario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.turno = turno;
        this.salario = salario;
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Veterinarios{" 
                + "idVeterinario=" + idVeterinario + ", nombre=" + nombre 
                + ", apellido=" + apellido + ", email=" + email + ", turno=" + turno 
                + ", salario=" + salario + '}';
    }
  
  
}
