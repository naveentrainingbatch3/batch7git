package module4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	int a, b, c;
	Scanner sc;
	void accept()throws ArithmeticException,InputMismatchException {
		System.out.println("Accept Method Begins");
		sc=new Scanner(System.in);
	/*	try
		{*/
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();

			c=a/b;
		

	/*	catch(ArithmeticException exp)
		{
			System.out.println("Please enter Non Zero Positive Number");
		}catch(InputMismatchException e)
		{
			System.out.println("Please enter the digits without decimal point");
		}
		catch(Exception ex1)
		{
			System.out.println("Main exception");
		}
		finally
		{
			sc.close();
			System.out.println("Finally block");
		}*/
		System.out.println("Result"+c);
		System.out.println("Accept Method Ends");
	}

	void display() {
		System.out.println("Display method Started");
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Demo1 d = new Demo1();
		try
		{
		d.accept();
		}catch(ArithmeticException exp)
		{
			System.out.println("Please enter Non Zero Positive Number");
		}catch(InputMismatchException e)
		{
			System.out.println("Please enter the digits without decimal point");
		}
		catch(Exception ex1)
		{
			System.out.println("Main exception");
		}
		d.display();
		System.out.println("Main method ended");

	}
}
