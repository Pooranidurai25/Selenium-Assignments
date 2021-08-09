package week3day1;

public class Axis  extends BankInfo{
	
	
	@Override
	public void depoist(int period, int amnt)
	{
		int principal= period + amnt;
		System.out.println(principal);
	}
}
