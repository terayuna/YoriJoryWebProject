package com.yorijory.webprj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yorijory.webprj.vo.Member;

public class MemberDao {
	public List<Member> getMembers() throws SQLException{
		return getMembers(1);
	}
	public List<Member> getMembers(int page) throws SQLException{
	
		
		//String sql = "SELECT * FROM YJMember";
		//String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		//Connection con = DriverManager.getConnection(url, "yojo", "yjoriy1511");
		
		int start = 10*(page-1) + 1; 
		int end = 10*page;
		
		String sql = "SELECT * FROM(SELECT ROW_NUMBER() OVER "
				+ "(ORDER BY REGDATE DESC) NUM, * FROM MEMBERS)"
				+ "A WHERE NUM BETWEEN " + start  +" AND " + end;
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=edudb;";
		
		
		Connection con = DriverManager.getConnection(url, "edu", "class2d");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql); 
		
		
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		
		
		while(rs.next()) {
			member = new Member();
			
			member.setMid(rs.getString("mid"));
			member.setName(rs.getString("name"));
			//member.setPassword(rs.getString("password"));
		
			
			list.add(member);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return list;
	}
}
