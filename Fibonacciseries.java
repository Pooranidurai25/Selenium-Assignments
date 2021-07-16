package week1day1;

public class Fibonacciseries {
	
//	 * Goal: To find Fibonacci Series for a given range
//	 * 
//	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
//	 * 
//	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
//	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
//	 * enter
//	 * 
//	 * What are my learnings from this code? 
//	1) generation of series of numbers
//	2) for loop
//	3) assigning of one variable to another
//	 * 
//	 */

	public static void main(String[] args) {
		
		int range =8, firstNum= 0, secNum= 1, sum;
		
		System.out.println(firstNum);

		for (int i = 1; i <=range; i++) 
		{
			sum= firstNum + secNum;
			firstNum= secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
		
	}

}
