package com.kevinmuchene.com.grapql.repository;

import com.kevinmuchene.com.grapql.data.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
