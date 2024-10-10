package inheritancepackage;

public class HierarchicalChild_B extends HierarchicalParent_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild_B obj=new HierarchicalChild_B ();
		obj.Sum();
		obj.Sub();
	}
public void Sub()
{
	int a=10,b=4;
	int c=a-b;
	System.out.println("The Answer is:" +c);
}
}
