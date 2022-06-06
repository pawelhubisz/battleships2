package com.example.demo.service;

import com.example.demo.enums.Status;
import com.example.demo.model.Battlefield;
import com.example.demo.model.Field;
import com.example.demo.model.GameAdmin;
import com.example.demo.model.Player;

import java.util.List;

public class GameService {

    private GameAdmin gameAdmin;

    public GameAdmin getGameAdmin() {
        return gameAdmin;
    }

    public void setGameAdmin(GameAdmin gameAdmin) {
        this.gameAdmin = gameAdmin;
    }


    public GameAdmin prepareGame(String firstPlayerName, String secondPlayerName) {
        gameAdmin=new GameAdmin();
        gameAdmin.setFirstBattlefield(new Battlefield(new Player(firstPlayerName)));
        gameAdmin.setSecondBattlefield(new Battlefield(new Player(secondPlayerName)));
        gameAdmin.getFirstBattlefield().createFieldList();
        gameAdmin.getSecondBattlefield().createFieldList();
       return gameAdmin;
    }

    public List<Field> getAllFields() {
        return null;
    }

    public Status shoot(String playerName, int x, int y) {
        return gameAdmin.shoot(playerName, 1,2);
    }

    public Status placeShip(String playerName, int x, int y) {
        return gameAdmin.placeShip(playerName, 1, 2);
    }
    public boolean checkIfPlayerNameAlreadyExists(String posPlayerName) {
        // return posPlayerName == null || posPlayerName.equals(gameAdmin.getFirstPlayer().getName()) || posPlayerName.equals(gameAdmin.getSecondPlayer().getName());
        return false;
    }
}
