import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JFrame{

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField textFielid;
    private JTextField textFieldNombre;
    private JTextField textFieldEdad;
    private JTextField textFieldPrioridad;
    private JTextField textFieldAmigos;
    private JTextField textFielidBuscar;
    private JButton AGREGARDATOSPREDETERMINADOSButton;
    private JButton activarSiguienteButton;
    private JButton activarTodosButton;
    private JButton eliminarCabezaButton;
    private JButton eliminarTodosButton;
    private JButton restaurarUltimoButton;
    private JButton restaurarTodosButton;
    private JButton MOSTRARButton;
    private JTextArea MostrarTodo;
    private JButton AGREGARButton;
    private JButton BUSCARButton;
    private JTextArea ImprimirDatosQuemados;

    SocialNetwork s = new SocialNetwork();
    public InterfazUsuario(){
        setContentPane(tabbedPane1);

        AGREGARDATOSPREDETERMINADOSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {imprimirDatosQuemadosCola();

            }
        });
    }

    private void imprimirDatosQuemadosCola() {
        ImprimirDatosQuemados.setText("Se han insertado los siguientes datos: \n\n");
        for (Persona persona : s.DatosQuemados()) {
            ImprimirDatosQuemados.append(persona.toString());
        }
        AGREGARDATOSPREDETERMINADOSButton.setEnabled(false);
    }
}
