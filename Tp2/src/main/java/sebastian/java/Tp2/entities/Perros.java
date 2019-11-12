package sebastian.java.Tp2.entities;
public class Perros {
private int idPerro;    
private String nombre;   
private String raza;   
private int edad;   
private String v_parvovirus;   
private String v_moquillo;   
private String v_adenovirus;  
private String v_hepatitis;   
private String v_rabia;   
private String esterilizacion;   
private double peso;  
private String genero;   
private int f_ingreso;   
private int idVeterinario;   
private String adopcion;   
private int idResponsable;   
private int f_adopcion;

    public Perros() {
    }

    public Perros(String nombre, String raza, int edad, String v_parvovirus, String v_moquillo, String v_adenovirus, String v_hepatitis, String v_rabia, String esterilizacion, double peso, String genero, int f_ingreso, int idVeterinario, String adopcion, int idResponsable, int f_adopcion) {
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

    public Perros(int idPerro, String nombre, String raza, int edad, String v_parvovirus, String v_moquillo, String v_adenovirus, String v_hepatitis, String v_rabia, String esterilizacion, double peso, String genero, int f_ingreso, int idVeterinario, String adopcion, int idResponsable, int f_adopcion) {
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

    public String getV_parvovirus() {
        return v_parvovirus;
    }

    public void setV_parvovirus(String v_parvovirus) {
        this.v_parvovirus = v_parvovirus;
    }

    public String getV_moquillo() {
        return v_moquillo;
    }

    public void setV_moquillo(String v_moquillo) {
        this.v_moquillo = v_moquillo;
    }

    public String getV_adenovirus() {
        return v_adenovirus;
    }

    public void setV_adenovirus(String v_adenovirus) {
        this.v_adenovirus = v_adenovirus;
    }

    public String getV_hepatitis() {
        return v_hepatitis;
    }

    public void setV_hepatitis(String v_hepatitis) {
        this.v_hepatitis = v_hepatitis;
    }

    public String getV_rabia() {
        return v_rabia;
    }

    public void setV_rabia(String v_rabia) {
        this.v_rabia = v_rabia;
    }

    public String getEsterilizacion() {
        return esterilizacion;
    }

    public void setEsterilizacion(String esterilizacion) {
        this.esterilizacion = esterilizacion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(int f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getAdopcion() {
        return adopcion;
    }

    public void setAdopcion(String adopcion) {
        this.adopcion = adopcion;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public int getF_adopcion() {
        return f_adopcion;
    }

    public void setF_adopcion(int f_adopcion) {
        this.f_adopcion = f_adopcion;
    }

    @Override
    public String toString() {
        return "Perros{" + "idPerro=" + idPerro + ", nombre=" + nombre
                + ", raza=" + raza + ", edad=" + edad + ", v_parvovirus=" + v_parvovirus 
                + ", v_moquillo=" + v_moquillo + ", v_adenovirus=" + v_adenovirus 
                + ", v_hepatitis=" + v_hepatitis + ", v_rabia=" + v_rabia 
                + ", esterilizacion=" + esterilizacion + ", peso=" + peso + ", genero=" + genero 
                + ", f_ingreso=" + f_ingreso + ", idVeterinario=" + idVeterinario 
                + ", adopcion=" + adopcion + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';
    }


}
