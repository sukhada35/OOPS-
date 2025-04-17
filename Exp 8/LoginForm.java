import javax.swing.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, cancelButton;
    JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 30, 160, 25);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 70, 160, 25);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 80, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(210, 110, 80, 30);
        cancelButton.addActionListener(this);
        add(cancelButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(30, 140, 300, 25);       
        add(messageLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("admin123")) {
                JFrame successFrame = new JFrame("Success");
                JLabel successLabel = new JLabel("Login Successful!", SwingConstants.CENTER);
                successLabel.setBounds(30, 30, 200, 30);
                successFrame.add(successLabel);
                successFrame.setSize(300, 150);
                successFrame.setLayout(null);
                successFrame.setVisible(true);
                successFrame.setLocationRelativeTo(null);
            } else {
                messageLabel.setText("Invalid credentials. Try again.");
            }
        } else if (e.getSource() == cancelButton) {
            usernameField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginForm().setVisible(true);
    }
}
