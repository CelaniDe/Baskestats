package ui;

import javax.swing.*;

public class Team_Profile extends JFrame{
    private JPanel teamProfilePanel;
    private JLabel teamprofileLabel;
    private JLabel teamImg;
    private JLabel teamNameLabel;
    private JButton compareButton;
    private JLabel teamSloganLabel;
    private JLabel gamesPLayedLabel;
    private JLabel winsLabel;
    private JLabel playersLabel;
    private JLabel firstPlayerImg;
    private JLabel secondPlayerImg;
    private JLabel thirdPlayerImg;
    private JLabel fourthPlayerImg;
    private JLabel fifthPlayerImg;
    private JLabel firstNameLabel;
    private JLabel secondNameLabel;
    private JLabel thirdNameLabel;
    private JLabel fourthNameLabel;
    private JLabel fifthNameLabel;

    public Team_Profile() {
        setContentPane(teamProfilePanel);
        setTitle("Team profile");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,500);
        setVisible(true);
    }
}
