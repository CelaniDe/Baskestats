package ui;

import dao.GeneralStatsDAO;
import dao.PlayerDAO;
import model.GeneralStats;
import model.Player;

import javax.swing.*;
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
        setTitle("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);
        setTopScorers();
    }

    public void setTopScorers()
    {
        set1Scorer();
    }

    public void set1Scorer()
    {
        List<GeneralStats> first3ScorersGeneralStats = generalStatsDAO.getTop3GeneralStatsByPointsForPlayer();
        GeneralStats firstScoreGeneralStat = first3ScorersGeneralStats.get(0);
        int id_of_firstScorer = firstScoreGeneralStat.getId();
        Player firstScorer = playerDAO.getPlayerById(id_of_firstScorer);
        System.out.println(id_of_firstScorer);
        System.out.println(firstScorer);
//        for (GeneralStats generalStats : first3ScorersGeneralStats)
//        {
//            System.out.println(generalStats.toStringPlayer());
//        }
//        Player firstScorer = this.playerDAO.getPlayerById(firstScorerGeneralStats.getId());
//        System.out.println(firstScorer);
//        this.Scorer1Label.setText(firstScorer.getName());
    }
}
