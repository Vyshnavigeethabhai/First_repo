package interface_package;

public class Interface_Child1 implements Interface_parent1 {

	public static void main(String[] args) {
		Interface_Child1 obj=new Interface_Child1();
		obj.add();

	}

	@Override
	public void add() {
		int a=15,b=3;
		int c=a+b;
		System.out.println(c);
		
		
	}

}
