package com.sporing.app.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sporing.app.action.Action;
import com.sporing.app.action.ActionForward;
import com.sporing.app.user.dao.UserDAO;

public class UserMdify implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		int user_num=Integer.parseInt(req.getParameter("user_num"));
		ActionForward forward=new ActionForward();
		UserDAO udao=new UserDAO();
		
		req.setAttribute("user", udao.getUserDetail(user_num));
		forward.setRedirect(false);
		forward.setPath("UserModify.jsp");
		
		return null;
	}

}
