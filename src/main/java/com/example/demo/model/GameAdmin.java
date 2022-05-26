package com.example.demo.model;

import com.example.demo.enums.Status;

public class GameAdmin {

    private Battlefield battlefield;
    private Player secondPlayer;
    private Player firstPlayer;

    public GameAdmin() {
        battlefield = new Battlefield();
    }

    @Override
    public String toString() {
        return "GameAdmin{}";
    }

    public Battlefield getBattlefield() {
        return battlefield;
    }

    public void setBattlefield(Battlefield battlefield) {
        this.battlefield = battlefield;
    }

    public int getBattlefieldSize() {
        return this.getBattlefield().getFieldList().size();

    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(Player secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(Player firstPlayer) {
        this.firstPlayer = firstPlayer;
    }
    public void setPlayers(Player firstPlayer, Player secondPlayer) {
        setFirstPlayer(firstPlayer);
        setSecondPlayer(secondPlayer);
    }



    public Status shoot(String playerName, int x, int y) {
        return battlefield.shoot(x, y);
    }
    public Status placeShip(String playerName, int x, int y) {
        return battlefield.placeShip(x, y);
    }
}
