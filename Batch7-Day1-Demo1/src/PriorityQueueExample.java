import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
public static void main(String[] args) {
	
	PriorityQueue<String> al =new PriorityQueue<String>();
	al.add("Sakshi");
	al.add("Sarthak");
	al.add("Sneha");
	al.add("Sarthak");
	al.add("Ritesh");
	al.add("Ritika");
	al.add("Rahul");
	al.add("Sakshi");
	System.out.println("Collection "+al);
	Iterator it  = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
//	for(String str:al)
//	{
//		System.out.println("Welcome :"+str);
//	}
	al.peek();
	System.out.println("Collection "+al);
	//al.remove(2);
	al.poll();
	System.out.println("Collection "+al);
	
	System.out.println("Collection "+al);
	
}
}
