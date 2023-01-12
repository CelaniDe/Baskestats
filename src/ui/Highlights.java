package ui;

import javax.swing.*;

public class Highlights extends JFrame{
    private JPanel Master;
    private JPanel TopScorers;
    private JButton Scorer1Button;
    private JButton Scorer2Button;
    private JButton Scorer3Button;
    private JLabel Scorer1Label;
    private JLabel Scorer2Label;
    private JLabel Scorer3Label;
    private JLabel ScorerTitle;
    private JPanel TopTeams;
    private JPanel TopAssists;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JPanel Navigation;
    private JButton NavNews;
    private JButton Team1Button;
    private JButton Team2Button;
    private JButton Team3Button;
    private JLabel Team1Label;
    private JLabel Team2Label;
    private JLabel Team3Label;
    private JLabel TeamTitle;
    private JButton Assist1Button;
    private JButton Assist2Button;
    private JButton Assist3Button;
    private JLabel Assist1Label;
    private JLabel Assist2Label;
    private JLabel Assist3Label;
    private JLabel AssistTitle;
    private JButton NavHighlights;

    public Highlights(){
        setContentPane(Master);
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
    }
}
