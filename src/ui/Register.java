package ui;

import dao.ClientDAO;
import dao.ClientDAOImpl;
import model.Account;

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

    private Register my_frame;

    public Register()
    {
        my_frame = this;
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
