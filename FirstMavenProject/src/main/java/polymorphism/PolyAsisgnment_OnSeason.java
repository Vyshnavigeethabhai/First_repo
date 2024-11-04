package polymorphism;

public class PolyAsisgnment_OnSeason 
{
public void discountcalc(double originalprice, double discountpercentage)
{
	double discountAmount=discountpercentage*originalprice;
	double finalprice=originalprice-discountAmount;
	//print the prices
	System.out.println("On Season Price Details:");
	System.out.println("The original price is:"+originalprice);
	System.out.println("The discount percentage is:"+ discountpercentage);
	System.out.println("The final price is: "+finalprice );
}
}
