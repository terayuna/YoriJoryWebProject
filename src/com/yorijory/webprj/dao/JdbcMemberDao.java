package com.yorijory.webprj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import com.yorijory.webprj.vo.Member;

public class JdbcMemberDao implements MemberDao{

	public List<Member> getMembers() throws SQLException{
		return getMembers(1,"MID", "");
	}
	
	public List<Member> getMembers(int page) throws SQLException{
		return getMembers(page, "MID", "");
	}
	
	public List<Member> getMembers(int page, String field, String query) throws SQLException{
	
		
		//String sql = "SELECT * FROM YJMember";
		//String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		//Connection con = DriverManager.getConnection(url, "yojo", "yjoriy1511");
		
		int start = 10*(page-1) + 1; 
		int end = 10*page;
		
		String sql = "SELECT * FROM(SELECT ROW_NUMBER() OVER "
				+ "(ORDER BY REGDATE DESC) NUM, * FROM MEMBERS WHERE " + field + " LIKE ?)A "
				+ "WHERE NUM BETWEEN ? AND ?";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		
		
		Connection con = DriverManager.
				getConnection(url, "yojo", "yjoriy1511");
		//Statement st = con.createStatement();
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		ResultSet rs = st.executeQuery(); 
		
		
		List<Member> list = new ArrayList<Member>();
		Member member = null;
		
		
		while(rs.next()) {
			member = new Member();
			
			member.setMid(rs.getString("mid"));
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
		
			
			list.add(member);
		}
		
		rs.close();
		st.close();
		con.close();
		
		
		return list;
	}

	@Override
	public int update(Member member) throws SQLException {
		String sql = "UPDATE Members SET Name=?, Pwd=? WHERE Mid=?";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		
		Connection con = DriverManager.getConnection(url, "yojo", "yjoriy1511");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, member.getName());
		st.setString(2, member.getPwd());
		st.setString(3, member.getMid());
		
		int count = st.executeUpdate();
		
		st.close();
		con.close();

		return count;
	}

	@Override
	public int delete(String mid) throws SQLException {
		String sql = "DELETE Members WHERE Mid=?";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		
		Connection con = DriverManager.getConnection(url, "yojo", "yjoriy1511");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, mid);
		
		int count = st.executeUpdate();
		
		st.close();
		con.close();

		return count;
	}

	@Override
	public int insert(Member member) throws SQLException {
		String sql = "INSERT INTO Members(Mid, Name, Pwd) VALUES(?,?,?)";
		String url = "jdbc:sqlserver://211.238.142.251:1433;databaseName=yorijorydb;";
		
		Connection con = DriverManager.getConnection(url, "yojo", "yjoriy1511");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, member.getMid());
		st.setString(2, member.getName());
		st.setString(3, member.getPwd());

		int count = st.executeUpdate();
		
		st.close();
		con.close();

		return count;
	}
}
