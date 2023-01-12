package main;
import java.util.List;

import DatabaseFakeJson.GeneralStatsCRUD;
import DatabaseFakeJson.NewsCRUD;
import DatabaseFakeJson.PlayerCRUD;
import DatabaseFakeJson.TeamCRUD;
import model.GeneralStats;
import model.Player;
import model.Team;
import ui.*;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!2");
        JFrame frame = new LeagueStandingpanel();

//        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
//        GeneralStats generalStats = generalStatsCRUD.getGeneralStatsForTeam(0);
//        System.out.println(generalStats);
    }
}