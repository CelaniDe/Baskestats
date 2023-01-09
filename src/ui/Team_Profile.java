package ui;

import javax.swing.*;

public class Team_Profile extends JFrame{
    private JPanel teamProfilePanel;
    private JLabel teamlabel;
    private JLabel teamImg;
    private JButton compareButton;
    private JLabel nameLabel;
    private JLabel starImg;
    private JLabel sloganLabel;
    private JLabel gamesLabel;
    private JLabel winsLabel;
    private JLabel playersLabel;
    private JLabel player1Img;
    private JLabel player2Img;
    private JLabel player3Img;
    private JLabel name3Label;
    private JLabel name1Label;
    private JLabel name2Label;
    private JLabel player4Img;
    private JLabel name4Label;

    public Team_Profile() {
        setContentPane(teamProfilePanel);
        setTitle("Team profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
