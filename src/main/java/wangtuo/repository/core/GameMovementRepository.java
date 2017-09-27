package wangtuo.repository.core;

import org.springframework.data.jpa.repository.JpaRepository;

import wangtuo.domain.detail.GameMovement;

public interface GameMovementRepository extends JpaRepository<GameMovement, String>{
}
