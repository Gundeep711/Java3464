package OOPSConcept;

public class Employee {
	private String name;
	private int ID;
	private String department;
	private String jobTitle;
	
	public Employee(String EmpName,int ID,String department,String jobTitle)
	{
		this.name=EmpName;
		this.ID=ID;
		this.department=department;
		this.jobTitle=jobTitle;
	}
	
	public Employee(String EmpName,String jobTitle) {
		this.name=EmpName;
		this.jobTitle=jobTitle;
		this.ID=0;
		this.department="";
		
	}
	
	public Employee()
	{
		this.name="";
		this.jobTitle="";
		this.ID=0;
		this.department="";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	

}
