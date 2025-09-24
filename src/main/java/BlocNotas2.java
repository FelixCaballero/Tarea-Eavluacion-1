import javax.swing.*;
import java.awt.*;

public class BlocNotas2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocNotas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 320);
        frame.setLayout(new BorderLayout(10, 10));

        // --- Cabecera ---
        JLabel title = new JLabel("Inicio de sesion", SwingConstants.CENTER);
        title.setFont(new Font("Verdana", Font.BOLD, 24));
        title.setForeground(new Color(60, 60, 180));
        frame.add(title, BorderLayout.NORTH);

        // --- Panel central ---
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        // Campos
        formPanel.add(new JLabel("Usuario:"));
        JTextField userField = new JTextField();
        formPanel.add(userField);

        formPanel.add(new JLabel("Contraseña:"));
        JPasswordField passField = new JPasswordField();
        formPanel.add(passField);

        formPanel.add(new JLabel("Recordar usuario:"));
        JCheckBox remember = new JCheckBox();
        formPanel.add(remember);

        formPanel.add(new JLabel("Aceptar términos:"));
        JCheckBox terms = new JCheckBox();
        formPanel.add(terms);

        frame.add(formPanel, BorderLayout.CENTER);

        // --- Panel inferior ---
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        JComboBox<String> language = new JComboBox<>(new String[]{"Español", "Inglés", "Francés"});
        bottomPanel.add(language);

        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(new Color(100, 200, 100));
        loginBtn.setForeground(Color.BLACK);
        bottomPanel.add(loginBtn);

        JButton exitBtn = new JButton("Salir");
        exitBtn.setBackground(new Color(220, 80, 80));
        exitBtn.setForeground(Color.WHITE);
        exitBtn.addActionListener(e -> System.exit(0));
        bottomPanel.add(exitBtn);

        frame.add(bottomPanel, BorderLayout.SOUTH);

        // --- Panel lateral con mensaje ---
        JTextArea info = new JTextArea("No existen usuarios registrados");
        info.setEditable(false);
        info.setBackground(new Color(245, 245, 245));
        info.setFont(new Font("SansSerif", Font.ITALIC, 12));
        frame.add(info, BorderLayout.EAST);

        // Mostrar
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
