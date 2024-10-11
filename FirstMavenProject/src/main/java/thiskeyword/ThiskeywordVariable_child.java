package thiskeyword;

public class ThiskeywordVariable_child extends ThisParent_Variable  {
	String a1="This is a Child class";

	public static void main(String[] args) {
	
		ThiskeywordVariable_child obj=new ThiskeywordVariable_child();
		obj.display();
	
	}
public void display()
{
	System.out.println(a1);
	System.out.println(super.c);
}
}
