package com.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */ 
    public UserServlet() {
        super();
        UserRepository repo = new UserRepository();
        repo.addUsersToRepository();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException1, IOException  {
		try{
			String username = request.getParameter("userId");
	        String password = request.getParameter("password");
	        if(username.equals("admin") && password.equals("admin") ){
	        	      	response.sendRedirect("ViewDemoPage.html");
	        }
	        else
			 response.sendRedirect("errorPage.jsp");
		}

		finally{
			System.out.println("Error");
		}

	}
	// Comment added for Jira Story KDP-267

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException1, IOException {
		doGet(request, response);
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
