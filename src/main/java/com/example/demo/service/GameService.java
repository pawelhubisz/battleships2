package com.example.demo.service;

import com.example.demo.enums.Status;
import com.example.demo.model.Battlefield;
import com.example.demo.model.Field;
import com.example.demo.model.GameAdmin;

import java.util.List;

public class GameService {

    private GameAdmin gameAdmin;

    public GameAdmin getGameAdmin() {
        return gameAdmin;
    }

    public void setGameAdmin(GameAdmin gameAdmin) {
        this.gameAdmin = gameAdmin;
    }

    public GameAdmin prepareGame(String playerName1, String playerName2) {
        //TODO musisz utworzyc GameAdmina, dodać mu Battlefieldy, Playery itp. i potem return gameAdmin;
        return null;
    }

    public List<Field> getAllFields() {
        return null;
    }

    public Status shoot(String playerName, int x, int y) {
        //TODO wywolaj to z gameAdmin
        return null;
    }

    public Status placeShip(String playerName, int x, int y) {
        //TODO wywolaj to z gameAdmin
        return null;
    }

}
