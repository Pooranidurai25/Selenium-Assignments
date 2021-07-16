package week1day1;

public class Armstrong {
	
	//*
//	 * Goal: To find whether a number is an Armstrong number or not
//	 * 
//	 * inputs: 153
//	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
//	 * 
//	 * Shortcuts:
//	 * 1) Print : type: syso, followed by: ctrl + space + enter
//	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
//	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
//	 *   
//	 * What are my learnings from this code?
//	 * 1)
//	 * 2)
//	 * 3) 
	 

	public static void main(String[] args)
	{
		int input = 153;
		int result= 0, remainder, original;
		original= input;
		while (original>0)
		{
		  remainder = original % 10;
		  original= original/10;
		  result= result+ remainder*remainder*remainder;
		  
				
			
		}
		if (result== input) 
		{
			System.out.println(input + "  is armstrong");
			
		}
		else
		{System.out.println(input +  " is not armstrong");
		}
		
		

	}

}
