package com.kevinmuchene.com.grapql.data;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="COMPETITIONS")
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
}
