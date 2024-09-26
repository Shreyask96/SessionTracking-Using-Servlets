package Servlets_Sessiontracking.cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String email=req.getParameter("mail");
		String password=req.getParameter("pwd");
		
		Cookie cookie=new Cookie("Email", email);
		Cookie cookie2=new Cookie("Password", password);
		
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		if(email.equals("abc@gmail.com") && password.equals("12345"))
		{
			resp.sendRedirect("homepage");
		}
		else
		{
			resp.getWriter().print("Enter proper email and password");
		}
	}

}
