package ui;

import javax.swing.*;

public class LeagueStandingpanel extends JFrame {
    private JPanel leaguepanel;

    public LeagueStandingpanel()
    {
        setContentPane(leaguepanel);
        setTitle("League Standings");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
