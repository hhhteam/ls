package com.yc.Dao;

import java.sql.SQLException;

import com.yc.common.util.DBHelper;

public class UserDao {

	/**
	 * 注册
	 * @throws SQLException 
	 */
	public void insert(String nickName,String pwd,String tel,String email) throws SQLException {
		String sql="insert into memberinfo values (null,?,null,?,?,?,null,now(),1)";
		DBHelper.update(sql, nickName,pwd,tel,email);
	}
	
	
	
}
