package ui;

import dao.GeneralStatsDAOImpl;
import dao.PlayerDAOImpl;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JScrollPane TablePane;
    private JTable MatchesTable;
    private JRadioButton PastButton;
    private JRadioButton PresentButton;
    private JRadioButton FutureButton;

    public Matches()
    {
        setContentPane(Master);
        setTitle("Matches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);

        NavHighlights.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Highlights(new GeneralStatsDAOImpl(),new PlayerDAOImpl());
                dispose();
            }
        });

        NavNews.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new News();
                dispose();
            }
        });
        NavSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Search();
                dispose();
            }
        });
        NavLeague.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new LeagueStanding();
                dispose();
            }
        });
    }
}
