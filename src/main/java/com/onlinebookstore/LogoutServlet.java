package com.onlinebookstore;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession(false);
		if (hs == null) {
			req.setAttribute("msg","<html><body><center><h2>Session Expired....</h2></center></body</html>");
		} else {
			hs.invalidate();
			req.setAttribute("msg", "LoggedOut Successfully..");
		} // End of else
		RequestDispatcher rd = req.getRequestDispatcher("Fail.jsp");
		rd.forward(req, res);
	}
}