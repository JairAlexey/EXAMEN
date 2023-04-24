import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        InterfazUsuario i = new InterfazUsuario();

        i.setTitle("EXAMEN");
        i.setSize(700, 700);
        i.setVisible(true);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}