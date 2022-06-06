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
        gameAdmin.setFirstBattlefield(new Battlefield(new Player(firstPlayerName)));
        gameAdmin.setSecondBattlefield(new Battlefield(new Player(secondPlayerName)));
        //TODO musisz utworzyc GameAdmina, dodać mu Battlefieldy, Playery itp. i potem return gameAdmin;
        return gameAdmin;
    }

    public List<Field> getAllFields() {
        return null;
    }

    public Status shoot(String playerName, int x, int y) {
        //TODO wywolaj to z gameAdmin
        gameAdmin.shoot("playerName", 1,2);
        return null;
    }

    public Status placeShip(String playerName, int x, int y) {
        //TODO wywolaj to z gameAdmin
        gameAdmin.placeShip("playerName", 1, 2);
        return null;
    }
    public boolean checkIfPlayerNameAlreadyExists(String posPlayerName) {
        // return posPlayerName == null || posPlayerName.equals(gameAdmin.getFirstPlayer().getName()) || posPlayerName.equals(gameAdmin.getSecondPlayer().getName());
        return false;
    }
}
