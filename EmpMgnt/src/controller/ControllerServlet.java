package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SeviceEmployees;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ControllerServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String mid = request.getParameter("uid");
    				SeviceEmployees.getAllEmployees(mid, request, response);
            	
	}
}
