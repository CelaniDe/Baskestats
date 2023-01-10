package ui;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class LeagueStandingpanel extends JFrame {
    private JPanel leaguepanel;
    private JTable leagueStanding;

    public static void main(String[] argv) throws Exception {
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable leagueStanding = new JTable(tableModel);
        tableModel.addColumn("Team Name");
        tableModel.addColumn("Games");
        tableModel.addColumn("Wins");
        tableModel.addColumn("Loses");
        tableModel.addColumn("Points");
        tableModel.insertRow(0, new Object[]{"Golden State Warriors"});
        tableModel.insertRow(0, new Object[]{"Boston Celtiks"});
        tableModel.insertRow(0, new Object[]{"Chicago Bulls"});
        tableModel.insertRow(0, new Object[]{"LA Lakers"});
        tableModel.insertRow(0, new Object[]{"Toronto Raptors"});
        tableModel.insertRow(1, new Object[]{"10"});
        tableModel.insertRow(1, new Object[]{"10"});
        tableModel.insertRow(1, new Object[]{"10"});
        tableModel.insertRow(1, new Object[]{"10"});
        tableModel.insertRow(1, new Object[]{"10"});
        tableModel.insertRow(2, new Object[]{"9"});
        tableModel.insertRow(2, new Object[]{"8"});
        tableModel.insertRow(2, new Object[]{"6"});
        tableModel.insertRow(2, new Object[]{"5"});
        tableModel.insertRow(2, new Object[]{"4"});
        tableModel.insertRow(3, new Object[]{"1"});
        tableModel.insertRow(3, new Object[]{"2"});
        tableModel.insertRow(3, new Object[]{"4"});
        tableModel.insertRow(3, new Object[]{"5"});
        tableModel.insertRow(3, new Object[]{"6"});
        tableModel.insertRow(4, new Object[]{"55"});
        tableModel.insertRow(4, new Object[]{"50"});
        tableModel.insertRow(4, new Object[]{"40"});
        tableModel.insertRow(4, new Object[]{"35"});
        tableModel.insertRow(4, new Object[]{"30"});
    }

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
