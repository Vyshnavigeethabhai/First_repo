package salary_assignment_inheritance_package;

public class SalaryHRA_class2 extends BasicPayCalc_Class1 
{
	double hrapercentage;
	double pfpercentage;
 void hraandpfcalc()
{
hrapercentage=0.05*basicpay;
pfpercentage=0.20*basicpay;
	 System.out.println("The House Rent Allowance is:" + hrapercentage);
	System.out.println("The Provident Fund allowance is:" + pfpercentage);
	

}
}
