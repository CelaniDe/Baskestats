package ui;

import javax.swing.*;

public class Matches extends  JFrame {
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JLabel MatchesTitle;
    private JPanel Header;
    private JPanel Mid;
    private JButton PastButton;
    private JButton PresentButton;
    private JButton FutureButton;
    private JButton Team2ImgButton;
    private JButton Team1ImgButton;
    private JLabel MatchInfoLabel;

    public Matches()
    {
        setContentPane(Master);
        setTitle("Matches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
    }
}