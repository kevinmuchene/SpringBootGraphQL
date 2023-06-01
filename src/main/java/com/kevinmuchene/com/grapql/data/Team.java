package com.kevinmuchene.com.grapql.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
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

//    @ManyToMany(mappedBy = "listOfTeams")
//    @JoinColumn(name = "COMPETITION_ID")
//    private List<Competition> listOfCompetitions;

    @ManyToMany(mappedBy = "listOfTeams")
    private List<Competition> listOfCompetitions;

    public Team(long id, String name, String nickname, String stadium, String city) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.stadium = stadium;
        this.city = city;
    }


//    public void addCompetition(Competition competition) {
//        listOfCompetitions.add(competition);
//        competition.getListOfTeams().add(this);
//    }
//
//    public void removeCompetition(Competition competition) {
//        listOfCompetitions.remove(competition);
//        competition.getListOfTeams().remove(this);
//    }

}
