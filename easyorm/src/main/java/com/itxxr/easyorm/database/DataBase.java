package com.itxxr.easyorm.database;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.itxxr.easyorm.entity.EntityConfig;

public abstract class DataBase extends JdbcDaoSupport{


	abstract protected List<EntityConfig> getEntityConfigsFromDataBaseTables();

	abstract protected List<EntityConfig> getEntityConfigsFromDataBaseViews();



}
