package wangtuo.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
import com.dangdang.ddframe.rdb.sharding.api.ShardingDataSourceFactory;
import com.dangdang.ddframe.rdb.sharding.api.rule.DataSourceRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.api.rule.TableRule;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.DatabaseShardingStrategy;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.TableShardingStrategy;

import wangtuo.config.strategy.GameTableShardingStrategy;
import wangtuo.config.strategy.SeasonDatabaseShardingStrategy;

@Configuration
public class DataSourceConfig {
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	@Value("${spring.datasource.url}")
	private String baseUrl;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@Autowired
	private ShardingProperties shardingProperties;

	@Bean
	public DataSource dataSource() {
		return buildDataSource();
	}

	private DataSource buildDataSource() {

		Map<String, DataSource> dataSourceMap = new HashMap<String, DataSource>();
		String[] databases = shardingProperties.getDatabases();
		for (String database : databases) {
			dataSourceMap.put(database, createDataSource(database));
		}
		DataSourceRule dataSourceRule = new DataSourceRule(dataSourceMap, shardingProperties.getDatabases()[0]);
		List<TableRule> tableRules = new ArrayList<TableRule>();
		for (String entity : shardingProperties.getEntities()) {
			List<String> tableNames = new ArrayList<String>();
			for (String database: shardingProperties.getDatabaseTableQualifiedNames().keySet()) {
				// 添加表规则
				tableNames.addAll(shardingProperties.getDatabaseTableQualifiedNames().get(database).get(entity));
			}
			TableRule tableRule = TableRule.builder(entity)
					.actualTables(tableNames)
					.dataSourceRule(dataSourceRule)
					.databaseShardingStrategy(
							new DatabaseShardingStrategy("season_id", new SeasonDatabaseShardingStrategy()))
					.tableShardingStrategy(new TableShardingStrategy("game_id", new GameTableShardingStrategy()))
					.build();
			tableRules.add(tableRule);
		}
		// 添加数据库规则
		ShardingRule shardingRule = ShardingRule.builder().dataSourceRule(dataSourceRule).tableRules(tableRules)
				.databaseShardingStrategy(
						new DatabaseShardingStrategy("season_id", new SeasonDatabaseShardingStrategy()))
				.tableShardingStrategy(new TableShardingStrategy("game_id", new GameTableShardingStrategy())).build();
		DataSource dataSource = ShardingDataSourceFactory.createDataSource(shardingRule);
		return dataSource;
	}

	private DataSource createDataSource(String dataSourceName) {
		DruidDataSource result = new DruidDataSource();
		result.setDriverClassName(driverClassName);
		result.setUrl(baseUrl + dataSourceName);
		result.setUsername(username);
		result.setPassword(password);
		return result;
	}
}
