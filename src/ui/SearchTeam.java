package ui;

import javax.swing.*;

public class SearchTeam extends JFrame {
    private JPanel searchteam;
    private JTextField teamNameTextField;
    private JButton switchToPlayerButton;

    public SearchTeam()
    {
        setContentPane(searchteam);
        setTitle("Search");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(550,550);
        setVisible(true);
    }
}
