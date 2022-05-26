package com.example.demo.model;

import com.example.demo.enums.Status;

public class GameAdmin {

    private Battlefield firstBattlefield;
    private Battlefield secondBattlefield;

    public GameAdmin() {
        //TODO przenieść tworzenie Battlefield do GameService - do metody prepareGame (utwórz getter i setter dla obu i potem w GameService.prepare game "gameAdmin.setFirstBattlefield")
        //firstBattlefield = new Battlefield();
        //firstBattlefield = new Battlefield();
    }

    @Override
    public String toString() {
        return "GameAdmin{}";
    }


    public Status shoot(String playerName, int x, int y) {
        //TODO sprawdź w którym battlefield jest Player o takim playerName i dla tego battlefield wywołaj shoot (obsłuż sytuację jak playera nie ma)
      //  return battlefield.shoot(x, y);
        return null;
    }
    public Status placeShip(String playerName, int x, int y) {
        //TODO sprawdź w którym battlefield jest Player o takim playerName i dla tego battlefield wywołaj placeShip (obsłuż sytuację jak playera nie ma)
        //return battlefield.placeShip(x, y);
        return null;
    }
}
