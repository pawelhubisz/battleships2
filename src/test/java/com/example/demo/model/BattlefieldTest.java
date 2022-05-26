package com.example.demo.model;

import com.example.demo.controllers.GameController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattlefieldTest {

    GameController gameController;
    GameAdmin gameAdmin;
    @BeforeEach
    public void setUp(){
        gameController=new GameController();
        gameAdmin= new GameAdmin();
        gameController.getAllFields();
      //  gameController.placedShip("Player Name 1", 1 ,2);
    }



    @Test
    void createFieldList() {
        //uruchom createFieldList i sprawdz sume elementow w liscie getFieldList
    }

    @Test
    void testShootShouldReturnWrongCoordinates() {
        //utworz fieldList, uruchom shoot i sprawdz czy zwraca kazdy status
    }
    @Test
    void shootShouldReturnWrongCoordinates() {
        gameController.prepareGame("Player Name 1", "Player Name 2");
        assertFalse(Boolean.parseBoolean(gameController.shoot("Player Name 1", 1 ,5)));
    }

    @Test
    void shootShouldReturnHit() {
        gameController.prepareGame("Player Name 1", "Player Name 2");
        assertFalse(Boolean.parseBoolean(gameController.shoot("Player Name 1", 1 ,2)));
    }


    @Test
    void placeShip() {
    }
}