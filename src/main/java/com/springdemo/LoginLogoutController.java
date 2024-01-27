package com.springdemo;

import java.io.IOException;
import java.lang.invoke.MethodType;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class LoginLogoutController {
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Controller Called.....");
		System.out.print("In Login Servet");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		if(uname.equals("jatin") && password.equals("jatin")) {
			
			//Once the User logOut we remove from the Session. That's why we hold the session! 
			//For the Welcome Page.!!
			//So User Directly will not Hit the Welcome Page URL !!! 
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			
			response.sendRedirect("welcome.jsp");
		} else {
			response.sendRedirect("index.jsp");//Status Code 302 Redirect 
		}
		
	}
	
	@RequestMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		System.out.println("logout Called.....");
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		session.invalidate();
		response.sendRedirect("index.jsp");
		
		
	}

}
