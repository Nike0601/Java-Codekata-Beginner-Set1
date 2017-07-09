/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		System.out.print("Please enter number: ");
		Scanner x=new Scanner(System.in);
		char c=x.next().charAt(0);
		switch(c)
		{
			case 'a':
				System.out.println("It is a vowel");
				break;
			case 'e':
				System.out.println("It is a vowel");
				break;
			case 'i':
				System.out.println("It is a vowel");
				break;
			case 'o':
				System.out.println("It is a vowel");
				break;
			case 'u':
				System.out.println("It is a vowel");
				break;	
			default:
			    System.out.println("It is a consonant");
		}
		
	}
}