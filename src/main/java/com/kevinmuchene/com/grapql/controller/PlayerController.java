package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Player;
import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.service.PlayerServiceImplementation;
import com.kevinmuchene.com.grapql.service.TeamServiceImplementation;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PlayerController {

    private final PlayerServiceImplementation playerServiceImplementation;
    private final TeamServiceImplementation teamServiceImplementation;

    public PlayerController(PlayerServiceImplementation playerServiceImplementation, TeamServiceImplementation teamServiceImplementation) {
        this.playerServiceImplementation = playerServiceImplementation;
        this.teamServiceImplementation = teamServiceImplementation;
    }

    @QueryMapping
    public Iterable<Player> players() {
        return this.playerServiceImplementation.findAll();
    }

    @QueryMapping
    public Player playerById(@Argument Long id) {
        return this.playerServiceImplementation.findById(id);
    }

    @MutationMapping
    public Player createPlayer(@Argument(name = "input") CreatePlayerInput input){
        Team team = teamServiceImplementation.findById(input.getTeamId());

        if(team == null) {
            return null;
        }

        return this.playerServiceImplementation.createPlayer(input.getPlayer().getPlayerEntity(), team);
    }
}
