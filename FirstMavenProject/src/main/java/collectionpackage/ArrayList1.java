package collectionpackage;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
	ArrayList <String> obj=new ArrayList <String>();
	obj.add("Blue");
	obj.add("White");
	obj.add("Green");
	obj.add("Yellow");
	System.out.println(obj);
	ArrayList <String> obj1=new ArrayList <String>();
	obj1.add("Apple");
	obj1.add("Grapes");
	obj1.add("Banana");
	obj1.add("Orange");
	obj.addAll(obj1);
	System.out.println(obj);
	System.out.println(obj.contains("Yellow"));
	System.out.println(obj.get(2));
	System.out.println(obj1.get(2));
	System.out.println(obj.get(7));
	System.out.println(obj.isEmpty());
	obj.remove(3);
	System.out.println(obj);
	System.out.println(obj.size());
	}

}
