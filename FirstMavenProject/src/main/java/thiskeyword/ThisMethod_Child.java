package thiskeyword;

public class ThisMethod_Child extends ThisMethod_Parent{

	public static void main(String[] args) {
		ThisMethod_Child object=new ThisMethod_Child ();
		object.sum();
		
		
	}
public void sum()
{
	int x=8,y=9;
	int z=x+y;
	{
System.out.println(z);
super.display();
}
	}
}

