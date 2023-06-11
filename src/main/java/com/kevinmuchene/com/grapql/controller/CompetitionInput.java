package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Competition;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CompetitionInput {

    private String name;
    private float price;
    private String country;
    private int numberOfTeams;

    public Competition getCompetitionEntity() {
        Competition competition = new Competition();
        competition.setName(this.name);
        competition.setPrice(this.price);
        competition.setCountry(this.country);
        competition.setNumberOfTeams(this.numberOfTeams);

        return competition;
    }
}
