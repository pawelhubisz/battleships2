package com.example.demo.controllers;

import com.example.demo.model.GameAdmin;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;


class GameControllerTest {

    GameController gameController;

    @BeforeEach
    public void setUp(){
        gameController=new GameController();
    }

    @Test
    void checkIfPlayerNameAlreadyExistsShouldReturnTrueNull() {
       // assertTrue(gameController.checkIfPlayerNameAlreadyExists(null));
    }
    @Test
    void checkIfPlayerNameAlreadyExistsShouldReturnTrueFirstPlayerExists() {
       // gameController.prepareGame("Player Name 1", "Player Name 2");
        //assertTrue(gameController.checkIfPlayerNameAlreadyExists("Player Name 1"));
    }
    @Test
    void checkIfPlayerNameAlreadyExistsShouldReturnTrueSecondPlayerExists() {
     //   gameController.prepareGame("Player Name 1", "Player Name 2");
       // assertTrue(gameController.checkIfPlayerNameAlreadyExists("Player Name 2"));
    }
    @Test
    void checkIfPlayerNameAlreadyExistsShouldReturnFalse() {
       // gameController.prepareGame("Player Name 1", "Player Name 2");
      //  assertFalse(gameController.checkIfPlayerNameAlreadyExists("Player Name 3"));
    }

}