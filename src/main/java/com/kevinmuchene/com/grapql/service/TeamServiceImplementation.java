package com.kevinmuchene.com.grapql.service;

import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TeamServiceImplementation {

    private final TeamRepository teamRepository;

    public TeamServiceImplementation(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
        addTemporaryData();
    }

    private void addTemporaryData(){
        this.teamRepository.save(new Team(1, "Manchester United", "Red Devils", "Old Traford", "Manchester"));
        this.teamRepository.save(new Team(2, "Real Madrid", "Los Blanco", "Santiogo Bernabeu", "Madrid"));
    }

    public Iterable<Team> findAll(){
        return this.teamRepository.findAll();
    }

    public Team findById(Long id) {
        return this.teamRepository.findById(id).orElseThrow();
    }

    public Team createTeam(Team team) {
        return this.teamRepository.save(team);
    }
}
