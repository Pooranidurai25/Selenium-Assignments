package week1day1;

public class Factorial {
	
	//factorial is identified using FOR loop
	
	
	//Goal: Find the Factorial of a given number
	  
	 // input: 5
	 //output: 5*4*3*2*1 = 120
	 
	 // Shortcuts:
	 // 1) Print : type: syso, followed by: ctrl + space + enter
	 // 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	  
	 // What are my learnings from this code?
	 // 1) how to use for loop
	 // 2) iterating the value
	 // 3) printout statement  inside the for loop and outside the loop
	 	

	public static void main(String[] args) {
		
		int  input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			
			fact= fact*i;
			
		}
		System.out.println("factorial of 5 is" +   fact);
		
			}

}
