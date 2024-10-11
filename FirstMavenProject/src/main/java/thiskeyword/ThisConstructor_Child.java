package thiskeyword;

public class ThisConstructor_Child extends  ThisConstructor_Parent{
	public ThisConstructor_Child(String text)
	{
		System.out.println(text);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor_Child obj=new ThisConstructor_Child("Focus on Constructor");
	
	}

}
