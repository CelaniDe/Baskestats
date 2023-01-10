package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel panel1;
    private JLabel loginText;
    private JLabel usernameText;
    private JTextField usernameTextField;
    private JLabel passwordText;
    private JPasswordField passwordPasswordField;
    private JButton loginButton;

    public Login(){
        setContentPane(panel1);
        setTitle("Login");
        setResizable(false);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
