package com.diet.project.demo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@kjoracle.cvgxs5b56qhi.ap-northeast-2.rds.amazonaws.com:1521:ORCL";
	String user ="kj90";
	String pw = "password";
	Connection con = null;

	@Test
	public void testConnection() throws Exception{
		try{
			Class.forName(driver);
			System.out.println("driver ok");
			con = DriverManager.getConnection(url,user,pw);
			System.out.println("connected");
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
