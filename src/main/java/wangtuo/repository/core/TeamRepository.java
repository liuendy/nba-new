package wangtuo.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;

import wangtuo.domain.core.Team;

public interface TeamRepository extends JpaRepository<Team, String>{
	Team findByName(String name);
}
