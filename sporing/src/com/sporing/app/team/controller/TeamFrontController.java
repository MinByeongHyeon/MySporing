package com.sporing.app.team.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sporing.app.action.ActionForward;

public class TeamFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = requestURI.substring(contextPath.length());
		ActionForward forward = null;
		
		if(command.equals("/team/TeamListOk.te")) {
			
		}else if(command.equals("/team/TeamWriteOk.te")) {
			
		}else if(command.equals("/team/TeamWrite.te")) {
			
		}else if(command.equals("/team/TeamModifyOk.te")) {
			
		}else if(command.equals("/team/TeamModify.te")) {
			
		}else if(command.equals("/team/TeamDeleteOk.te")) {
			
		}else if(command.equals("/team/TeamDetailOk.te")) {
			
		}else if(command.equals("/team/ApplicationOk.te")) {
			
		}
		
		if(forward != null) {
			 if(forward.isRedirect()) {
				 resp.sendRedirect(forward.getPath());
			 }else {
				 RequestDispatcher dispatcher = req.getRequestDispatcher(forward.getPath());
				 dispatcher.forward(req, resp);
			 }
		}
	}
}

