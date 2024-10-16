package interface_package;

public class MultpleInheritance_Childeg1 implements Interface_parenteg1,Interface_Parenteg2  {

	public static void main(String[] args) {
		MultpleInheritance_Childeg1 obj=new MultpleInheritance_Childeg1();
		obj.display();
		obj.sum();

	}

	@Override
	public void sum() {
		int x=3,y=4;
		int z=x+y;
		System.out.println(z);
		
		
	}

	@Override
	public void display() {
		System.out.println("Hi, Vyshnavi");
		
	}

}
