package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.repository.TeamRepository;
import com.kevinmuchene.com.grapql.service.TeamServiceImplementation;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TeamController {

    private final TeamServiceImplementation teamServiceImplementation;

    public TeamController(TeamServiceImplementation teamServiceImplementation) {
        this.teamServiceImplementation = teamServiceImplementation;
    }

    @QueryMapping
    public Iterable<Team> teams(){
        return teamServiceImplementation.findAll();
    }

    @QueryMapping
    public Team teamById(@Argument Long id) {
        return teamServiceImplementation.findById(id);
    }

    @MutationMapping
    public Team createTeam(@Argument(name = "input") TeamInput teamInput) {
        return this.teamServiceImplementation.createTeam(teamInput.getTeamEntity());
    }
}
