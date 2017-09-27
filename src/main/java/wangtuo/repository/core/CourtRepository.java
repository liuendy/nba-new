package wangtuo.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;

import wangtuo.domain.core.Court;

public interface CourtRepository extends JpaRepository<Court, String>{
	Court findByName(String name);
}
