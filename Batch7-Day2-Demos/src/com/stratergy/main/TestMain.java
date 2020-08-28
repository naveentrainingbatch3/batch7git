package com.stratergy.main;

import com.model.Designation;
import com.model.Employee;
import com.stratergy.PayAlgorithm;
import com.stratergy.impl.InternPayAlgorthm;
import com.stratergy.impl.TraineePayAlgorithm;
import com.stratergy.impl.WebDesignerAlgorithm;
import com.stratergy.impl.WebDeveloperPayAlgorithm;

public class TestMain {
	public static void main(String[] args) {
		PayAlgorithm interPayAlgorithm=new InternPayAlgorthm();
		PayAlgorithm traineePayAlgorithm=new TraineePayAlgorithm();
		PayAlgorithm webDesignerPayAlgorithm=new WebDesignerAlgorithm();
		PayAlgorithm webDeveloperAlgorithm=new WebDeveloperPayAlgorithm();

		Designation intern=new Designation("intern", interPayAlgorithm, 20000.00);
		Designation trainee=new Designation("trainee", traineePayAlgorithm, 25000.00);
		Designation webDesigner=new Designation("webDesigner", webDesignerPayAlgorithm, 30000.00);
		Designation webDeveloper=new Designation("webDeveloper", webDeveloperAlgorithm, 35000.00);
		Employee emp=new Employee("Animesh",intern);
		Employee emp1=new Employee("Ashuwathy",trainee);
		Employee emp2=new Employee("Bikash",webDesigner);
		Employee emp3=new Employee("Diksha",webDeveloper);
		System.out.println(emp.getEmployeeName()+" with designation "+emp.getDesignation().getDesignation()+ "total pay is "+emp.getPay());
		System.out.println(emp1.getEmployeeName()+" with designation "+emp1.getDesignation().getDesignation()+ "total pay is "+emp1.getPay());
		System.out.println(emp2.getEmployeeName()+" with designation "+emp2.getDesignation().getDesignation()+ "total pay is "+emp2.getPay());
		System.out.println(emp3.getEmployeeName()+" with designation "+emp3.getDesignation().getDesignation()+ "total pay is "+emp3.getPay());
	
	System.out.println("Changing Pay algorithm for Employee 1");
	emp.setPayAlgorithm(traineePayAlgorithm);
	System.out.println("After Change");
	System.out.println(emp.getEmployeeName()+" with designation "+emp.getDesignation().getDesignation()+ "total pay is "+emp.getPay());
	}
}
