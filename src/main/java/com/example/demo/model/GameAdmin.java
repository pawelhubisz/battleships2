package com.example.demo.model;

import com.example.demo.enums.Status;

public class GameAdmin {

    private FirstBattlefield firstBattlefield;
    private FirstPlayer firstPlayer;
    private SecondPlayer secondPlayer;

    public GameAdmin() {
        firstBattlefield = new FirstBattlefield();
    }

    @Override
    public String toString() {
        return "GameAdmin{}";
    }

    public FirstBattlefield getBattlefield() {
        return firstBattlefield;
    }

    public void setBattlefield(FirstBattlefield firstBattlefield) {
        this.firstBattlefield = firstBattlefield;
    }

    public int getBattlefieldSize() {
        return this.getBattlefield().getFieldList().size();

    }

    public FirstPlayer getFirstPlayer() {
        return firstPlayer;
    }
    public SecondPlayer getSecondPlayer() {
        return secondPlayer;
    }

    public void setFirstPlayer(FirstPlayer firstPlayer) {
        this.firstPlayer = firstPlayer;
    }
    public void setSecondPlayer(SecondPlayer secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Status shoot(String playerName, int x, int y) {
        return firstBattlefield.shoot(x, y);
    }
    public Status placeShip(String playerName, int x, int y) {
        return firstBattlefield.placeShip(x, y);
    }
}
