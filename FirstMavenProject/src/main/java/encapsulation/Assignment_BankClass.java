package encapsulation;

public class Assignment_BankClass
{
	private int pinnumber;

public void setdetail(int pinnumber)
{
	this.pinnumber=pinnumber;
	
}
	public void validatePin()
	{
		int validPins[]= {1001,1234,1212};
		for(int validPin:validPins)
		{
			if(this.pinnumber==validPin)
			
			{
	System.out.println(" Valid Pin Number! You can withdraw cash");
return;
			}
		}
	System.out.println(" InValid Pin Number! Pleae Try Again");
	
}
		}
		


		


