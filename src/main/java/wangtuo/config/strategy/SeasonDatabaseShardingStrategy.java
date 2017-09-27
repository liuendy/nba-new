package wangtuo.config.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;

import wangtuo.config.ShardingProperties;


public class SeasonDatabaseShardingStrategy implements SingleKeyDatabaseShardingAlgorithm<String> {
	
	@Autowired
	private ShardingProperties shardingProperties; 

	@Override
	public Collection<String> doBetweenSharding(Collection<String> availableTargetNames,
			ShardingValue<String> shardingValue) {
		return null;
	}

	@Override
	public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<String> shardingValue) {
		Set<String> databases =  shardingProperties.getDatabaseTableQualifiedNames().keySet();
		System.out.println(databases);
		String targetDatabase = shardingValue.getValue();
		for (String databaseName : availableTargetNames) {
			if (targetDatabase.equals(databaseName)) {
				return databaseName;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public Collection<String> doInSharding(Collection<String> availableTargetNames,
			ShardingValue<String> shardingValue) {
		return null;
	}
}
