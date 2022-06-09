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

        //TODO save to database
        //1. Field -> Battlefield
        //2. FieldRepository -> BattlefieldRepository
        //3. FieldService -> BattlefieldService
        //4. FieldServiceImpl -> BattlefieldServiceImpl
        //https://www.geeksforgeeks.org/spring-boot-h2-database/
        //5. DeleteById / DeleteAll
       return gameAdmin;
    }

    public List<Field> getAllFields() {
        return null;
    }

    public Status shoot(String playerName, int x, int y) {
        return gameAdmin.shoot(playerName, x,y);
    }

    public Status placeShip(String playerName, int x, int y) {
        return gameAdmin.placeShip(playerName, x, y);
    }
    public boolean checkIfPlayerNameAlreadyExists(String posPlayerName) {
        // return posPlayerName == null || posPlayerName.equals(gameAdmin.getFirstPlayer().getName()) || posPlayerName.equals(gameAdmin.getSecondPlayer().getName());
        return false;
    }
}
