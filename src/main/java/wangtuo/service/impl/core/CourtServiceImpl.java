package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Court;
import wangtuo.service.core.CourtService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class CourtServiceImpl extends BaseServiceAbstractImpl<Court> implements CourtService {

	@Override
	protected String getId(Court t) {
		return t.getId();
	}

}
