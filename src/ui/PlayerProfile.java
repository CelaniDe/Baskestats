package ui;

import dao.*;
import model.GeneralStats;
import model.Player;
import model.Team;

import java.util.List;

import javax.swing.*;

public class PlayerProfile extends JFrame {
    private JPanel Master;
    private JPanel Header;
    private JButton PlayerPhotoButton;
    private JLabel PlayerProfileTitle;
    private JLabel PlayerName;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Mid;
    private JLabel Info1;
    private JLabel Info2;
    private JLabel Info3;
    private JLabel Info4;
    private JLabel Info5;
    private JLabel PlayerTeam;

    public PlayerProfile(int player_id)
    {
        setContentPane(Master);
        setTitle("PlayerProfile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 1000);
        setVisible(true);

        PlayerDAO playerDao = new PlayerDAOImpl();
        Player player = playerDao.getPlayerById(player_id);
        PlayerName.setText(player.getName());
        TeamDAO teamDAO = new TeamDAOImpl();
        Team team = teamDAO.getTeamById(player.getTeam_id());
        PlayerTeam.setText(team.getName());
        Info1.setText(Info1.getText() + " " + player.getAge());
        Info2.setText(Info2.getText() + " " + player.getHeight());
        Info3.setText(Info3.getText() + " " + player.getNationality());
        GeneralStatsDAO generalStatsDAO = new GeneralStatsDAOImpl();
        GeneralStats playerStats = generalStatsDAO.getGeneralStatsForPlayer(player_id);
        Info4.setText(Info4.getText() + " " + playerStats.getPoints());
        Info5.setText(Info5.getText() + " " + playerStats.getAssists());

        PlayerPhotoButton.setIcon(new ImageIcon("src/img/"+ player_id + ".jpeg"));
    }
}
