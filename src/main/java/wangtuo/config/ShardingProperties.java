package wangtuo.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wangtuo0k
 *
 */
@Component
@ConfigurationProperties(prefix = "sharding")
public class ShardingProperties {
	private String[] databases;

	private String[] entities;

	private Map<String, List<String>> suffixes = new LinkedHashMap<String,List<String>>();

	private Map<String, Map<String, List<String>>> databaseTableQualifiedNames = new LinkedHashMap<String, Map<String, List<String>>>();

	public String[] getDatabases() {
		return databases;
	}

	public void setDatabases(String[] databases) {
		this.databases = databases;
	}

	public String[] getEntities() {
		return entities;
	}

	public void setEntities(String[] entities) {
		this.entities = entities;
	}

	public Map<String, List<String>> getSuffixes() {
		return suffixes;
	}

	public void setSuffixes(Map<String, List<String>> suffixes) {
		this.suffixes = suffixes;
	}

	public Map<String, Map<String, List<String>>> getDatabaseTableQualifiedNames() {
		return databaseTableQualifiedNames;
	}

	public void setDatabaseTableQualifiedNames(Map<String, Map<String, List<String>>> databaseTableQualifiedNames) {
		this.databaseTableQualifiedNames = databaseTableQualifiedNames;
	}

	/**
	 * 获取所有分库分表信息
	 */
	@PostConstruct
	public void init() {
		for (int i = 1; i < databases.length; i++) {
			Map<String, List<String>> tableQualifiedNames = getTableQualifiedNamesByDatabase(databases[i]);
			databaseTableQualifiedNames.put(databases[i], tableQualifiedNames);
		}
	}

	/**
	 * 获取指定database下面所有表名
	 * 
	 * @param database
	 * @return
	 */
	private Map<String, List<String>> getTableQualifiedNamesByDatabase(String database) {
		Map<String, List<String>> tableQualifiedNames = new HashMap<String, List<String>>();
		for (String entity : entities) {
			List<String> qualifiedNames = getQualifiedNamesByTableName(database, entity);
			tableQualifiedNames.put(entity, qualifiedNames);
		}
		return tableQualifiedNames;
	}

	/**
	 * 获取指定database和entity下面所有表名
	 * 
	 * @param database
	 * @param entity
	 * @return
	 */
	private List<String> getQualifiedNamesByTableName(String database, String entity) {
		List<String> qualifiedNames = new ArrayList<String>();
		for (String suffix : suffixes.get(database)) {
			qualifiedNames.add(database + "." + entity + "_" + suffix);
		}
		return qualifiedNames;
	}

}
