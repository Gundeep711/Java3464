package OOPSConcept;

import java.util.ArrayList;

public class Company {
	
	private String name;
	private ArrayList<Employee> employees=new ArrayList<Employee>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public Company(String name, ArrayList employees)
	{
		this.name=name;
		this.employees=employees;
	}
	
	public void hireEmployee(String name,String jTitle)
	{
		Employee e=new Employee(name,jTitle);
		this.employees.add(e);
	}
	
	public void fireEmployee(String employeeName)
	{
		for(int i=0;i<employees.size();i++)
		{
			Employee e=this.employees.get(i);
			if(e.getName()==employeeName)
			{
				e.setDepartment("");
				e.setJobTitle("");

			}
			
		}
	}
	public int employeeCount() {
		
		return this.employees.size();
	}
	public void displayReport()
	{
		for(int i=0;i<employees.size();i++)
		{
			Employee e=this.employees.get(i);
			System.out.println("Employee Name : "+e.getName());
			System.out.println("Employee Department: "+e.getDepartment());
		}
		
	}
		
}
