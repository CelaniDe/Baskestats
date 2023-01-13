package ui;

import DatabaseFakeJson.GeneralStatsCRUD;
import dao.GeneralStatsDAO;
import dao.GeneralStatsDAOImpl;
import dao.TeamDAO;
import dao.TeamDAOImpl;
import model.GeneralStats;
import model.Team;

import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

public class LeagueStanding extends JFrame {
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Header;
    private JLabel LeagueTitle;
    private JTable LeagueTable;
    private JScrollPane LeagueTablePane;
    private JTable leagueStanding;

    public LeagueStanding()
    {
        setContentPane(Master);
        setTitle("League Standing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);

        TeamDAO teamDAO = new TeamDAOImpl();
        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
        List<Team> teamsList = teamDAO.getTeams();
        String[][] rows2 = new String[teamsList.size()][5];

        GeneralStatsDAO generalStatsDAO = new GeneralStatsDAOImpl();

        int counter = 0;
        for(Team team : teamsList)
        {
            int team_id = team.getId();
            GeneralStats generalStats = generalStatsDAO.getGeneralStatsForTeam(team_id);
            rows2[counter] = new String[]{team.getName(), String.valueOf(generalStats.getNumber_of_matches()), String.valueOf(generalStats.getWins()), String.valueOf(generalStats.getLoses()), String.valueOf(generalStats.getPoints())};
            counter++;
        }

        String columns[] = {"", "N", "W", "L", "P"};

        DefaultTableModel model = new DefaultTableModel(rows2, columns);
        leagueStanding.setModel(model);
    }
}
