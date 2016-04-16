package com.itxxr.easyorm.dao.generator;

import java.util.LinkedList;
import java.util.List;

import com.itxxr.easyorm.entity.EntityConfig;

public class DaoGenerator {
	protected List<EntityConfig> getEntityConfigsFromDataBaseTables() {
		return new LinkedList<EntityConfig>();
	}

	protected List<EntityConfig> getEntityConfigs() {
		List<EntityConfig> configs = new LinkedList<EntityConfig>();
		configs.addAll(getEntityConfigsFromDataBaseTables());
		return configs;
	}
}
