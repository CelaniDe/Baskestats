package ui;

import javax.swing.*;

public class PlayerProfile extends JFrame {
    private JPanel playerProfile;
    private JButton compareButton;

    public PlayerProfile()
    {
        setContentPane(playerProfile);
        setTitle("Player Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(550,550);
        setVisible(true);
    }
}
