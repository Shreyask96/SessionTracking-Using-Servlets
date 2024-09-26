package Servlets_Sessiontracking.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/a")
public class Class1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String s1=req.getParameter("mail");
		String s2=req.getParameter("pwd");
		
	//	System.out.println(s1+" "+s2);

		
		HttpSession session=req.getSession();
		session.setAttribute("em", s1);
		session.setAttribute("pw", s2);
		
		resp.sendRedirect("b");  
		
	}

}
