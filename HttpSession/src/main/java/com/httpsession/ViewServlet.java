package com.httpsession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//return session id
		HttpSession session = req.getSession(false);
		
		if(session != null) {
			String html= "<html>"
					+ "	<body>"
					+ "		<h1>Inbox Page</h1>"
					+ "		<table border=\"2px\">"
					+ "			<tr>"
					+ "				<th>ID</th>"
					+ "				<th>NAME</th>"
					+ "				<th>AGE</th>"
					+ "			</tr>"
					+ "			<tr>"
					+ "				<td>1</td>"
					+ "				<td>Partha</td>"
					+ "				<td>26</td>"
					+ "			</tr>"
					+ "			<tr>"
					+ "				<td>2</td>"
					+ "				<td>Sanjay</td>"
					+ "				<td>27</td>"
					+ "			</tr>"
					+ "		</table>"
					+ "	</body>"
					+ "</html>";
			
			resp.getWriter().print(html);
		}
		else {
			resp.getWriter().print("<h1>Login first</h1>");
		}
	}

}
