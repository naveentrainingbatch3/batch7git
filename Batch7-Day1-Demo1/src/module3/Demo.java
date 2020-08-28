package module3;

abstract class Demo extends Object {
	
	int a=26;
	Demo() {

		System.out.println("Demo class Constructor"+a);
	}
	//virtual
	 abstract void display();
	 void show()
		{
			System.out.println("Show method in parent class"+a);
		}
	
}

  class Test extends Demo {
	Test() {// super();
		System.out.println("Test class Constructor"+a);
	}

	
	  void display() { System.out.println("Display method in child class" ); }
	 
	public static void main(String[] args) {

		Demo t = new Test();
		t.display();//upcasting
		t.show();
		
	}
}
