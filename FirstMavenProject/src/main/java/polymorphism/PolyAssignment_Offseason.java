package polymorphism;

public class PolyAssignment_Offseason extends PolyAsisgnment_OnSeason {

	public static void main(String[] args) {
		
		 PolyAssignment_Offseason object=new  PolyAssignment_Offseason();
		 object.discountcalc(1500.00, 0.15);
	}
	
	public void discountcalc(double originalprice, double discountpercentage)
	{
		double discountAmount=discountpercentage*originalprice;
		double finalprice=originalprice-discountAmount;
		//print the price details
		
		System.out.println("Off Season price details");
		System.out.println("The original price is:"+originalprice);
		System.out.println("The discount percentage is:"+ discountpercentage);
		System.out.println("The final price is: "+finalprice );
	     super.discountcalc(1500.00, 0.40);
}
}
