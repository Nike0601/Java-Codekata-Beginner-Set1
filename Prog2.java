/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		float num;
		System.out.print("Please enter number: ");
		Scanner x=new Scanner(System.in);
		num=x.nextInt();
		if(num%2==0)
		System.out.println("The number you entered is even");
		else if(num%2!=0)
		System.out.println("The number you entered is odd");
		else 
		System.out.println("Invalid input");
	}
}