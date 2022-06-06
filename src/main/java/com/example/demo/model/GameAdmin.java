package com.example.demo.model;

import com.example.demo.enums.Status;

public class GameAdmin {
    private Battlefield firstBattlefield;
    private Battlefield secondBattlefield;

    public GameAdmin() {
        //firstBattlefield = new Battlefield();
        //firstBattlefield = new Battlefield();
    }

    public Battlefield getFirstBattlefield() {
        return firstBattlefield;
    }

    public void setFirstBattlefield(Battlefield firstBattlefield) {
        this.firstBattlefield = firstBattlefield;
    }

    public Battlefield getSecondBattlefield() {
        return secondBattlefield;
    }

    public void setSecondBattlefield(Battlefield secondBattlefield) {
        this.secondBattlefield = secondBattlefield;
    }

    @Override
    public String toString() {
        return "GameAdmin{}";
    }


    public Status shoot(String playerName, int x, int y) {
        if (firstBattlefield.equalsPlayerName(playerName)) {
            return firstBattlefield.shoot(x, y);
        }
        if (secondBattlefield.equalsPlayerName(playerName)) {
            return secondBattlefield.shoot(x, y);
        }
        return Status.WRONG_PLAYER;
    }

    public Status placeShip(String playerName, int x, int y) {
        if (firstBattlefield.equalsPlayerName(playerName)) {
            return secondBattlefield.placeShip(x, y);
        }
        if (secondBattlefield.equalsPlayerName(playerName)) {
            return firstBattlefield.placeShip(x, y);
        }
        return Status.WRONG_PLAYER;
        //return battlefield.placeShip(x, y);
    }


}
