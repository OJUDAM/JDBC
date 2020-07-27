package com.bit2020.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection connection = null;
			try {
				// 1. JDBC Driver(MariaDB Driver)
				Class.forName("org.mariadb.jdbc.Driver");
				
				// 2. 연결하기
				String url = "jdbc:mysql://127.0.0.1:3306/webdb?characterEncoding=utf8";
				
				connection = DriverManager.getConnection(url,"webdb","webdb");
				
				System.out.println("연결 성공");
			} catch (ClassNotFoundException e) {
				
				System.out.println("드라이버 로딩 실패");
			}catch(SQLException e) {
				System.out.println("에러 : "+e);
			}finally {
				try {
					if(connection != null) {
						connection.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			
	}

}
