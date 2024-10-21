package exceptionexample;

public class Arithmetic_Exceptionsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10, b=0;
try
{
int c=a/b;
System.out.println(c);
}
/*catch(ArithmeticException x)
{
	int d=a+b;
	System.out.println(d);
	System.out.println(x);
}*/
finally
{
	System.out.println("Execution Completed");
}
}


	}


