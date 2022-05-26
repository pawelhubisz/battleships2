package com.example.demo.controllers;

import com.example.demo.model.GameAdmin;
import com.example.demo.model.Player;
import com.example.demo.service.GameService;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    private GameService gameService = new GameService();
    private final Gson gson = new Gson();

    private String toJson(Object object) {
        return gson.toJson(object);
    }

    @GetMapping("/prepareGame")
    public ResponseEntity prepareGame(String firstPlayerName, String secondPlayerName) {
//        gameAdmin = new GameAdmin();
        //      gameAdmin.getBattlefield().createFieldList();
        //    gameAdmin.setPlayers(new Player(firstPlayerName), new Player(secondPlayerName));
        return createSuccessResponse(toJson(gameService.prepareGame(firstPlayerName, secondPlayerName)));
    }

    @GetMapping("/getAllFields")
    public ResponseEntity getAllFields() {
        //if (gameAdmin == null) {
        //  return "admin is null";
        //}
        return createSuccessResponse(toJson(gameService.getAllFields()));
    }

    @GetMapping("/shoot")
    public ResponseEntity shoot(String playerName, int x, int y) {
//        if (checkIfPlayerNameAlreadyExists(playerName)) {
//            return gameAdmin.shoot(playerName, x, y).toString();
        //}
        //return "wrong name";
        return createSuccessResponse(toJson(gameService.shoot(playerName, x, y)));
    }

    @GetMapping("/ship")
    public ResponseEntity placedShip(String playerName, int x, int y) {
        // if (checkIfPlayerNameAlreadyExists(playerName)) {
        //   return gameAdmin.placeShip(playerName, x, y).toString();
        // }
        //return "wrong name";
        return createSuccessResponse(toJson(gameService.placeShip(playerName, x, y)));
    }

    private ResponseEntity createSuccessResponse(String body) {
        //TODO zmień HttpStatus.OK na coś innego (np. HttpStatus.BAD_REQUEST) i sprawdź co pokazuje Postman - tak samo dla innych wartości
        return new ResponseEntity(body, HttpStatus.OK);
    }


    //TODO metoda do wywalenia z tej klasy i przeniesienia dl GameService
    public boolean checkIfPlayerNameAlreadyExists(String posPlayerName) {
        // return posPlayerName == null || posPlayerName.equals(gameAdmin.getFirstPlayer().getName()) || posPlayerName.equals(gameAdmin.getSecondPlayer().getName());
        return false;
    }
}
