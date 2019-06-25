package OOPSConcept;

import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Pokemon a=new Pokemon("Pickachu", "electric", 100);
		Pokemon b=new Pokemon("Charizad", "Fire", 500);
		System.out.println(a.getName());//directly accessing the variable if variable is public only
		
		Player p=new Player("Peter", 100);
		p.addPokemon(a);
		p.addPokemon(b);
		p.printTeam();*/
		
		/*Employee e1=new Employee("John Smith",9,"IT","Manager");
		Employee e2=new Employee("Peter Karan",234,"IT","Engineer");
		Employee e3=new Employee("Laura Yao",1555,"Accounting","Finance Specialist");
		
		
		System.out.println("Employee 1 name "+e1.getName()+" and department "+e1.getDepartment());
		System.out.println("Employee 2 name "+e2.getName()+" and department "+e2.getDepartment());
		System.out.println("Employee 3 name "+e3.getName()+" and department "+e3.getDepartment());
		
		
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Company objCompany = new Company("Accenture", emp);
		System.out.println(objCompany.getEmployees().size());
		System.out.println(objCompany.employeeCount());
		objCompany.hireEmployee("Giselle da Silva", "Marketing Specialist");
		objCompany.fireEmployee("John Smith");
		objCompany.displayReport();
*/
		CubeProblem cube1=new CubeProblem(5);
		cube1.outputCubeInfo();
		
		
	}

}
