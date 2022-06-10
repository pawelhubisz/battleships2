package com.example.demo.service.impl;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerDeleteService;
import com.example.demo.service.PlayerService;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService, PlayerDeleteService {

    private PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository fieldRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public List<Player> savePlayersAndGetAll(Player player) {
        playerRepository.save(player);
        return Streamable.of(playerRepository.findAll()).toList();
    }

    @Override
    public List<Player> deletePlayersAndGetAll(Player player) {
        playerRepository.deleteAll();
        return Streamable.of(playerRepository.findAll()).toList();
    }

    @Override
    public List<Player> deleteByIdPlayersAndGetAll(Player player) {
        playerRepository.deleteById(1L);;
        return Streamable.of(playerRepository.findAll()).toList();
    }
}
