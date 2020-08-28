import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	List<String> al =new ArrayList<String>();
	al.add("Sakshi");
	al.add("Sarthak");
	al.add("Sneha");
	al.add("Sarthak");
	al.add("Ritesh");
	al.add("Ritika");
	al.add("Rahul");
	al.add("Sakshi");
	System.out.println("Collection "+al);
	for(String str:al)
	{
		System.out.println("Welcome :"+str);
	}
	al.remove("Sakshi");
	System.out.println("Collection "+al);
	al.remove(2);
	System.out.println("Collection "+al);
	al.add(5,"Naveen Kumar");
	System.out.println("Collection "+al);
	
}
}
