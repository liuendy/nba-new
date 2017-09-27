package wangtuo.repository.core;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import wangtuo.domain.core.Game;

public interface GameRepository extends JpaRepository<Game, String>{
	List<Game> findBySeasonId(String seasonId);
}
