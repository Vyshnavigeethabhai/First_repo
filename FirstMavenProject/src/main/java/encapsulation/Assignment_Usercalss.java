package encapsulation;

import java.util.Scanner;

public class Assignment_Usercalss extends  Assignment_BankClass{

	public static void main(String[] args) {
		Assignment_BankClass object=new Assignment_BankClass();
		Scanner object1=new Scanner(System.in);
		//get pin from user
		System.out.println("Enter your pin");
		int enteredpin=object1.nextInt();
		object.setdetail(enteredpin);
		object.validatePin();
		

	}

}
