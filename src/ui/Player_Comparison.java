package ui;

import javax.swing.*;

public class Player_Comparison extends JFrame{
    private JPanel playerCompPanel;
    private JLabel playerCompLabel;
    private JLabel vsLabel;
    private JLabel firstPlayerImg;
    private JLabel secondPlayerImg;
    private JLabel playerNameLabel1;
    private JLabel playerNameLabel2;
    private JLabel gamesPlayedLabel1;
    private JLabel gamesPlayedLabel2;
    private JLabel totalPointsLabel1;
    private JLabel totalPointsLabel2;
    private JLabel drebLabel1;
    private JLabel drebLabel2;
    private JLabel orebLabel1;
    private JLabel orebLabel2;
    private JLabel assistsLabel1;
    private JLabel assistsLabel2;
    private JLabel separator1;
    private JLabel separator2;
    private JLabel separator3;
    private JLabel separator4;
    private JLabel separator5;

    public Player_Comparison() {
        setContentPane(playerCompPanel);
        setTitle("Player Comparison");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setVisible(true);
    }
}
