package challenge.BankingApp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginInterface extends JFrame {
     private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginInterface(){
       
         setTitle("Banking App Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Use GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // padding around components
        gbc.fill = GridBagConstraints.HORIZONTAL; // make components stretch horizontally

        // Username Label
        gbc.gridx = 0; // column 0
        gbc.gridy = 0; // row 0
        panel.add(new JLabel("Username:"), gbc);

        // Username Field
        gbc.gridx = 1; // column 1
        gbc.gridy = 0;
        usernameField = new JTextField(20); // 20 columns wide
        panel.add(usernameField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Password:"), gbc);

        // Password Field
        gbc.gridx = 1;
        gbc.gridy = 1;
        passwordField = new JPasswordField(20);
        panel.add(passwordField, gbc);

        // Login Button
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginButton = new JButton("Login");
        panel.add(loginButton, gbc);

        // Add panel to frame
        add(panel);

        // Button action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials.");
                }
            }
        });
    }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(() -> {
        new LoginInterface().setVisible(true);
    });
    }
}
