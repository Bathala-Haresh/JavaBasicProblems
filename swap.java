/**
 * This program is to find swap two  numbers
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;
public class SwapNum {
	public static void main(String args[])
	{
		SwapNum swap=new SwapNum();
		swap.Swap();
	}
	
	void Swap()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers to swap : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		sc.close();
		int temp;
		
		System.out.println("Numbers before swaping : num1 is : "+num1 + "\tnum2 is :" +num2 );
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Numbers before swaping : num1 is : "+num1 + "\tnum2 is :"+num2 );
		
		
		
	}

}
