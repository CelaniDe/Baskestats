package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen extends JFrame{
    private JPanel Master;
    private JPanel ImgPanel;
    private JPanel LoginCreatePanel;
    private JPanel LoginPanel;
    private JPanel CreatePanel;
    private JButton ImgButton;
    private JButton LoginButton;
    private JLabel LoginPrompt;
    private JLabel WelcomePrompt;
    private JButton CreateAccountButton;
    private JLabel CreatePrompt;

    public WelcomeScreen() {
        setContentPane(Master);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
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
