package com.yc.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yc.bean.userBiz;
import com.yc.common.bean.Result;
import com.yc.common.biz.BizException;
import com.yc.common.web.BaseServlet;

@WebServlet("/UserServlet.s")
public class UserServelt extends BaseServlet{

	private static final long serialVersionUID = 1L;

	private userBiz ub= new userBiz();
	public void UserReg(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String nickName=request.getParameter("nickName");
		String pwd=request.getParameter("pwd");
		String tel=request.getParameter("tel");
		String email=request.getParameter("email");
		try {
			ub.add(nickName, pwd, tel, email);
			write(response, Result.success("注册成功"));
		} catch (BizException e) {
			e.printStackTrace();
			write(response, Result.failure("注册失败"+e.getMessage()));
		}
		
		
	}
}
