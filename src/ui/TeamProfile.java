package ui;

import javax.swing.*;

public class TeamProfile extends JFrame {
    private JPanel Master;
    private JPanel Content;
    private JPanel Header;
    private JPanel Mid;
    private JLabel GamesPlayed;
    private JLabel Wins;
    private JTable TeamPlayersTable;
    private JScrollPane PlayerTablePane;
    private JPanel ImgPanel;
    private JButton TeamImgButton;
    private JPanel TeamTitle;
    private JLabel TeamTitleLabel;
    private JLabel TeamNameLabel;
    private JLabel TeamSloganLabel;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;

    public TeamProfile() {
        setContentPane(Master);
        setTitle("Team Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);
    }
}
