package collectionpackage;

import java.util.ArrayList;
import java.util.List;

public class GenericListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> obj=new  ArrayList <String>();
obj.add("White");
obj.add("Vyshnavi");
obj.add("White");
obj.add("Yellow");
System.out.println(obj);
obj.set(1,"Blue");
System.out.println(obj);
System.out.println(obj.indexOf("White"));
System.out.println(obj.lastIndexOf("White"));
obj.remove(1);
System.out.println(obj);
System.out.println(obj.get(0));
System.out.println(obj.contains("White"));
	}

}
