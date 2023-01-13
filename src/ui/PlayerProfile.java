package ui;

import javax.swing.*;

public class PlayerProfile extends JFrame {
    private JPanel Master;
    private JPanel Header;
    private JButton PlayerPhotoButton;
    private JLabel PlayerProfileTitle;
    private JLabel PlayerName;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Mid;
    private JLabel PointsInfo;
    private JLabel AssistInfo;
    private JLabel ShotsInfo;
    private JLabel PlayerTeam;

    public PlayerProfile()
    {
        setContentPane(Master);
        setTitle("PlayerProfile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
    }
}
