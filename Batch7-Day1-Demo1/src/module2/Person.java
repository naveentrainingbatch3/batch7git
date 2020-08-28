
package module2;

public class Person {
		int rollNumber;
		String name;

		public Person(int rollNumber,String name)
		{
		 this.rollNumber=rollNumber;
		this.name=name;
		}

		public void display()
		{
		 System.out.println("RollNumber :"+rollNumber);
		 System.out.println("Name :"+name);
		}
		public static void main(String[] args)
		{
		 Person p=new Person(11,"Bikash");
		 Person p1=new Person(12,"Diksha");
		p.display();
		p1.display();
		}
		}
