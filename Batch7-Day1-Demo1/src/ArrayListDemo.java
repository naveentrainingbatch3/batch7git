import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
public static void main(String[] args) {
	Collection<Integer> c=new ArrayList<Integer>();
	c.add(24);
	c.add(25);
	c.add(26);
	c.add(27);
	//c.add("Naveen");
	c.add(28);
	c.add(29);
	ArrayListDemo d=new ArrayListDemo();
	int p=d.sum(c);
	System.out.println("Sum of Collection"+p);
	
}

private int sum(Collection<Integer> c) {
	int x=0,y=0;
	for(Integer o:c)
	{
	// Integer i=(Integer)o;//Downcasting
	 x=o;//Auto Unboxing
	 y+=x;
	}   
	return y;
}
}
