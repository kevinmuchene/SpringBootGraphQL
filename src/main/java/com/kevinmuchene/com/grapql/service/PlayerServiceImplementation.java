package com.kevinmuchene.com.grapql.service;

import com.kevinmuchene.com.grapql.data.Player;
import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImplementation {

    private final PlayerRepository playerRepository;
    private final TeamServiceImplementation teamServiceImplementation;

    public PlayerServiceImplementation(PlayerRepository playerRepository, TeamServiceImplementation teamServiceImplementation) {
        this.playerRepository = playerRepository;
        this.teamServiceImplementation = teamServiceImplementation;
        addTemporaryData();
    }

    private void addTemporaryData() {
        this.playerRepository.save(new Player(1, "Marcas Rashford", 24, "Forward", teamServiceImplementation.findById(1L)));
        this.playerRepository.save(new Player(2, "Lionel Messi", 34, "Forward", teamServiceImplementation.findById(2L)));
    }

    public Player createPlayer(Player player, Team team) {
        player.setTeam(team);
        return playerRepository.save(player);
    }

    public Iterable<Player> findAll() {
        return this.playerRepository.findAll();
    }

    public Player findById(Long id) {
        return this.playerRepository.findById(id).orElseThrow();
    }
}
