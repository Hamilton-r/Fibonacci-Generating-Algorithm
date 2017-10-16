/**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * @author Richard
 *
 */
public class FibonacciGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 0, number2 = 0, number3 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the n'th number for your Fibonacci series: ");
		int n = input.nextInt();
		for (int i=1;i<=n;i++){
				number = (number2) + (number3);
				System.out.print(number+" ");
				number3 = number2;
				number2 = number;	
		}
		input.close();
	}
}
