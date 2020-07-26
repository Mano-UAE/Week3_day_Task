package week3day1;

// Method Overriding

public class AxisBank extends BankInfo
{

	public void deposit()
	{
		System.out.println("20%");
	}
	public static void main(String[] args) 
	{
		AxisBank AB=new AxisBank();
		AB.deposit();

	}

}
