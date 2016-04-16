package com.itxxr.easyorm.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.itxxr.easyorm.entity.EntityConfig;

public class MysqlDataBase extends DataBase{
	@Override
	protected List<EntityConfig> getEntityConfigsFromDataBaseTables() {
		List<EntityConfig> configs = new LinkedList<EntityConfig>();
		Connection conn = null;
		try {
			conn = getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return configs;
	}
	@Override
	protected List<EntityConfig> getEntityConfigsFromDataBaseViews() {
		return new LinkedList<EntityConfig>();
	}
}
