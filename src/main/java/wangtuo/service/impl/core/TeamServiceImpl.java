package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Team;
import wangtuo.service.core.TeamService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class TeamServiceImpl extends BaseServiceAbstractImpl<Team> implements TeamService {

	@Override
	protected String getId(Team t) {
		return t.getId();
	}

}
