package com.kevinmuchene.com.grapql.repository;

import com.kevinmuchene.com.grapql.data.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {


}
