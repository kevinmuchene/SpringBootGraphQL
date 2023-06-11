package com.kevinmuchene.com.grapql.service;

import com.kevinmuchene.com.grapql.data.Competition;
import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.repository.CompetitionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompetitionServiceImplementation {

    private final CompetitionRepository competitionRepository;
    private final TeamServiceImplementation teamServiceImplementation;

    public CompetitionServiceImplementation(CompetitionRepository competitionRepository, TeamServiceImplementation teamServiceImplementation) {
        this.competitionRepository = competitionRepository;
        this. teamServiceImplementation = teamServiceImplementation;
        addTemporaryData();
    }

    private void addTemporaryData(){
        this.competitionRepository.save(new Competition(1L, "Champions League", 5000, "Instabul", 32));
        this.competitionRepository.save(new Competition(2L, "Premier League", 4000, "England", 20));
    }

    public Iterable<Competition> findAll() {
       return this.competitionRepository.findAll();
    }

    public Competition findById(Long id) {
        return this.competitionRepository.findById(id).orElseThrow();
    }

    public Competition createCompetition(Competition competition) {
        return this.competitionRepository.save(competition);
    }

//    @Transactional
//    public Competition addTeamToCompetition(Long competitionId, Long teamId) {
//        Competition competition = findById(competitionId);
//        Team team = this.teamServiceImplementation.findById(teamId);
//
//        competition.addTeam(team);
//        team.addCompetition(competition);
//
//
//        return competition;
//    }

}
