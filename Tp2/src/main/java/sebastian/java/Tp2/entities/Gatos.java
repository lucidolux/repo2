package sebastian.java.Tp2.entities;

public class Gatos {

    private int idGato;
    private String nombre;
    private String raza;
    private int edad;
    private String v_trivalente;
    private String v_leucemia;
    private String v_rabia;
    private String esterilizado;
    private double peso;
    private String genero;
    private int f_imgreso;
    private int idVeterinario;
    private String adopcion;
    private int idResponsable;
    private int f_adopcion;

    public Gatos() {
    }

    public Gatos(String nombre, String raza, int edad, String v_trivalente, String v_leucemia, String v_rabia, String esterilizado, double peso, String genero, int f_imgreso, int idVeterinario, String adopcion, int idResponsable, int f_adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_trivalente = v_trivalente;
        this.v_leucemia = v_leucemia;
        this.v_rabia = v_rabia;
        this.esterilizado = esterilizado;
        this.peso = peso;
        this.genero = genero;
        this.f_imgreso = f_imgreso;
        this.idVeterinario = idVeterinario;
        this.adopcion = adopcion;
        this.idResponsable = idResponsable;
        this.f_adopcion = f_adopcion;
    }

    public Gatos(int idGato, String nombre, String raza, int edad, String v_trivalente, String v_leucemia, String v_rabia, String esterilizado, double peso, String genero, int f_imgreso, int idVeterinario, String adopcion, int idResponsable, int f_adopcion) {
        this.idGato = idGato;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_trivalente = v_trivalente;
        this.v_leucemia = v_leucemia;
        this.v_rabia = v_rabia;
        this.esterilizado = esterilizado;
        this.peso = peso;
        this.genero = genero;
        this.f_imgreso = f_imgreso;
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

    public String getV_trivalente() {
        return v_trivalente;
    }

    public void setV_trivalente(String v_trivalente) {
        this.v_trivalente = v_trivalente;
    }

    public String getV_leucemia() {
        return v_leucemia;
    }

    public void setV_leucemia(String v_leucemia) {
        this.v_leucemia = v_leucemia;
    }

    public String getV_rabia() {
        return v_rabia;
    }

    public void setV_rabia(String v_rabia) {
        this.v_rabia = v_rabia;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
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

    public int getF_imgreso() {
        return f_imgreso;
    }

    public void setF_imgreso(int f_imgreso) {
        this.f_imgreso = f_imgreso;
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
        return "Gatos{"
                + "idGato=" + idGato + ", nombre=" + nombre
                + ", raza=" + raza + ", edad=" + edad
                + ", v_trivalente=" + v_trivalente + ", v_leucemia=" + v_leucemia
                + ", v_rabia=" + v_rabia + ", esterilizado=" + esterilizado
                + ", peso=" + peso + ", genero=" + genero + ", f_imgreso=" + f_imgreso
                + ", idVeterinario=" + idVeterinario + ", adopcion=" + adopcion
                + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';
    }

}
