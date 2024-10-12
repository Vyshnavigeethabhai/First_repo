package salary_assignment_inheritance_package;

public class SalarySlip_Class3 extends  SalaryHRA_class2{

	double totalsalary;
	public static void main(String[] args) {
		SalarySlip_Class3 object=new SalarySlip_Class3 ();
	
        object.display();
        object.hraandpfcalc();
		object.display1();
        object.display3();
	

	}
public void display1()
{
 totalsalary=netsalary+hrapercentage-pfpercentage;
	System.out.println("Total salary in hand: "+ totalsalary);
}
public void display3()
{
	System.out.println("The salary slip contains:");
	System.out.println("Basic pay:"+ basicpay);
	System.out.println("Deductions: "+ deductions);
	System.out.println("Bonus:" + bonus);
	System.out.println("hra:"+ hrapercentage);
	System.out.println("pf:"+ pfpercentage);
	System.out.println("Total Salary:"+ totalsalary);
}
}
