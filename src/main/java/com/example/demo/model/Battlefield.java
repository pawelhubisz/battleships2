package com.example.demo.model;

import com.example.demo.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Battlefield {

    private Player player;
    private List<Field> fieldList;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Battlefield(Player player) {
        this.player = player;
        createFieldList();
    }

    public List<Field> getFieldList() {
        return fieldList;
    }


    public void createFieldList() {
        fieldList = new ArrayList<>();
        for (int i = 1; i < ROWS + 1; i++) {
            for (int j = 1; j < COLUMNS + 1; j++) {
                fieldList.add(new Field(i, j));

            }

        }
    }

    public Status shoot(int x, int y) {
        for (Field field : fieldList) {
            if (field.checkIfCoordinatesEquals(x, y)) {
                if (field.isShot()) {
                    return Status.ALREADY_SHOT;
                }
                field.setShot(true);
                if (field.isShipPlaced()) {
                    return Status.HIT;
                }
                return Status.MISS;
            }
        }
        return Status.WRONG_COORDINATES;
    }

    public Status placeShip(int x, int y) {
        for (Field field : fieldList) {
            if (field.checkIfCoordinatesEquals(x, y)) {
                if (field.isShipPlaced()) {
                    return Status.CANT_PLACE_SHIP;
                }
                field.setShipPlaced(true);
                return Status.SHIP_PLACED;
            }
        }
        return Status.WRONG_COORDINATES;
    }
    public boolean equalsPlayerName(String playerName){
      return playerName!=null&&playerName.equals(getPlayer().getName());
    }
}
