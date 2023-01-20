package main;
import java.util.List;

import DatabaseFakeJson.GeneralStatsCRUD;
import DatabaseFakeJson.PlayerCRUD;
import DatabaseFakeJson.TeamCRUD;
import dao.GeneralStatsDAOImpl;
import dao.PlayerDAOImpl;
import model.GeneralStats;
import model.Player;
import model.Team;
import ui.*;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame1 = new WelcomeScreen();
    }
}