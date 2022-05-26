package com.example.demo.controllers;

import com.example.demo.model.GameAdmin;
import com.example.demo.model.Player;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private GameAdmin gameAdmin;
    private final Gson gson = new Gson();

    @GetMapping("/prepareGame")
    public String prepareGame(String firstPlayerName, String secondPlayerName) {
        gameAdmin = new GameAdmin();
        gameAdmin.getBattlefield().createFieldList();
        gameAdmin.setPlayers(new Player(firstPlayerName), new Player(secondPlayerName));


        return gson.toJson(gameAdmin);
    }

    @GetMapping("/getAllFields")
    public String getAllFields() {
        if (gameAdmin == null) {
            return "admin is null";
        }
        return gson.toJson(gameAdmin.getBattlefield().getFieldList());
    }

    @GetMapping("/shoot")
    public String shoot(String playerName, int x, int y) {
        if (checkIfPlayerNameAlreadyExists(playerName)) {
            return gameAdmin.shoot(playerName, x, y).toString();
        }
        return "wrong name";
    }
    @GetMapping("/ship")
    public String placedShip(String playerName, int x, int y) {
        if (checkIfPlayerNameAlreadyExists(playerName)) {
            return gameAdmin.placeShip(playerName, x, y).toString();
        }
        return "wrong name";
    }

    public GameAdmin getGameAdmin() {
        return gameAdmin;
    }

    public void setGameAdmin(GameAdmin gameAdmin) {
        this.gameAdmin = gameAdmin;
    }
    public boolean checkIfPlayerNameAlreadyExists(String posPlayerName){
       return posPlayerName == null || posPlayerName.equals(gameAdmin.getFirstPlayer().getName()) || posPlayerName.equals(gameAdmin.getSecondPlayer().getName());
    }
}
