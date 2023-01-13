package ui;

import dao.GeneralStatsDAO;
import dao.GeneralStatsDAOImpl;
import dao.TeamDAO;
import dao.TeamDAOImpl;
import model.GeneralStats;
import model.Team;

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

    public TeamProfile(int team_id) {
        setContentPane(Master);
        setTitle("Team Profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);

        TeamDAO teamDAO = new TeamDAOImpl();
        Team selectedTeam = teamDAO.getTeamById(team_id);
        TeamName.setText(selectedTeam.getName());
        GeneralStatsDAO generalStatsDAO = new GeneralStatsDAOImpl();
        GeneralStats teamStats = generalStatsDAO.getGeneralStatsForTeam(team_id);
        GamesPlayed.setText(GamesPlayed.getText() + " " + teamStats.getNumber_of_matches());
        Wins.setText(Wins.getText() + " " + teamStats.getWins());
        TeamLogoButton.setIcon(new ImageIcon("src/img/teams/" + team_id + ".jpeg"));
    }
}
