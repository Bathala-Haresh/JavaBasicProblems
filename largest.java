/*
 * This program is to find Largest of 3 numbers
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;


public class LargestOf3Numbers {

	public static void main(String args[])
	{
		LargestOf3Numbers large = new LargestOf3Numbers();
		large.largest(); 
	}

	void largest() {
		//variables
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		num1 = sc.nextInt();
		System.out.print("Enter the second number:");
		num2 = sc.nextInt();
		System.out.print("Enter the third number:");
		num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("Largest number is:"+num1);
		}
		else if(num2 > num3)
		{
			System.out.println("Largest number is:"+num2);
		}
		else
		{
			System.out.println("Largest number is:"+num3);
		}
		sc.close();
	}
}
