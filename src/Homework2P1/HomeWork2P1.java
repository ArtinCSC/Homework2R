/**
	 * DRIVER 
	 * A program to accept two fractions and one operator (+, -, /, or*).
	 * Print out the resulted reduced fraction.
	 * Artin Malekian
	 * Professor Hoang
	 * CSC 201 - Assignment#2, problem 1  
	 * 18 October 2016
	 */

package Homework2P1;

import java.util.Scanner;

public class HomeWork2P1 {

	public static void main(String[] args) {
		String response;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("Enter your first fraction number: Numerator and denominator");
			int nume1 = input.nextInt();
			int denom1 = input.nextInt();
			System.out.println("Enter the operator");
			String operat = input.next();
			int operatI = operat.charAt(0);
			char operatC = (char) operatI;

			System.out.println("Enter your second fraction number: Numerator and denominator");
			int nume2 = input.nextInt();
			int denom2 = input.nextInt();

			Homework2P1Object f1 = new Homework2P1Object();

			switch (operatC) { // Calculate the number base on the operator.
			case '-':
				f1.subtr(nume1, denom1, nume2, denom2);
				break;

			case '+':
				f1.add(nume1, denom1, nume2, denom2);
				break;

			case '*':
				f1.mult(nume1, denom1, nume2, denom2);
				break;

			case '/':
				f1.dvit(nume1, denom1, nume2, denom2);
				break;
			}
			System.out.println(f1);

			System.out.println();
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}
}
