
/**
 * A program that accept an integer (between 1 - 32000) and 
 * count the number of primes between 2 and that number[inclusive].
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#2, problem 2  
 * 3 November 2016
 */
import java.util.Scanner;

public class Homework2P2 {
	private static int useInt, l, counter;
	private static int[] wholeNum;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String response;
		do {
			System.out.println("Enter an integer number: ");
			useInt = input.nextInt();
			if (useInt <= 1) {
				do {
					System.out.println("The input number has no prime number, please try another number");
					useInt = input.nextInt();
				} while (useInt <= 1);
			}
			wholeNum = new int[useInt];
			
			l = 0;
			counter = 0;
			for (int p = 1; p <= useInt; p++) {
				if (p == 1)
					wholeNum[p - 1] = 0;
				else
					wholeNum[p - 1] = p;
			}
			while (l <= wholeNum.length - 1) {

				if ((wholeNum[l] != 0) && ((wholeNum[l] + wholeNum[l] - 1) < wholeNum.length))
					for (int i = wholeNum[l]; i <= (useInt - wholeNum[l]); i = (i + wholeNum[l])) {
						wholeNum[i - 1 + wholeNum[l]] = 0;
					}
				l++;
			}
			for (int j = 0; j <= wholeNum.length - 1; j++) {
				if (wholeNum[j] != 0)
					counter++;
			}
			System.out.println("There are " + counter + " prime number in this input");
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}
}
