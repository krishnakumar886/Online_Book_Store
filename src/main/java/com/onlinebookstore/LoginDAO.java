package com.onlinebookstore;

import java.sql.*;
import javax.servlet.http.*;

public class LoginDAO {
	public String fName = null;

	public String login(HttpServletRequest req) {
		try {

			Connection con = DBConnection.getCon();
			String s1 = (String) req.getServletContext().getAttribute("s1");
			PreparedStatement ps = null;
			if (s1.equals("User")) {
				ps = con.prepareStatement("select * from UserTab where uname=? and pword=?");
			} else {
				ps = con.prepareStatement("select * from AdminTab where uname=? and pword=?");
			}
			ps.setString(1, req.getParameter("uname"));
			ps.setString(2, req.getParameter("pword"));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				fName = rs.getString(3);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fName;
	}
}