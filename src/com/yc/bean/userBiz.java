package com.yc.bean;

import java.sql.SQLException;

import com.yc.Dao.UserDao;
import com.yc.common.biz.BizException;
import com.yc.common.util.Utils;

public class userBiz {

	private UserDao ud=new UserDao();
	public void add(String nickName,String pwd,String tel,String email) throws BizException {
		Utils.checkNull(nickName, "姓名不能为空");
		Utils.checkNull(pwd, "密码不能为为空");
		Utils.checkNull(tel, "电话不能为空");
		Utils.checkNull(email,"邮箱不能为空");
		
		try {
			ud.insert(nickName, pwd, tel, email);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BizException("系统繁忙  请稍后再试");
		}
	}
}
