package wangtuo.service.impl.detail;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.detail.GameMovement;
import wangtuo.service.detail.GameMovementService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class GameMovementServiceImpl extends BaseServiceAbstractImpl<GameMovement> implements GameMovementService {

	@Override
	protected String getId(GameMovement t) {
		return t.getId();
	}

}
	