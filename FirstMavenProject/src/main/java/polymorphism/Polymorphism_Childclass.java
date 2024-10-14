package polymorphism;

public class Polymorphism_Childclass extends Ploymorphism_parentclass {

	public static void main(String[] args) {
		Polymorphism_Childclass obj=new Polymorphism_Childclass();
		obj.display(25, 5);
	}
		public void display(int a,int b)
		{
			super.display(25, 7);
		int c=a-b;
		System.out.println(c);
		}
	
	}


