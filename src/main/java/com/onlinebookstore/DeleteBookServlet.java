package com.onlinebookstore;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteBookServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs = req.getSession(false);
		if (hs == null) {
			req.setAttribute("msg", "<html><body><center><h2>Session Expired....</h2></center></body</html>");
			req.getRequestDispatcher("Fail.jsp").forward(req, res);
		} else {
			int k = new DeleteDAO().delete(req);
			if (k > 0) {
				req.getRequestDispatcher("Delete.jsp").forward(req, res);
			}
		}
	}
}