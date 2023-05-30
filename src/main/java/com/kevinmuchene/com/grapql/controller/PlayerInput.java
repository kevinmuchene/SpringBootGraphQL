package com.kevinmuchene.com.grapql.controller;

import com.kevinmuchene.com.grapql.data.Player;
import com.kevinmuchene.com.grapql.data.Team;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerInput {

    private String name;
    private int age;
    private String playPosition;
    private Team team;

    public Player getPlayerEntity() {
        Player player = new Player();
        player.setName(this.name);
        player.setAge(this.age);
        player.setPlayPosition(this.playPosition);
        player.setTeam(this.team);

        return player;
    }
}
