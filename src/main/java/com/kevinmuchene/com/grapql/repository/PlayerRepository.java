package com.kevinmuchene.com.grapql.repository;

import com.kevinmuchene.com.grapql.data.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
