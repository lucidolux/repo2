package sebastian.java.Tp2.entities;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Genero;


public class Perro {
private int idPerro;    
private String nombre;   
private String raza;   
private int edad;   
private Genero genero;   
private int idVeterinario;   
private Adopcion adopcion;   
private int idResponsable;   
private String f_adopcion;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, Genero genero, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public Perro(int idPerro, String nombre, String raza, int edad, Genero genero, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.idPerro = idPerro;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
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
        return "Perro{" + "idPerro=" + idPerro + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ","
                + " genero=" + genero + ", idVeterinario=" + idVeterinario + ", adopcion=" + adopcion
                + ", idResponsable=" + idResponsable +", f_adopcion=" + f_adopcion + '}';
    }

    
    
}

/*
public Perro(String nombre, String raza, int edad, V_parvovirus v_parvovirus, V_moquillo v_moquillo, V_adenovirus v_adenovirus, V_hepatitis v_hepatitis, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, String f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_parvovirus = v_parvovirus;
        this.v_moquillo = v_moquillo;
        this.v_adenovirus = v_adenovirus;
        this.v_hepatitis = v_hepatitis;
        this.v_rabia = v_rabia;
        this.esterilizacion = esterilizacion;
        this.peso = peso;
        this.genero = genero;
        this.f_ingreso = f_ingreso;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public Perro(int idPerro, String nombre, String raza, int edad, V_parvovirus v_parvovirus, V_moquillo v_moquillo, V_adenovirus v_adenovirus, V_hepatitis v_hepatitis, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, String f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, String f_adopcion) {
        this.idPerro = idPerro;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_parvovirus = v_parvovirus;
        this.v_moquillo = v_moquillo;
        this.v_adenovirus = v_adenovirus;
        this.v_hepatitis = v_hepatitis;
        this.v_rabia = v_rabia;
        this.esterilizacion = esterilizacion;
        this.peso = peso;
        this.genero = genero;
        this.f_ingreso = f_ingreso;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

       
    public int getIdPerro() {
        return idPerro;
    }

    public void setIdPerro(int idPerro) {
        this.idPerro = idPerro;
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

    public V_parvovirus getV_parvovirus() {
        return v_parvovirus;
    }

    public void setV_parvovirus(V_parvovirus v_parvovirus) {
        this.v_parvovirus = v_parvovirus;
    }

    public V_moquillo getV_moquillo() {
        return v_moquillo;
    }

    public void setV_moquillo(V_moquillo v_moquillo) {
        this.v_moquillo = v_moquillo;
    }

    public V_adenovirus getV_adenovirus() {
        return v_adenovirus;
    }

    public void setV_adenovirus(V_adenovirus v_adenovirus) {
        this.v_adenovirus = v_adenovirus;
    }

    public V_hepatitis getV_hepatitis() {
        return v_hepatitis;
    }

    public void setV_hepatitis(V_hepatitis v_hepatitis) {
        this.v_hepatitis = v_hepatitis;
    }

    public V_rabia getV_rabia() {
        return v_rabia;
    }

    public void setV_rabia(V_rabia v_rabia) {
        this.v_rabia = v_rabia;
    }

    public Esterilizacion getEsterilizacion() {
        return esterilizacion;
    }

    public void setEsterilizacion(Esterilizacion esterilizacion) {
        this.esterilizacion = esterilizacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
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
        return "Perros{" + "idPerro=" + idPerro + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad 
                + ", v_parvovirus=" + v_parvovirus + ", v_moquillo=" + v_moquillo + ", v_adenovirus=" + v_adenovirus 
                + ", v_hepatitis=" + v_hepatitis + ", v_rabia=" + v_rabia + ", esterilizacion=" + esterilizacion 
                + ", peso=" + peso + ", genero=" + genero + ", f_ingreso=" + f_ingreso + ", idVeterinario=" + idVeterinario
                + ", adopcion=" + adopcion + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';

    }
    
}

*/