package com.sporing.app.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sporing.app.action.Action;
import com.sporing.app.action.ActionForward;
import com.sporing.app.user.dao.UserDAO;

public class UserLoginOk implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		ActionForward forward = new ActionForward();
		UserDAO dao = new UserDAO();
		HttpSession session = req.getSession();
		
		String user_email = req.getParameter("user_email");
		String user_password = req.getParameter("user_password");
		
		forward.setRedirect(true);
		
		if(dao.login(user_email, user_password)) {
			session.setAttribute("sessionId", user_email);
			forward.setPath(req.getContextPath() + "recruit/RecruitList.re");
		}else {
			forward.setPath(req.getContextPath() + "/user/UserLogin.us?code=false");
		}
		
		return forward;
	}
}