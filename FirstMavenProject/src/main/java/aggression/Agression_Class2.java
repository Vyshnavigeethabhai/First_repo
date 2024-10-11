package aggression;

public class Agression_Class2 {
	String hobby;
	int roll_no;
	Agression_Class1 ref;
public Agression_Class2 (String hobby,int roll_no,Agression_Class1 ref)
{
	this.hobby=hobby;
	this.roll_no=roll_no;
	this.ref=ref;
	
}
	public static void main(String[] args) {
		Agression_Class1 obj=new Agression_Class1("Vyshnavi",26);
		Agression_Class2 obj1=new Agression_Class2("Watching Movies",20,obj);
		obj1.display();

	}
public void display()
{
	System.out.println(ref.name+" "+ref.age);
	System.out.println(hobby+" "+roll_no);
}
}
