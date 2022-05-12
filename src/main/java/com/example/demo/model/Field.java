package com.example.demo.model;

public class Field {
    private int x;
    private int y;
    private boolean isShipPlaced;
    private boolean isShot;


    public Field(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public boolean checkIfCoordinatesEquals(int posX, int posY) {
        return posX == this.getX() && posY == this.getY();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isShipPlaced() {
        return isShipPlaced;
    }

    public void setShipPlaced(boolean shipPlaced) {
        isShipPlaced = shipPlaced;
    }

    public boolean isShot() {
        return isShot;
    }

    public void setShot(boolean shot) {
        isShot = shot;
    }
}
