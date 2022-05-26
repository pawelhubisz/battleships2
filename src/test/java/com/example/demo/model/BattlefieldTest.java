package com.example.demo.model;

import com.example.demo.controllers.GameController;
import com.example.demo.enums.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattlefieldTest {

    Battlefield battlefield;

    @BeforeEach
    public void setUp() {
        battlefield = new Battlefield();
        battlefield.createFieldList();
    }


    @Test
    void createFieldList() {
        //uruchom createFieldList i sprawdz sume elementow w liscie getFieldList
    }

    //@Test
    //void testShootShouldReturnWrongCoordinates() {
    //utworz fieldList, uruchom shoot i sprawdz czy zwraca kazdy status
    //}

    @Test
    void shootShouldReturnWrongCoordinates() {
        Status output = battlefield.shoot(1, 50);
        assertEquals(Status.WRONG_COORDINATES, output);
    }

    @Test
    void shootShouldReturnHit() {
        battlefield.placeShip(1, 2);
        Status output = battlefield.shoot(1, 2);
        assertEquals(Status.HIT, output);
        assertTrue(getFieldsByCoordinates(1, 2).isShipPlaced());
    }

    private Field getFieldsByCoordinates(int x, int y) {
     for(Field field: battlefield.getFieldList()){

         if(field.checkIfCoordinatesEquals(x, y)){
             return field;
         }
     }
        return null;
     //1,2,3,4,5,6,7,8,9
    }

    @Test
    void shootShouldReturnMiss() {
        Status output = battlefield.shoot(1, 3);
        assertEquals(Status.MISS, output);

    }

    @Test
    void shootShouldReturnAlreadyShot() {
        battlefield.shoot(1, 3);
        Status output = battlefield.shoot(1, 3);
        assertEquals(Status.ALREADY_SHOT, output);
    }

    @Test
    void placeShipShouldReturnWrongCoordinates() {
        Status output = battlefield.placeShip(1, 39);
        assertEquals(Status.WRONG_COORDINATES, output);
        assertNull(getFieldsByCoordinates(1,39));
    }

    @Test
    void placeShipShouldReturnShipPlaced() {
        Status output = battlefield.placeShip(1, 3);
        assertEquals(Status.SHIP_PLACED, output);
    }

    @Test
    void placeShipShouldReturnCantPlaceShip() {
        battlefield.placeShip(1, 3);
        Status output = battlefield.placeShip(1, 3);
        assertEquals(Status.CANT_PLACE_SHIP, output);
    }
}