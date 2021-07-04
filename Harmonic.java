/*
 * This program is to find Harmonic Number
 * @author  BathalaHaresh
 */
package com.demo;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		HarmonicNumber number = new HarmonicNumber();	//	class object
		number.harmonic();
	}

	void harmonic()
	{
		double sum=0.0;
		System.out.println("Enter a positive integer ");
		//scanner to get user Input
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
        
		//using for loop to calculate upto num and adding all the numbers(1/1+1/2+1/3+1/4......1/num)
		for(int i=1;i<=num;i++)
		{
			sum +=(1.0/i);
		}
		System.out.println(num +"th hormonic sum is "+sum);
		scanner.close();
	}
}