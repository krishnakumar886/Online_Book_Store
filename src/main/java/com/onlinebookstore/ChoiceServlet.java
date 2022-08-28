package com.onlinebookstore;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("s1");

		req.getServletContext().setAttribute("s1", s1);
		req.getRequestDispatcher("Choice.jsp").forward(req, res);
	}
}