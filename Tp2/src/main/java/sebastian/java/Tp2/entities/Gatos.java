package sebastian.java.Tp2.entities;
import java.util.Date;
import sebastian.java.Tp2.ennumerados.Adopcion;
import sebastian.java.Tp2.ennumerados.Esterilizacion;
import sebastian.java.Tp2.ennumerados.Genero;
import sebastian.java.Tp2.ennumerados.V_leucemia;
import sebastian.java.Tp2.ennumerados.V_rabia;
import sebastian.java.Tp2.ennumerados.V_trivalente;

public class Gatos {
    private int idGAto;
    private String nombre;
    private String raza;
    private int edad;
    private V_trivalente v_trivalente;
    private V_leucemia v_leucemia;
    private V_rabia v_rabia;
    private Esterilizacion esterilizacion;
    private double  peso;
    private Genero genero;
    private java.util.Date f_ingreso;
    private int idVeterinario;
    private Adopcion adopcion;
    private int idResponsable;
    private java.util.Date f_adopcion;

    public Gatos() {
    }

    public Gatos(String nombre, String raza, int edad, V_trivalente v_trivalente, V_leucemia v_leucemia, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, Date f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, Date f_adopcion) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_trivalente = v_trivalente;
        this.v_leucemia = v_leucemia;
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

    public Gatos(int idGAto, String nombre, String raza, int edad, V_trivalente v_trivalente, V_leucemia v_leucemia, V_rabia v_rabia, Esterilizacion esterilizacion, double peso, Genero genero, Date f_ingreso, int idVeterinario, Adopcion adopcion, int idResponsable, Date f_adopcion) {
        this.idGAto = idGAto;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.v_trivalente = v_trivalente;
        this.v_leucemia = v_leucemia;
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

    @Override
    public String toString() {
        return "Gatos{" + "idGAto=" + idGAto + ", nombre=" + nombre + ", raza=" + raza 
                + ", edad=" + edad + ", v_trivalente=" + v_trivalente + ", v_leucemia=" + v_leucemia 
                + ", v_rabia=" + v_rabia + ", esterilizacion=" + esterilizacion + ", peso=" + peso 
                + ", genero=" + genero + ", f_ingreso=" + f_ingreso + ", idVeterinario=" + idVeterinario 
                + ", adopcion=" + adopcion + ", idResponsable=" + idResponsable + ", f_adopcion=" + f_adopcion + '}';
    }
    
  }

