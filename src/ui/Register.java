package ui;

import dao.ClientDAO;
import dao.ClientDAOImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame{
    private JLabel registerText;
    private JTextField usernameTextField;
    private JTextField emailTextField;
    private JTextField passwordTextField;
    private JButton signUpButton;
    private JPanel panel2;

    public Register()
    {
        setContentPane(panel2);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientDAO clientDAO = new ClientDAOImpl();
                clientDAO.addClient();
            }
        });
    }
}
