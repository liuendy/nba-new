package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Player;
import wangtuo.service.core.PlayerService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class PlayerServiceImpl extends BaseServiceAbstractImpl<Player> implements PlayerService {

	@Override
	protected String getId(Player t) {
		return t.getId();
	}

}
