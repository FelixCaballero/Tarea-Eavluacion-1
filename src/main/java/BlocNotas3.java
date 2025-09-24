import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class BlocNotas3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocNotas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 420);

        JTabbedPane tabs = new JTabbedPane();

        // ======= Panel LOGIN =======
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(new Color(245, 245, 255));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Logo
        JLabel logo = new JLabel("Inicio de sesion", SwingConstants.CENTER);
        logo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        logo.setForeground(new Color(255, 140, 0));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        loginPanel.add(logo, gbc);

        // Usuario
        gbc.gridwidth = 1;
        gbc.gridy++;
        gbc.gridx = 0;
        loginPanel.add(new JLabel("Usuario:"), gbc);
        gbc.gridx = 1;
        JTextField userField = new JTextField();
        loginPanel.add(userField, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy++;
        loginPanel.add(new JLabel("Contraseña:"), gbc);
        gbc.gridx = 1;
        JPasswordField passField = new JPasswordField();
        loginPanel.add(passField, gbc);

        // Checkbox términos
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        JCheckBox terms = new JCheckBox("Aceptar términos y condiciones");
        terms.setBackground(new Color(245, 245, 255));
        loginPanel.add(terms, gbc);

        // Botones
        gbc.gridy++;
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        JButton loginBtn = new JButton("Acceder");
        loginBtn.setBackground(new Color(100, 200, 100));
        loginBtn.setForeground(Color.BLACK);
        JButton cancelBtn = new JButton("Cancelar");
        cancelBtn.setBackground(new Color(220, 80, 80));
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.addActionListener(e -> System.exit(0));
        buttonPanel.setBackground(new Color(245, 245, 255));
        buttonPanel.add(loginBtn);
        buttonPanel.add(cancelBtn);
        loginPanel.add(buttonPanel, gbc);

        // Barra de progreso
        gbc.gridy++;
        JProgressBar progressBar = new JProgressBar(0, 100);
        progressBar.setValue(70);
        progressBar.setStringPainted(true);
        loginPanel.add(progressBar, gbc);

        // Slider con etiquetas
        gbc.gridy++;
        JSlider slider = new JSlider(0, 10, 5);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        loginPanel.add(slider, gbc);

        // ======= Panel REGISTRO =======
        JPanel registerPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        registerPanel.setBackground(new Color(250, 250, 240));
        registerPanel.setBorder(new TitledBorder("Formulario de Registro"));

        registerPanel.add(new JLabel("Nombre:"));
        JTextField nameField = new JTextField();
        registerPanel.add(nameField);

        registerPanel.add(new JLabel("Correo:"));
        JTextField emailField = new JTextField();
        registerPanel.add(emailField);

        registerPanel.add(new JLabel("Usuario:"));
        JTextField newUserField = new JTextField();
        registerPanel.add(newUserField);

        registerPanel.add(new JLabel("Contraseña:"));
        JPasswordField newPassField = new JPasswordField();
        registerPanel.add(newPassField);

        JButton registerBtn = new JButton("Registrar");
        registerBtn.setBackground(new Color(100, 150, 250));
        registerBtn.setForeground(Color.WHITE);
        registerPanel.add(new JLabel("")); // espacio
        registerPanel.add(registerBtn);

        // Agregar pestañas
        tabs.addTab("Login", loginPanel);
        tabs.addTab("Registro", registerPanel);

        frame.add(tabs);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
