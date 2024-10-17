package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface1 {

	public static void main(String[] args) {
		ArrayList <String> obj=new ArrayList <String>();
		obj.add("Sky");
		obj.add("Ocean");
		obj.add("Leaf");
		obj.add("Wind");
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
it.remove();
System.out.println(obj);
	}
}

