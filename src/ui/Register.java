package ui;

import dao.ClientDAO;
import dao.ClientDAOImpl;
import model.Account;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JButton signUpButton;
    private JPanel Master;
    private JButton RegisterAccountButton;
    private JTextField UsernameField;
    private JTextField EmailField;
    private JPasswordField PasswordField;
    private JLabel RegisterTitle;
    private JLabel PasswordPrompt;
    private JLabel EmailPrompt;
    private JLabel UsernamePrompt;

    private Register my_frame;

    public Register()
    {
        my_frame = this;
        setContentPane(Master);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000,1000);
        setVisible(true);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientDAO clientDAO = new ClientDAOImpl();
                Account createdAccount = clientDAO.addClient(usernameTextField.getText(),passwordTextField.getText());
                if(createdAccount == null)
                {
                    JOptionPane.showMessageDialog(my_frame,
                            "WARNING.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                    JFrame frame = new News();
                    dispose();
                }
            }
        });
    }
}
