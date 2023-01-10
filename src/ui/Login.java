package ui;

import dao.ClientDAO;
import dao.ClientDAOImpl;
import model.Account;

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
    JFrame my_frame;

    public Login(){
        setContentPane(panel1);
        my_frame = this;
        setTitle("Login");
        setResizable(false);
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientDAO clientDAO = new ClientDAOImpl();
                Account loggedInAccount = clientDAO.getAccount(usernameText.getText(),passwordText.getText());

                if(loggedInAccount == null)
                {
                    JOptionPane.showMessageDialog(my_frame,
                            "WARNING.",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else if (loggedInAccount.isAccount_type())
                {
                    JFrame frame = new CRUD();
                    dispose();
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
