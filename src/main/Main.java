package main;
import java.util.List;

import DatabaseFakeJson.PlayerCRUD;
import model.Player;
import ui.Login;
import ui.Welcome;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!2");
        JFrame frame = new Login();

        PlayerCRUD players = new PlayerCRUD();
        List<Player> lista = players.getPlayers();
        for(Player player : lista){
            System.out.println(player.getName());
        }
    }
}