package practices;

import java.util.Scanner;

public class practices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Collatz Sequence Collatz Sequence
//		Take any natural number n.
//		 If n is even, divide it by 2 to get n / 2.
//		 If n is odd, multiply it by 3 and add 1 to get 3n + 1.
//		 Repeat the process indefinitely.

//		In 1937, Lothar Collatz proposed that no matter what number you begin with, the sequence eventually reaches 1. This is widely believed to be true, but has never been formally proved.
//		Write a program CollatzSequence.c that inputs a number from the user, and then displays the Collatz Sequence starting from that number. Stop when you reach 1.


		int tem = 0;
		System.out.println("Enter A number: ");
		int enter = input.nextInt();

		for (int z = 0;tem == 1; z++) {

			if (enter % 2 == 0) {
				tem = enter / 2;				//checking for even num
			} else {
				tem = (3 * enter) + 1;				// checking for odd num
			}
			System.out.print(tem + "   ");

		}
	}

}
