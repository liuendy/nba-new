package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Coach;
import wangtuo.service.core.CoachService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class CoachServiceImpl extends BaseServiceAbstractImpl<Coach> implements CoachService {

	@Override
	protected String getId(Coach t) {
		return t.getId();
	}

}
