package com.kevinmuchene.com.grapql.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddTeamToCompetitionInput {

    private long competitionId;
    private long teamId;


}
