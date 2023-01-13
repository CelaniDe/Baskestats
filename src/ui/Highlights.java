package ui;

import dao.GeneralStatsDAO;
import dao.PlayerDAO;
import model.GeneralStats;
import model.Player;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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

    private GeneralStatsDAO generalStatsDAO;

    private PlayerDAO playerDAO;

    public Highlights(GeneralStatsDAO generalStatsDAO,PlayerDAO playerDAO){
        this.generalStatsDAO = generalStatsDAO;
        this.playerDAO = playerDAO;
        setContentPane(Master);
        setTitle("Highlights");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);
        setTopScorers();
        Scorer1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id_of_firstScorer = getIdOfNTopPlayer(0);
                JFrame jFrame = new PlayerProfile(id_of_firstScorer);
                dispose();
            }
        });
        Scorer2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id_of_firstScorer = getIdOfNTopPlayer(1);
                JFrame jFrame = new PlayerProfile(id_of_firstScorer);
                dispose();
            }
        });
        Scorer3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id_of_firstScorer = getIdOfNTopPlayer(2);
                JFrame jFrame = new PlayerProfile(id_of_firstScorer);
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
        NavMatch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new Matches();
                dispose();
            }
        });
    }

    public void setTopScorers()
    {
        set1Scorer();
        set2Scorer();
        set3Scorer();
    }

    public void set1Scorer()
    {

        int id_of_firstScorer = getIdOfNTopPlayer(0);
        Player firstScorer = playerDAO.getPlayerById(id_of_firstScorer);
        this.Scorer1Label.setText(firstScorer.getName());
        ImageIcon playerIcon = new ImageIcon("src/img/"+id_of_firstScorer+".jpeg");
        this.Scorer1Button.setIcon(playerIcon);
    }

    public void set2Scorer()
    {
        int id_of_firstScorer = getIdOfNTopPlayer(1);
        Player firstScorer = playerDAO.getPlayerById(id_of_firstScorer);
        this.Scorer2Label.setText(firstScorer.getName());
        ImageIcon playerIcon = new ImageIcon("src/img/"+id_of_firstScorer+".jpeg");
        this.Scorer2Button.setIcon(playerIcon);
    }

    public void set3Scorer()
    {
        int id_of_firstScorer = getIdOfNTopPlayer(2);
        Player firstScorer = playerDAO.getPlayerById(id_of_firstScorer);
        this.Scorer3Label.setText(firstScorer.getName());
        ImageIcon playerIcon = new ImageIcon("src/img/"+id_of_firstScorer+".jpeg");
        this.Scorer3Button.setIcon(playerIcon);
    }

    public int getIdOfNTopPlayer(int n)
    {
        List<GeneralStats> first3ScorersGeneralStats = generalStatsDAO.getTop3GeneralStatsByPointsForPlayer();
        GeneralStats firstScoreGeneralStat = first3ScorersGeneralStats.get(n);
        int id_of_firstScorer = firstScoreGeneralStat.getId();
        return id_of_firstScorer;
    }
}
