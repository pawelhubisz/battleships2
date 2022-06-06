package com.example.demo.model;

import com.example.demo.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameAdminTest {

    GameAdmin gameAdmin;
    @BeforeEach
    public void setUp() {
        gameAdmin = new GameAdmin();
        gameAdmin.setFirstBattlefield(new Battlefield(new Player("firstPlayerName")));
        gameAdmin.setSecondBattlefield(new Battlefield(new Player("secondPlayerName")));
    }
    @Test
    void shootShouldReturnWrongPlayer() {
        Status output=gameAdmin.shoot("not existing player name", 1 , 2);
        assertEquals(Status.WRONG_PLAYER, output);
    }
    @Test
    void shootShouldReturnFirstPlayerTrue() {
        gameAdmin.placeShip("secondPlayerName", 1 , 2);
        Status output=gameAdmin.shoot("firstPlayerName", 1 , 2);
        assertEquals(Status.HIT, output);
    }
    @Test
    void shootShouldReturnSecondPlayerTrue() {
        gameAdmin.placeShip("firstPlayerName", 1 , 2);
        Status output=gameAdmin.shoot("secondPlayerName", 1 , 2);
        assertEquals(Status.HIT, output);
    }

}