package com.sporing.app.intro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sporing.app.action.ActionForward;

public class IntroFrontController extends HttpServlet {
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
		
		if(command.equals("/intro/IntroListOk.in")) {
			
		}else if(command.equals("/intro/IntroWrite.in")) {
			
		}else if(command.equals("/intro/IntroWriteOk.in")) {
			
		}else if(command.equals("/intro/IntroDeleteOk.in")) {
			
		}else if(command.equals("/intro/IntroModify.in")) {
			
		}else if(command.equals("/intro/IntroModifyOk.in")) {
			
		}else if(command.equals("/intro/IntroDetailOk.in")) {
			
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

