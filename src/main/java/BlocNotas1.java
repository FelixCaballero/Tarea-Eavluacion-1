import javax.swing.*;
import java.awt.*;

public class BlocNotas1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("PanelBloc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new BorderLayout(10, 10));

        // Etiqueta superior
        JLabel title = new JLabel("Inicio Sesion", SwingConstants.CENTER);
        title.setFont(new Font("Verdana", Font.BOLD, 20));
        frame.add(title, BorderLayout.NORTH);

        // Panel central con GridLayout
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        centerPanel.setBackground(new Color(230, 240, 250));

        // Usuario
        centerPanel.add(new JLabel("Usuario:"));
        JTextField userField = new JTextField();
        centerPanel.add(userField);

        // Contraseña
        centerPanel.add(new JLabel("Contraseña:"));
        JPasswordField passField = new JPasswordField();
        centerPanel.add(passField);

        // CheckBox
        centerPanel.add(new JLabel(""));
        JCheckBox terms = new JCheckBox("Acepto los términos");
        centerPanel.add(terms);

        frame.add(centerPanel, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel bottomPanel = new JPanel();
        JButton loginBtn = new JButton("Acceder");
        JButton cancelBtn = new JButton("Cancelar");

        bottomPanel.add(loginBtn);
        bottomPanel.add(cancelBtn);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Mostrar ventana
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

