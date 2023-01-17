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
        //System.out.println("Hello world!2");
        JFrame frame1 = new Highlights(new GeneralStatsDAOImpl(), new PlayerDAOImpl());

        GeneralStatsCRUD generalStatsCRUD = new GeneralStatsCRUD();
        for(GeneralStats generalStats : generalStatsCRUD.getTop3GeneralStatsByWinsForTeams())
        {
            System.out.println(generalStats.toStringTeam());
        }
    }
}