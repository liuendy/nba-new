package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Game;
import wangtuo.service.core.GameService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class GameServiceImpl extends BaseServiceAbstractImpl<Game> implements GameService {

	@Override
	protected String getId(Game t) {
		return t.getId();
	}

}
