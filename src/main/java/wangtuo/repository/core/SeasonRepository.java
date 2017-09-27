package wangtuo.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;

import wangtuo.domain.core.Season;

public interface SeasonRepository extends JpaRepository<Season, String>{
	Season findByName(String name);
}
