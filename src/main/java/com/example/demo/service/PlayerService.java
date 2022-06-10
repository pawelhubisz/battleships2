package com.example.demo.service;

import com.example.demo.model.Player;
import org.springframework.data.util.Streamable;

import java.util.List;

public interface PlayerService {
    List<Player> savePlayersAndGetAll(Player player);

}