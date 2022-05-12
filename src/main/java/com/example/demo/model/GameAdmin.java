package com.example.demo.model;

import com.example.demo.enums.ShipPlaceStatus;
import com.example.demo.enums.Status;

public class GameAdmin {

    private Battlefield battlefield;
    private Player player;

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Status shoot(String playerName, int x, int y) {
        return battlefield.shoot(x, y);
    }
    public Status placeShip(String playerName, int x, int y) {
        return battlefield.placeShip(x, y);
    }
}
