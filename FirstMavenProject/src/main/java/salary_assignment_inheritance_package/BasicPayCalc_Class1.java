package salary_assignment_inheritance_package;

import java.util.Scanner;

public class BasicPayCalc_Class1 
{
float basicpay;
float deductions;
float bonus;
float netsalary;
public void display()
{
	Scanner obj= new Scanner(System.in);
	{
//Get basic from the console
		System.out.println("Enter Basic Pay");
		 basicpay=obj.nextFloat();
		//Get deductions from the console
		System.out.println("Enter Deductions");
		 deductions=obj.nextFloat();
		//Get bonus pay from the console
		System.out.println("Enter BonusPay");
		 bonus=obj.nextFloat();
		//Get Net salary from the console
	 netsalary=basicpay-deductions+bonus;
	System.out.println(netsalary);
		
	}
		}
}