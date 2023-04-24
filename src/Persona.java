import java.util.Arrays;

public class Persona {

    private int edad;
    private String NombreCompleto;
    private int prioridad;
    private int amigos;
    private int id;

    public Persona(int edad, String nombreCompleto, int prioridad, int amigos, int id) {
        this.edad = edad;
        NombreCompleto = nombreCompleto;
        this.prioridad = prioridad;
        this.amigos = amigos;
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getAmigos() {
        return amigos;
    }

    public void setAmigos(int amigos) {
        this.amigos = amigos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", NombreCompleto='" + NombreCompleto + '\'' +
                ", prioridad=" + prioridad +
                ", amigos=" + amigos +
                ", id=" + id +
                '}';
    }
}
