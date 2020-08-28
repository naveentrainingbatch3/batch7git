package module1;

public class Employees {

	int employeeId;
	double salary;
	static String company= "Edureka";
	
	static void check()
	{
		company="AMDOCS";
	}
	public Employees(int employeeId,double salary)
	{
		this.employeeId=employeeId;
		this.salary=salary;
		System.out.println("EmployeeID :"+employeeId);
		System.out.println("Salary :"+salary);
		System.out.println("Comapny :"+company);
	}

	void display()
	{
		System.out.println("EmployeeID :"+employeeId);
		System.out.println("Salary :"+salary);
		System.out.println("Comapny :"+company);
	}
public static void main(String[] args) {
	Employees.check();
	Employees e1=new Employees(13,45000.00);
	Employees e2=new Employees(14,55000.00);
	e1.display();
	e2.display();
	
	
}
}
