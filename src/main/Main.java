package main;
import java.util.List;

import DatabaseFakeJson.PlayerCRUD;
import DatabaseFakeJson.TeamCRUD;
import dao.GeneralStatsDAOImpl;
import dao.PlayerDAOImpl;
import model.Player;
import model.Team;
import ui.*;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!2");
        //JFrame jFrame = new Highlights(new GeneralStatsDAOImpl(), new PlayerDAOImpl());
        JFrame frame1= new Matches();
    }
}