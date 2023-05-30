package com.kevinmuchene.com.grapql.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreatePlayerInput {
    private PlayerInput player;
    private long teamId;

}
