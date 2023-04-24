import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SocialNetwork {
    private Queue<Persona> almacenar;
    private PriorityQueue<Persona> prioridad;
    private Stack<Persona> eliminados;

    public SocialNetwork() {
        this.almacenar = almacenar;
        this.prioridad = prioridad;
        this.eliminados = eliminados;
    }

    public Queue<Persona> getAlmacenar() {
        return almacenar;
    }

    public void setAlmacenar(Queue<Persona> almacenar) {
        this.almacenar = almacenar;
    }

    public PriorityQueue<Persona> getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(PriorityQueue<Persona> prioridad) {
        this.prioridad = prioridad;
    }

    public Stack<Persona> getEliminados() {
        return eliminados;
    }

    public void setEliminados(Stack<Persona> eliminados) {
        this.eliminados = eliminados;
    }

    public Queue<Persona> DatosQuemados(){
        Queue<Persona> almacenar = new LinkedList<>();
    almacenar.offer(new Persona(18, "Jair Rueda", 6,10,2004));
    almacenar.offer(new Persona(20, "Andrei Flores", 1,20,2005));
    almacenar.offer(new Persona(23, "Junior Espin", 3,30,2006));
    almacenar.offer(new Persona(19, "Jose Vaca", 4,50,2007));
    almacenar.offer(new Persona(30, "Pepe Ruiz", 5,15,2008));
    almacenar.offer(new Persona(27, "John Cena", 2,100,2009));

        almacenar.addAll(almacenar);
        return almacenar;
    }
}
