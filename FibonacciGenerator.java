package algorithms;

import java.util.Scanner;

/**
 * This class will generate a list of fibonacci numbers
 * @author Richard
 *
 */
public class FibonacciGenerator {

	/**
	 * This method will generate a list of fibonacci numbers
	 * @param args
	 */
	public static void main(String[] args) {
		//declare vars and set initial values
		int number = 0, previousNumber = 0, twoNumbersAgo = 1;
		Scanner input = new Scanner(System.in);
		
		//prompt user for nth number
		System.out.println("Enter the n'th number for your Fibonacci series: ");
		
		//set loop counter equal to given nth number
		int n = input.nextInt();
		
		//loop through as many times as n
		for (int counter=1;counter<=n;counter++){
				
			//setting each new number in list equal to the sum of the previous two
			number = (previousNumber) + (twoNumbersAgo);
				
			//print out number
			System.out.print(number+" ");
				
			//change vars to be next two numbers
			twoNumbersAgo = previousNumber;
			previousNumber = number;	
		}
		//close resources
		input.close();
	}
}
