package Servlets_Sessiontracking.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/b")
public class Class2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		HttpSession session = req.getSession();
		String mail = (String) session.getAttribute("em");
		String pwd=(String) session.getAttribute("pw");
				

		System.out.println(mail + " " + pwd);

	}

}
