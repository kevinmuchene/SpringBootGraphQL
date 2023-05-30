package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Team;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamInput {

    private String name;
    private String nickname;
    private String stadium;
    private String city;

    public Team getTeamEntity(){
        Team team = new Team();
        team.setName(this.name);
        team.setNickname(this.nickname);
        team.setStadium(this.stadium);
        team.setCity(this.city);

        return team;
    }
}
