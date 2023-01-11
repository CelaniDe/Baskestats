package ui;

import javax.swing.*;

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
        setSize(420, 420);
        setVisible(true);
    }
}
