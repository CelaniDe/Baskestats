package ui;

import dao.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

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

    public Matches() {
        setContentPane(Master);
        setTitle("Matches");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);

        NavHighlights.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Highlights(new GeneralStatsDAOImpl(), new PlayerDAOImpl());
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

       PastButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    MatchDAO matchDAO = new MatchDAOImpl();
                    TeamDAO teamDAO = new TeamDAOImpl();
                   List<model.Match> pastMatches = matchDAO.getPastMatches();

                    String[][] matchesToAdd = new String[pastMatches.size()][1];
                    int counter = 0;
                    for(model.Match pastMatch : pastMatches )
                    {
                        matchesToAdd[counter] = new String[]{
                                String.valueOf(teamDAO.getTeamById(pastMatch.getHome()).getName()),
                                String.valueOf(pastMatch.getDate()),
                                String.valueOf(teamDAO.getTeamById(pastMatch.getAway()).getName())
                        };
                        counter++;
                    }
                    String[] columnNames = {"home","date","away"};
                    DefaultTableModel model = new DefaultTableModel(matchesToAdd,columnNames );
                    MatchesTable.setModel(model);

                }
            }
        });
        PresentButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    MatchDAO matchDAO = new MatchDAOImpl();
                    TeamDAO teamDAO = new TeamDAOImpl();
                    List<model.Match> presentMatches = matchDAO.getTodayMatches();

                    String[][] matchesToAdd = new String[presentMatches.size()][1];
                    int counter = 0;
                    for(model.Match presentMatch : presentMatches )
                    {
                        matchesToAdd[counter] = new String[]{
                                String.valueOf(teamDAO.getTeamById(presentMatch.getHome()).getName()),
                                String.valueOf(presentMatch.getDate()),
                                String.valueOf(teamDAO.getTeamById(presentMatch.getAway()).getName())};
                        counter++;
                    }
                    String[] columnNames = {"home","date","away"};
                    DefaultTableModel model = new DefaultTableModel(matchesToAdd,columnNames );
                    MatchesTable.setModel(model);

                }
            }
        });
        FutureButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    DisplayFutureMatches();

                }
            }
        });

        DisplayFutureMatches();
    }

    private void DisplayFutureMatches() {
        MatchDAO matchDAO = new MatchDAOImpl();
        TeamDAO teamDAO = new TeamDAOImpl();
        List<model.Match> futureMatches = matchDAO.getFutureMatches();

        String[][] matchesToAdd = new String[futureMatches.size()][1];
        int counter = 0;
        for(model.Match futureMatch : futureMatches )
        {
            matchesToAdd[counter] = new String[]{
                    String.valueOf(teamDAO.getTeamById(futureMatch.getHome()).getName()),
                    String.valueOf(futureMatch.getDate()),
                    String.valueOf(teamDAO.getTeamById(futureMatch.getAway()).getName())};
            counter++;
        }
        String[] columnNames = {"home","date","away"};
        DefaultTableModel model = new DefaultTableModel(matchesToAdd,columnNames );
        MatchesTable.setModel(model);
    }
}
