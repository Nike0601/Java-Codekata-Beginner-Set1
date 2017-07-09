/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog6
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		System.out.print("Please enter year: ");
		Scanner x1=new Scanner(System.in);
		int a=x1.nextInt();
        if(a%100==0)
        {
        	if(a%400==0)
        	System.out.println("It is a leap year");
        	else
        	System.out.println("It is not a leap year");
        }
        else
        {
        	if(a%4==0)
        	System.out.println("It is a leap year");
        	else
        	System.out.println("It is not a leap year");
        }
		
		
	}
}