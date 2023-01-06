package ui;

import javax.swing.*;

public class Login extends JFrame {
    private JPanel panel1;
    private JLabel loginText;
    private JLabel usernameText;
    private JTextField usernameTextField;
    private JLabel passwordText;
    private JPasswordField passwordPasswordField;
    private JButton loginButton;

    public Login(){

        setTitle("Login");
        setResizable(false);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
