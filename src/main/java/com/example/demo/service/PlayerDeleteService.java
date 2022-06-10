package com.example.demo.service;

import com.example.demo.model.Player;

import java.util.List;

public interface PlayerDeleteService {
    List<Player> deletePlayersAndGetAll(Player player);
    List<Player> deleteByIdPlayersAndGetAll(Player player);
}