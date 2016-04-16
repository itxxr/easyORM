package com.itxxr.easyorm.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.itxxr.easyorm.entity.EntityConfig;

public abstract class DataBase {
	protected String url;
	protected String username;
	protected String password;
	protected String fullDriverClassName;

	abstract protected List<EntityConfig> getEntityConfigsFromDataBaseTables();

	abstract protected List<EntityConfig> getEntityConfigsFromDataBaseViews();

	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName(fullDriverClassName);
		return DriverManager.getConnection(url, username, password);
	}

	public String getFullDriverClassName() {
		return fullDriverClassName;
	}

	public void setFullDriverClassName(String fullDriverClassName) {
		this.fullDriverClassName = fullDriverClassName;
	}

	public String getPassword() {
		return password;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
