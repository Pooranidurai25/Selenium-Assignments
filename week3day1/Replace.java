package week3day1;

public class Replace {

	public static void main(String[] args)
	
	{
	String sentence ="I am working with Java8";
	
	String replace = sentence.replace("8", "11");
	
	char add = '#';
	System.out.println(sentence + add);
	
	System.out.println(replace);
	
	String substring = sentence.substring(5, 14);
	System.out.println(substring);
	
	
	}

}
