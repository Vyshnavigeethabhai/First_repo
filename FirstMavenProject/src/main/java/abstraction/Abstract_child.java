package abstraction;

public class Abstract_child extends Abstract_Class1{

	public static void main(String[] args) {
		
		Abstract_child obj=new Abstract_child();
		obj.display();
		obj.Display1();

	}

	@Override
	public void Display1() {
		System.out.println("Welcome");
		// TODO Auto-generated method stub
		
	}

}
