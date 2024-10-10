package inheritancepackage;

public class HierarchicalChild_C extends HierarchicalParent_A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild_C obj1=new HierarchicalChild_C();
			obj1.Sum();
			obj1.display();
	}
public void display()
{
	System.out.println("I'm a Hierarchical Child");
}
}
