package bean;

public class Department {
	
	
	private int dId;
	private String department_name;
	
	
	public Department(int dId, String department_name) {
		this.dId = dId;
		this .department_name  = department_name;
	}


	public int getdId() {
		return dId;
	}


	public void setdId(int dId) {
		this.dId = dId;
	}


	public String getDepartment_name() {
		return department_name;
	}


	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

}
