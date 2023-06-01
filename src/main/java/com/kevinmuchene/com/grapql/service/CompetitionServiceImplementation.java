package com.kevinmuchene.com.grapql.service;

import com.kevinmuchene.com.grapql.data.Competition;
import com.kevinmuchene.com.grapql.repository.CompetitionRepository;
import org.springframework.stereotype.Service;

@Service
public class CompetitionServiceImplementation {

    private final CompetitionRepository competitionRepository;

    public CompetitionServiceImplementation(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
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

}
