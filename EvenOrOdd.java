/**
 * This program is to find Even or odd
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;


public class EvenOrOdd {
	public static void main(String args[])
	{
	EvenOrOdd evenOrOdd = new EvenOrOdd();
	evenOrOdd.FindEvenOrOdd();
	}

	 void FindEvenOrOdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check even or odd :");
		int num=sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number ");
		}
		sc.close();
		
	}

}
