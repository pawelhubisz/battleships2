package com.example.demo.model;

import com.example.demo.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class SecondBattlefield {

    private List<Field> fieldList;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    public SecondBattlefield() {
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
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
            if (field.checkIfCoordinatesEquals(x,y)) {
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
            if (field.checkIfCoordinatesEquals(x,y)) {
                if (field.isShipPlaced()) {
                    return Status.CANT_PLACE_SHIP;
                }
                field.setShipPlaced(true);
                return Status.SHIP_PLACED;
            }
        }
        return Status.WRONG_COORDINATES;
    }
}
