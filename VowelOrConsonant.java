/*
 * This program is to find a number is vowel or consonant
 * @author  BathalaHaresh
 */
package com.demo;
import java.util.Scanner;


public class VowelOrConsonant {

	public static void main(String args[])
	{
		VowelOrConsonant vowelOrConsonant=new VowelOrConsonant();
		vowelOrConsonant.findVowelOrConsonant();
	}

	void findVowelOrConsonant()
	{
		char ch;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Character : ");
		ch = scan.next().charAt(0);

		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )

		{
			System.out.print(ch + " is an Vowel");
		}
		else
		{
			System.out.print(ch + " is Consonent");
		}
		scan.close();
	}

}

