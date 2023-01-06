package ui;

import javax.swing.*;

public class Welcome extends JFrame
{
    private JPanel panel1;
    private JButton loginButton;
    private JButton createAccountButton;
    private JLabel welcomeText;
    private JLabel loginText;
    private JLabel CreateAccountText;

    public Welcome()
    {
        setContentPane(panel1);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(420,420);
        setVisible(true);
    }
}
