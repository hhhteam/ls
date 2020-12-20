package com.yc.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.Dao.GoodsIntroDao;
import com.yc.common.web.BaseServlet;
@WebServlet("/goodsboard.s")
public class GoodsInfoBoardServlet extends BaseServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private GoodsIntroDao gd=new GoodsIntroDao();
	public void querygoodsinfo(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		//String page=request.getParameter("page");
		//int ipage=Integer.parseInt(page);
		try {
			write(response, gd.querygoodsintro(/* ipage */));
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
