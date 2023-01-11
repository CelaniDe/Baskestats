package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame
{
    private JPanel panel1;
    private JButton LoginButton;
    private JButton CreateAccountButton;

    public Welcome()
    {
        setContentPane(panel1);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(420,420);
        setVisible(true);
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new Login();
                dispose();

            }
        });

        CreateAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new Register();
                dispose();
            }
        });
    }
}
