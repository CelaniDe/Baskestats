package ui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class LeagueStandingpanel extends JFrame {
    private JPanel leaguepanel;
    private JTable leagueStanding;
    private JLabel leagueStandingLabel;

    public LeagueStandingpanel()
    {
        setContentPane(leaguepanel);
        setTitle("League Standings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);

        String rows[][] = {
                {"Chicago Bulls", "0", "0", "0", "0"},  {"Los Angeles Lakers", "0", "0", "0", "0"}, {"Boston Celtics", "0", "0", "0", "0"},
                {"Miami Heat", "0", "0", "0", "0"}, {"San Antonio Spurs", "0", "0", "0", "0"}, {"Aris", "0", "0", "0", "0"},
                {"Iraklis", "0", "0", "0", "0"},
        };

        String columns[] = {"", "N", "W", "L", "P"};

        DefaultTableModel model = new DefaultTableModel(rows, columns);
        leagueStanding.setModel(model);
    }
}
