package ui;

import javax.swing.*;

public class TeamProfile extends JFrame {
    private JPanel Master;
    private JPanel Content;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JLabel TeamProfileTitle;
    private JPanel Header;
    private JButton TeamLogoButton;
    private JLabel TeamName;
    private JPanel Mid;
    private JLabel TeamSlogan;
    private JLabel GamesPlayed;
    private JLabel Wins;
    private JTable TeamPlayersTable;
    private JScrollPane PlayerTablePane;

    public TeamProfile() {
        setContentPane(Master);
        setTitle("Team Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 800);
        setVisible(true);
    }
}
