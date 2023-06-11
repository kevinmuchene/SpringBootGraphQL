package com.kevinmuchene.com.grapql.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Competition {


    @Id
    @Column(name="COMPETITION_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private float price;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "NUMBER_OF_TEAMS")
    private int numberOfTeams;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "competition_team",
            joinColumns = @JoinColumn(name = "competition_id"),
            inverseJoinColumns = @JoinColumn(name = "team_id")
    )
    private List<Team> listOfTeams;


    public Competition(Long id, String name, float price, String country, int numberOfTeams) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.country = country;
        this.numberOfTeams = numberOfTeams;
    }

    public void addTeam(Team team) {
        listOfTeams.add(team);
        team.getListOfCompetitions().add(this);
    }

    public void removeTeam(Team team) {
        listOfTeams.remove(team);
        team.getListOfCompetitions().remove(this);
    }

}
