package com.kevinmuchene.com.grapql;

import com.kevinmuchene.com.grapql.data.Competition;
import com.kevinmuchene.com.grapql.data.Team;
import com.kevinmuchene.com.grapql.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class FootballEcosystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(FootballEcosystemApplication.class, args);
	}

}
