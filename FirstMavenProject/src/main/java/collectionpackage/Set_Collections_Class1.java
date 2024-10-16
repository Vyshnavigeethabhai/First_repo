package collectionpackage;

import java.util.HashSet;
import java.util.Set;

public class Set_Collections_Class1 {

	public static void main(String[] args) {
	Set <String> obj=new HashSet <String>();
	{
		obj.add("Song A");
		obj.add("Song B");
		obj.add("Song C");
		obj.add("Song D");
		obj.add("Song E");
		System.out.println("All Songs In the Set: " + obj);
		boolean containsB=obj.contains("Song B");
		System.out.println("Does the set Contains Song B" + obj);
		obj.remove("Song D");
		System.out.println("Song D Removed: "+ obj);
		obj.clear();
		System.out.println("After clearing the elements:" + obj);
		
		Set<Integer> obj1=new HashSet<Integer>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		System.out.println("Set Contains: "+ obj1);
		obj1.contains(2);
		System.out.println(" Does theSet Contains 2 :" + obj1);
		obj1.remove(5);
		System.out.println(" After removing 5 : "+ obj1);
		boolean empty=obj1.isEmpty();
		System.out.println(obj1);
        obj1.clear();
        System.out.println("After clearing the elements:" + obj1);
		
		
		
		
	}
	

	}

}
