package sebastian.java.Tp2.entities;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Genero;


public class Gato {
    private int idGato;
    private String nombre;
    private String raza;
    private int edad;
    private Genero genero;
    private int idVeterinario;
    private Adopcion adopcion;
    private int idResponsable;
    private String f_adopcion;

    public Gato() {
    }

    public Gato(String nombre, String raza, int edad, Genero genero, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public Gato(int idGato, String nombre, String raza, int edad, Genero genero, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.idGato = idGato;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public int getIdGato() {
        return idGato;
    }

    public void setIdGato(int idGato) {
        this.idGato = idGato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Adopcion getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(Adopcion adopcion) {
        this.adopcion = adopcion;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getF_adopcion() {
        return f_adopcion;
    }

    public void setF_adopcion(String f_adopcion) {
        this.f_adopcion = f_adopcion;
    }

    @Override
    public String toString() {
        return "Gato{" + "idGato=" + idGato + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", genero=" + genero 
                + ", idVeterinario=" + idVeterinario + ", adopcion=" + adopcion + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';
    }
   
}
//    public Gato(String nombre, String raza, int edad, V_trivalente v_trivalente, V_leucemia v_leucemia, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, String f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
//        this.nombre = nombre;
//        this.raza = raza;
//        this.edad = edad;
//        this.v_trivalente = v_trivalente;
//        this.v_leucemia = v_leucemia;
//        this.v_rabia = v_rabia;
//        this.esterilizacion = esterilizacion;
//        this.peso = peso;
//        this.genero = genero;
//        this.f_ingreso = f_ingreso;
//        this.idVeterinario = idVeterinario;
//        this.adopcion = adopcion;
//        this.idResponsable = idResponsable;
//        this.f_adopcion = f_adopcion;
//    }
//
//    public Gato(int idGato, String nombre, String raza, int edad, V_trivalente v_trivalente, V_leucemia v_leucemia, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, String f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
//        this.idGato = idGato;
//        this.nombre = nombre;
//        this.raza = raza;
//        this.edad = edad;
//        this.v_trivalente = v_trivalente;
//        this.v_leucemia = v_leucemia;
//        this.v_rabia = v_rabia;
//        this.esterilizacion = esterilizacion;
//        this.peso = peso;
//        this.genero = genero;
//        this.f_ingreso = f_ingreso;
//        this.idVeterinario = idVeterinario;
//        this.adopcion = adopcion;
//        this.idResponsable = idResponsable;
//        this.f_adopcion = f_adopcion;
//    }
//
//    
//    public int getIdGato() {
//        return idGato;
//    }
//
//    public void setIdGato(int idGato) {
//        this.idGato = idGato;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getRaza() {
//        return raza;
//    }
//
//    public void setRaza(String raza) {
//        this.raza = raza;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//
//    public V_trivalente getV_trivalente() {
//        return v_trivalente;
//    }
//
//    public void setV_trivalente(V_trivalente v_trivalente) {
//        this.v_trivalente = v_trivalente;
//    }
//
//    public V_leucemia getV_leucemia() {
//        return v_leucemia;
//    }
//
//    public void setV_leucemia(V_leucemia v_leucemia) {
//        this.v_leucemia = v_leucemia;
//    }
//
//    public V_rabia getV_rabia() {
//        return v_rabia;
//    }
//
//    public void setV_rabia(V_rabia v_rabia) {
//        this.v_rabia = v_rabia;
//    }
//
//    public Esterilizacion getEsterilizacion() {
//        return esterilizacion;
//    }
//
//    public void setEsterilizacion(Esterilizacion esterilizacion) {
//        this.esterilizacion = esterilizacion;
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//    }
//
//    public Genero getGenero() {
//        return genero;
//    }
//
//    public void setGenero(Genero genero) {
//        this.genero = genero;
//    }
//
//    public String getF_ingreso() {
//        return f_ingreso;
//    }
//
//    public void setF_ingreso(String f_ingreso) {
//        this.f_ingreso = f_ingreso;
//    }
//
//    public int getIdVeterinario() {
//        return idVeterinario;
//    }
//
//    public void setIdVeterinario(int idVeterinario) {
//        this.idVeterinario = idVeterinario;
//    }
//
//    public Adopcion getAdopcion() {
//        return adopcion;
//    }
//
//    public void setAdopcion(Adopcion adopcion) {
//        this.adopcion = adopcion;
//    }
//
//    public int getIdResponsable() {
//        return idResponsable;
//    }
//
//    public void setIdResponsable(int idResponsable) {
//        this.idResponsable = idResponsable;
//    }
//
//    public String getF_adopcion() {
//        return f_adopcion;
//    }
//
//    public void setF_adopcion(String f_adopcion) {
//        this.f_adopcion = f_adopcion;
//    }
//    
//
//    
//    @Override
//    public String toString() {
//        return "Gatos{" + "idGato=" + idGato + ", nombre=" + nombre + ", raza=" + raza 
//                + ", edad=" + edad + ", v_trivalente=" + v_trivalente + ", v_leucemia=" + v_leucemia 
//                + ", v_rabia=" + v_rabia + ", esterilizacion=" + esterilizacion + ", peso=" + peso 
//                + ", genero=" + genero + ", f_ingreso=" + f_ingreso + ", idVeterinario=" + idVeterinario 
//                + ", adopcion=" + adopcion + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';
//  }
//
//    public Integer getMayor_edad() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
