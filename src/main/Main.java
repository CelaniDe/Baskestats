package main;
import java.util.List;

import DatabaseFakeJson.PlayerCRUD;
import DatabaseFakeJson.TeamCRUD;
import model.Player;
import model.Team;
import ui.Login;
import ui.Welcome;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!2");
        JFrame frame = new Welcome();


        PlayerCRUD players = new PlayerCRUD();
        List<Player> lista = players.getPlayers();
        for(Player player : lista){
            System.out.println(player.getName());
        }

        TeamCRUD teams = new TeamCRUD();
        List<Team> lista2 = teams.getTeams();
        for(Team team : lista2){
            System.out.println(team.getName());
        }

    }
}