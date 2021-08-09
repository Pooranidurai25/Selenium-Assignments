package week3day1;

public class EqualString {

	public static void main(String[] args) 
	
	{
		String a1="I am Learning Java" ;
		String a2="I am learning java";
		// .equals is case sensitive will return false value
		if (a1.equals(a2)) 
		
		{
			System.out.println("true");
		} 
		else 
		{
			System.out.println("false");

		}
		
		// .equalIgnoreCase is non case sensitive
		
		if (a1.equalsIgnoreCase(a2)) 
		{
			System.out.println("true");

		} 
		else 
		{
			System.out.println("false");

		}
		
		
		
	}

}
