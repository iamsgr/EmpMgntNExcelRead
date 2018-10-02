package service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManipulateEmp;
import model.Employee;

public class SeviceEmployees {

	public static void  getAllEmployees(String mid,HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<Employee> empList = (ArrayList<Employee>) ManipulateEmp.getAllEmployee(mid);
		
		request.setAttribute("empList", empList);
		try {
			request.getRequestDispatcher("home.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Employee emp :empList) {
			System.out.println(emp);
		}
		
		try {
			ExcelRead.readFromExcel();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
