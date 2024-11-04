package abstraction;

public class Contractorclass_child extends Abstract_SuperclassEmployee{

	public static void main(String[] args) {
		
		Contractorclass_child obj=new Contractorclass_child();
		obj.calculateSalary();
		obj.calculateFulltimeSalary(8, 100);

	}

	@Override
	public void calculateSalary()
	{
		int workinghours = 5;
		int paymentperhour=100;
		int contractorSalary=workinghours*paymentperhour;
		System.out.println("The contractor Salary is: "+ " "+contractorSalary);
		
	}
public void calculateFulltimeSalary(int workinghours,int paymentperhour)
{
	int fulltimeEmployeeSalary=workinghours*paymentperhour;
	System.out.println("Fulltime Employee Salary Is:"+ fulltimeEmployeeSalary);
}
}
