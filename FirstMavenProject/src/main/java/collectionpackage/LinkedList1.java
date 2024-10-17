package collectionpackage;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList <String> obj=new LinkedList <String>();
	obj.add("Tomato");
	obj.add("Potato");
	obj.add("Okra");
	obj.add("Carrot");
	System.out.println(obj);
	LinkedList <String> obj1=new LinkedList <String>();
	obj.add("Rose");
	obj.add("Jasmine");
	obj.add("SunFlower");
	obj.add("Hibiscus");
	obj.addAll(obj1);
	System.out.println(obj);
	System.out.println(obj.contains("Okra"));
	System.out.println(obj.get(7));
	obj.remove(7);
	System.out.println(obj);
	System.out.println(obj.isEmpty());
	System.out.println(obj.size());
	
		

	}

}
