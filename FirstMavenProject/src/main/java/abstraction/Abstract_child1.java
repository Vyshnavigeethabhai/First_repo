package abstraction;

public class Abstract_child1 extends Abstract_parent1 {

	public static void main(String[] args) {
		Abstract_child1 obj=new Abstract_child1 ();
		obj.animalname();
		obj.animalsound();

	}

	@Override
	public void animalsound() {
		System.out.println("The animal sound is bow bow");
		
	}

}
