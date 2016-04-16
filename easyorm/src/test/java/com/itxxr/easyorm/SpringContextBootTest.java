package com.itxxr.easyorm;

import java.sql.SQLException;

import  org.junit.Assert;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextBootTest {
	
	protected ClassPathXmlApplicationContext context;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("classpath:context.xml");
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		DataSource ds = (DataSource) context.getBean("dataSource");
		try {
			Assert.assertNotNull(ds.getConnection());
		} catch (SQLException e) {
			Assert.fail(e.getMessage()); 
		}
	
	}

}
