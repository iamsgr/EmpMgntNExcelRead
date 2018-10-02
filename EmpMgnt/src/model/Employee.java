package model;

public class Employee {

	private int emp_id;
	private int mngr_id;
	private String emp_name;
	private String date;
	private String in_time;
	private String out_time;
	private String join_Date;


	public Employee() { }

	public Employee(int emp_id, String emp_name, int mngr_id, String date, String in_time, String out_time, String join_Date) {
		super();
		this.emp_id = emp_id;
		this.mngr_id = mngr_id;
		this.emp_name = emp_name;
		this.date = date;
		this.in_time = in_time;
		this.out_time = out_time;
		this.join_Date = join_Date;

	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getMngr_id() {
		return mngr_id;
	}

	public void setMngr_id(int mngr_id) {
		this.mngr_id = mngr_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIn_time() {
		return in_time;
	}

	public void setIn_time(String in_time) {
		this.in_time = in_time;
	}

	public String getOut_time() {
		return out_time;
	}

	public void setOut_time(String out_time) {
		this.out_time = out_time;
	}

	public String getJoin_Date() {
		return join_Date;
	}

	public void setJoin_Date(String join_Date) {
		this.join_Date = join_Date;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", mngr_id=" + mngr_id + ", emp_name=" + emp_name + ", date=" + date
				+ ", in_time=" + in_time + ", out_time=" + out_time + ", join_Date=" + join_Date + "]";
	}

}
