package com.bit2020.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		try {
			// 1. JDBC Driver(MariaDB Driver)
			Class.forName("org.mariadb.jdbc.Driver");

			// 2. 연결하기
			String url = "jdbc:mysql://127.0.0.1:3306/webdb?characterEncoding=utf8";

			connection = DriverManager.getConnection(url, "webdb", "webdb");
			
			// 3. Statement 객체 생성 sql 실행하기 위해서
			stmt =  connection.createStatement();
			
			// 4. SQL 실행
			String firstName = "oh";
			String lastName="judam";
			String email = "dhwnkea@naver.com";
			String sql = "insert into emaillist values(2, '"+firstName+"','"+lastName+"','"+email+"')";
					
			
			int count = stmt.executeUpdate(sql);
			if(count ==1) {
				System.out.println("성공!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
