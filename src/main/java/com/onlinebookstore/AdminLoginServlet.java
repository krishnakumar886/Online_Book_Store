package com.onlinebookstore;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log2")
public class AdminLoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fName = new LoginDAO().login(req);
		if (fName == null) {
			req.setAttribute("msg", "<html><body><center><h2>Invalid Login Process...</h2></center></body</html>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		} else {
			HttpSession hs = req.getSession();
			hs.setAttribute("fname", fName);
			req.getRequestDispatcher("Admin.jsp").forward(req, res);
		}
	}
}