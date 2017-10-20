package com.welleplus.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPostgresql {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		
		Connection conn = null;
		String sql = "select * from userinfo";
		try {
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "hanxiao");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getLong("id"));
				System.out.println(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args) throws ClassNotFoundException {
//		Class.forName("org.postgresql.Driver");
//		String name = "xiao";
//		
//		Connection conn = null;
//		String sql = "insert into userinfo(name) values('xiao')";
//		
//		try {
//			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","hanxiao");
////			PreparedStatement ps = conn.prepareStatement(sql);
////			ps.setString(1, name);
////			ps.execute();
//			Statement st = conn.createStatement();
//			st.execute(sql);
//			System.out.println("save successed！");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

}
