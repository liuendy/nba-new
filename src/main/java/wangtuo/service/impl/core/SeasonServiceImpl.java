package wangtuo.service.impl.core;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wangtuo.domain.core.Season;
import wangtuo.service.core.SeasonService;
import wangtuo.service.impl.BaseServiceAbstractImpl;

@Service
@Transactional
public class SeasonServiceImpl extends BaseServiceAbstractImpl<Season> implements SeasonService {

	@Override
	protected String getId(Season t) {
		return t.getId();
	}

}
