package com.itxxr.easyorm.database;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.itxxr.easyorm.entity.EntityConfig;

public class MysqlDataBase extends DataBase {
	@Override
	protected List<EntityConfig> getEntityConfigsFromDataBaseTables() {
		List<EntityConfig> configs = new LinkedList<EntityConfig>();
		String database = getJdbcTemplate().queryForObject("select database()",
				String.class);
		List<Map<String, Object>> tables = getJdbcTemplate()
				.queryForList(
						"select table_name from information_schema.TABLES where lower(table_schema) = lower('"
								+ database
								+ "') and upper(table_type) = 'BASE TABLE'");
		for(Map<String, Object> table : tables){
			EntityConfig config = new EntityConfig();
			config.setDatabaseTableName(table.get("table_name").toString());
		}
		return configs;
	}

	@Override
	protected List<EntityConfig> getEntityConfigsFromDataBaseViews() {
		return new LinkedList<EntityConfig>();
	}
}
