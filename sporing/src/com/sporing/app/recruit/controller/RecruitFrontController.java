package com.sporing.app.recruit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sporing.app.action.ActionForward;

public class RecruitFrontController extends HttpServlet {
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
		
		if(command.equals("/recruit/RecruitListOk.re")) {
			
		}else if(command.equals("/recruit/RecruitWrite.re")) {
			
		}else if(command.equals("/recruit/RecruitWriteOk.re")) {
			
		}else if(command.equals("/recruit/RecruitDeleteOk.re")) {
			
		}else if(command.equals("/recruit/RecruitModify.re")) {
			
		}else if(command.equals("/recruit/RecruitModifyOk.re")) {
			
		}else if(command.equals("/recruit/ApplicationOk.re")) {
			
		}else if(command.equals("/recruit/RecruitMerceListOk.re")) {
			
		}else if(command.equals("/recruit/RecruitDetailOk.re")) {
			
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

