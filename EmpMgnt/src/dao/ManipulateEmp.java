package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import model.Employee;


public class ManipulateEmp{
	
	private static Connection con = DBCon.getConnection();
	
	public static Collection<Employee> getAllEmployee(String mId) {

		Collection<Employee> c = new ArrayList<Employee>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from EmpMgnt.Employee where mngr_id = ?");
			ps.setInt(1, Integer.parseInt(mId));
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getInt("mngr_id"), rs.getString("date"),
						rs.getString("in_time"), rs.getString("out_time"), rs.getString("join_date"));
				c.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public static void insertEmployee() {
		
	}
}