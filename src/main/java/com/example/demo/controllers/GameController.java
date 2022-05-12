package com.example.demo.controllers;

import com.example.demo.model.GameAdmin;
import com.example.demo.model.Player;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private GameAdmin gameAdmin;
    private Gson gson = new Gson();

    @GetMapping("/prepareGame")
    public String prepareGame(String playerName) {
        gameAdmin = new GameAdmin();
        gameAdmin.getBattlefield().createFieldList();
        gameAdmin.setPlayer(new Player(playerName));

        return "created game with " + getGameAdmin().getBattlefieldSize() + " fields and player with name: " + getGameAdmin().getPlayer().getName();
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
        if (checkForName(playerName)) {
            return "wrong name";
        }
        return gameAdmin.shoot(playerName, x, y).toString();
    }
    @GetMapping("/ship")
    public String placedShip(String playerName, int x, int y) {
        if (checkForName(playerName)) {
            return "wrong name";
        }
        return gameAdmin.placeShip(playerName, x, y).toString();
    }

    public GameAdmin getGameAdmin() {
        return gameAdmin;
    }

    public void setGameAdmin(GameAdmin gameAdmin) {
        this.gameAdmin = gameAdmin;
    }
    private boolean checkForName(String posPlayerName){
        return posPlayerName == null || !posPlayerName.equals(gameAdmin.getPlayer().getName());

    }
}
