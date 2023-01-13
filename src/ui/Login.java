package ui;

import dao.ClientDAO;
import dao.ClientDAOImpl;
import model.Account;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel Master;
    private JLabel LoginTitle;
    private JTextField UsernameField;
    private JPasswordField PasswordField;
    private JButton LoginButton;
    private JLabel UsernamePrompt;
    private JLabel PasswordPrompt;
    private JTextField usernameTextField;
    private JPasswordField passwordPasswordField;
    private JButton loginButton;
    JFrame my_frame;

    public Login(){
        setContentPane(Master);
        my_frame = this;
        setTitle("Login");
        setResizable(false);
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClientDAO clientDAO = new ClientDAOImpl();
                Account loggedInAccount = clientDAO.getAccount(UsernameField.getText(),PasswordField.getText());

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
