/**
 * This program is to find Quotient and remainder
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;

public class QuotientAndRemainder {
	public static void main(String args[])
	{
		QuotientAndRemainder quotientAndRemainder=new QuotientAndRemainder();
		quotientAndRemainder.method();
	}

	void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dividend ");
		int dividend=sc.nextInt();
		System.out.println("Enter divisor");
		int divisor=sc.nextInt();


		double quotient = dividend / divisor;
		double remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}


