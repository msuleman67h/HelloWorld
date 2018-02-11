
/* Collatz Sequence Collatz Sequence
 * In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1. 
 * This is widely believed to be true, but has never been formally proved. Write a program CollatzSequence.c that 
 * inputs a number from the user, and then displays the Collatz Sequence starting from that number. Stop when you 
 * reach 1.
 */
import java.util.Scanner;

public class practices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loopRun = false;
		
		System.out.print("Enter a number: ");
		
		// Take any natural number n (dividend).
		int dividend = input.nextInt();
		
		for (int z = 0; dividend != 1; z++) { // Repeat the process indefinitely until dividend becomes 1.

			if (dividend % 2 == 0) { //checking for even number. If n is even, divide it by 2 to get n / 2.
				/*
				 * dividing dividend by 2 because in next iteration the value of remainder becomes dividend.
				 */
				dividend /= 2;
			} else {
				dividend = (3 * dividend) + 1;  // If n is odd, multiply it by 3 and add 1 to get 3n + 1.
			}
			System.out.println("The answer is > "+dividend);
			/*
			 *  sets the values to true so that the program knows the value (dividend = 1) is from
			 *  calculation not from user input.
			 */
			loopRun = true;
		}
		if(dividend == 1 && loopRun == false) {  // If the users enters 1 as dividend and loop didn't run
			System.out.println("The answer is > "+dividend);
		}
	}

}
