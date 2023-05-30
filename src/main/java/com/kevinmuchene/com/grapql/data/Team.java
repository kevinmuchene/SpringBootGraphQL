package com.kevinmuchene.com.grapql.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TEAMS")
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NICKNAME")
    private String nickname;

    @Column(name = "STADIUM")
    private String stadium;

    @Column(name = "CITY")
    private String city;

    @OneToMany(mappedBy = "team")
    private List<Player> playerList;
}
