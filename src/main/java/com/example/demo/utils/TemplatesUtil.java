package com.example.demo.utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TemplatesUtil implements Serializable{
	
	/**
	 * @author Manish Kumar
	 */
	private static final long serialVersionUID = 7889362399333193011L;

	public static String getCurrentID(String tableName, String code){
		String codeId = code;

		String sql = null;
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getJDBCConnection();
			statement = conn.createStatement();
			sql = "SELECT u.id FROM "+tableName+" u ORDER BY u.id DESC LIMIT 1";			
			rs = statement.executeQuery(sql);
			while(rs.next()){
		         Long id  = rs.getLong("id");
		         codeId = codeId+id;
		      }
		      rs.close();
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(statement!=null)
					conn.close();
			}catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return codeId;
	}
	
	

}
