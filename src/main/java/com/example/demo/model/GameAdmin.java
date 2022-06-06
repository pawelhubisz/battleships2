package com.example.demo.model;

import com.example.demo.enums.Status;

public class GameAdmin {
    private Player player;
    private Battlefield firstBattlefield;
    private Battlefield secondBattlefield;

    public GameAdmin() {
        //TODO przenieść tworzenie Battlefield do GameService - do metody prepareGame (utwórz getter i setter dla obu i potem w GameService.prepare game "gameAdmin.setFirstBattlefield")
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
        //TODO sprawdź w którym battlefield jest Player o takim playerName i dla tego battlefield wywołaj shoot (obsłuż sytuację jak playera nie ma)
        if (playerName.equals(player.getFirstPlayer())) {
            return null;
        }
        //  return battlefield.shoot(x, y);
        return null;
    }


    public Status placeShip(String playerName, int x, int y) {
        //TODO sprawdź w którym battlefield jest Player o takim playerName i dla tego battlefield wywołaj placeShip (obsłuż sytuację jak playera nie ma)
        //return battlefield.placeShip(x, y);
        return null;
    }


}
