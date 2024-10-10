package acessmodifierpackage;

public class AccessModifierExample1 {
	public void Display1()
	{
		System.out.println("This is a Public Method");
	}
	private void Dispaly2()
	{
		System.out.println("This is a Private Method");
	}
protected void Display3()
{
	System.out.println("This is a Protected Method");
}
void Display4()
{
	System.out.println("This is a Default Method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierExample1	obj=new AccessModifierExample1();
		obj.Display1();
		obj.Dispaly2();
		obj.Display3();
		obj.Display4();

	}

}
