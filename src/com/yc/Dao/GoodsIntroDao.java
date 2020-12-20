package com.yc.Dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.yc.common.util.DBHelper;

public class GoodsIntroDao {

	public List<Map<String, Object>> querygoodsintro(/* int page */) throws SQLException{
		//int begin =(page-1)*5;
		String sql="select * from goodsinfo limit 0,5";
		return DBHelper.selectListMap(sql/* ,begin */);
	}
	
	
}
