/** 
 * OBJECT
 * A program to accept two fractions and one operator (+, -, /, or*).
 * Print out the resulted reduced fraction.
 * Artin Malekian
 * Professor Hoang
 * CSC 201 - Assignment#2, problem 1  
 * 18 October 2016
 */

package Homework2P1;

public class Homework2P1Object {

	private int nume1, denom1, nume2, denom2, numeR, comDeno;
	private char operator;
	private String myString = " ";

	public void subtr(int nume1, int denom1, int nume2, int denom2) {
		this.nume1 = nume1;
		this.denom1 = denom1;
		this.nume2 = nume2;
		this.denom2 = denom2;

		nume1 = nume1 * denom2;
		nume2 = nume2 * denom1;
		numeR = nume1 - nume2;
		comDeno = denom1 * denom2;
	}

	public void add(int nume1, int denom1, int nume2, int denom2) {
		this.nume1 = nume1;
		this.denom1 = denom1;
		this.nume2 = nume2;
		this.denom2 = denom2;

		nume1 = nume1 * denom2;
		nume2 = nume2 * denom1;
		numeR = nume1 + nume2;
		comDeno = denom1 * denom2;
	}

	public void mult(int nume1, int denom1, int nume2, int denom2) {
		this.nume1 = nume1;
		this.denom1 = denom1;
		this.nume2 = nume2;
		this.denom2 = denom2;

		numeR = nume1 * nume2;
		comDeno = denom1 * denom2;
	}

	public void dvit(int nume1, int denom1, int nume2, int denom2) {
		this.nume1 = nume1;
		this.denom1 = denom1;
		this.nume2 = nume2;
		this.denom2 = denom2;

		numeR = nume1 * denom2;
		comDeno = denom1 * nume2;
	}

	/*
	 * //Precondition: inputs are both Integer. Postcondition: Retur a
	 * calculated //integer number.
	 */

	private static int calcGCm(int a, int b) {
		int result = 0;
		if (b == 0) {
			result = a;
		} else {
			result = calcGCm(b, a % b);
		}
		return result;
	}
	/*
	 * //Precondition: inputs are both Integer. Postcondition: Return String.
	 */

	private static String asFraction(int a, int b) {
		int gcm = calcGCm(a, b);
		return (a / gcm) + "/" + (b / gcm);
	}

	public String toString() {
		if (numeR == 0) {
			myString = "The numerator result is zero, which is not allowed," + " try different numbers!! ";
		} else {
			String output = asFraction(numeR, comDeno);
			myString = "The result reduced fraction =  ( " + output + " )";
		}
		return myString;
	}
}
