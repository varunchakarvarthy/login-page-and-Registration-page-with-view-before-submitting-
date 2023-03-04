package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.LoginDetails;

@WebServlet("/def")
public class LoginController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		LoginDetails loginDetails=new LoginDetails();
		loginDetails.setUsername(username);
		loginDetails.setPassword(password);
		
		Dao dao=new Dao();
		dao.logindetails(loginDetails);
		RequestDispatcher dispatcher=req.getRequestDispatcher("comproject.html");
		dispatcher.forward(req, resp);
	}
}
