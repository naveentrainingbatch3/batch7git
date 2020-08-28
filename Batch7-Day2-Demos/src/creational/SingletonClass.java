package creational;

public class SingletonClass {
	//Have a private static instance variable //Eager Loading as your JVM odes the static first so its eager way
		private static SingletonClass instance1=new SingletonClass();
	//Have a private static instance variable
	private static SingletonClass instance;
	//Make your constructor private
	private SingletonClass()
	{
		
	}
	
	//Lazy Loading
	//Have a method which will create one instance and share to various reference
	public static SingletonClass getInstance()
	{
		synchronized (SingletonClass.class) {
			
		
		if(instance== null)
		{
		instance=new SingletonClass();
		}
		return instance;
		}
	}

}
