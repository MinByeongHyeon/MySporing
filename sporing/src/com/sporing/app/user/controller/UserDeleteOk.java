package com.sporing.app.user.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sporing.app.action.Action;
import com.sporing.app.action.ActionForward;
import com.sporing.app.user.dao.UserDAO;
import com.sporing.app.user.vo.UserVO;

public class UserDeleteOk implements Action{
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		
		UserDAO dao = new UserDAO();
		int user_num=Integer.parseInt(req.getParameter("user_num"));
		
		
		dao.user_delete(user_num);
		
		return null;
	}
}
