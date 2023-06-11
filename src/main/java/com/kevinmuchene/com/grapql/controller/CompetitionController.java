package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Competition;
import com.kevinmuchene.com.grapql.service.CompetitionServiceImplementation;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CompetitionController {

    private final CompetitionServiceImplementation competitionServiceImplementation;

    public CompetitionController(CompetitionServiceImplementation competitionServiceImplementation) {
        this.competitionServiceImplementation = competitionServiceImplementation;
    }

    @QueryMapping
    public Iterable<Competition> competitions() {
       return this.competitionServiceImplementation.findAll();
    }

    @QueryMapping
    public Competition competitionById(@Argument Long id){
        return this.competitionServiceImplementation.findById(id);
    }

    @MutationMapping
    public Competition createCompetition(@Argument(name = "input") CompetitionInput competitionInput){
        return this.competitionServiceImplementation.createCompetition(competitionInput.getCompetitionEntity());
    }

//    @MutationMapping
//    public Competition addTeamToCompetition(@Argument(name = "input") AddTeamToCompetitionInput addTeamToCompetitionInput) {
//        return this.competitionServiceImplementation.addTeamToCompetition(addTeamToCompetitionInput.getCompetitionId(), addTeamToCompetitionInput.getTeamId());
//    }
}
