package ui;

import dao.*;
import model.Player;
import model.Team;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Search extends JFrame {
    private JPanel Master;
    private JPanel Navigation;
    private JButton NavMatch;
    private JButton NavLeague;
    private JButton NavSearch;
    private JButton NavNews;
    private JButton NavHighlights;
    private JPanel Header;
    private JLabel SearchTitle;
    private JTextField InputField;
    private JComboBox SearchChoiceBox;
    private JTable ResultsTable;
    private JScrollPane TablePane;

    private PlayerDAO playerDAO;
    private TeamDAO teamDAO;

    public Search() {
        this.teamDAO = new TeamDAOImpl();
        this.playerDAO = new PlayerDAOImpl();
        setContentPane(Master);
        setTitle("Search");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(1000, 800);
        setVisible(true);
        setActionListenersOnMenuButtons();
        fillComboBox();

        SearchChoiceBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object selectedItem = SearchChoiceBox.getSelectedItem();
                if(SearchChoiceBox.getSelectedItem().toString().equals("Players"))
                    updateTableForPlayersBasedOnInputText();
                else
                    updateTableForTeamsBasedOnInputText();

            }
        });

        if(SearchChoiceBox.getSelectedItem().toString().equals("Players"))
            updateTableForPlayersBasedOnInputText();
        else
            updateTableForTeamsBasedOnInputText();



        InputField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                if(SearchChoiceBox.getSelectedItem().toString().equals("Players"))
                    updateTableForPlayersBasedOnInputText();
                else
                    updateTableForTeamsBasedOnInputText();
            }
            public void removeUpdate(DocumentEvent e) {
                if(SearchChoiceBox.getSelectedItem().toString().equals("Players"))
                    updateTableForPlayersBasedOnInputText();
                else
                    updateTableForTeamsBasedOnInputText();
            }
            public void insertUpdate(DocumentEvent e) {
                if(SearchChoiceBox.getSelectedItem().toString().equals("Players"))
                    updateTableForPlayersBasedOnInputText();
                else
                    updateTableForTeamsBasedOnInputText();
            }
        });

    }

    private void updateTableForTeamsBasedOnInputText() {
        List<Team> teams = teamDAO.getTeams(InputField.getText());
        String[][] data = new String[teams.size()][1];
        int counter = 0;
        for(Team currentTeam : teams)
        {
            data[counter] = new String[]{currentTeam.getName()};
            counter++;
        }

        String[] columnNames = { "Name" };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        ResultsTable.setModel(model);
    }

    private void updateTableForPlayersBasedOnInputText() {
        List<Player> players = playerDAO.getPlayers(InputField.getText());
        String[][] data = new String[players.size()][1];
        int counter = 0;
        for(Player currentTeam : players)
        {
            data[counter] = new String[]{currentTeam.getName()};
            counter++;
        }

        String[] columnNames = { "Name" };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        ResultsTable.setModel(model);
    }

    private void fillComboBox()
    {
        String[] items = {"Players", "Teams"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(items);
        SearchChoiceBox.setModel(model);
    }

    private void setActionListenersOnMenuButtons()
    {
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
}
