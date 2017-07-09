/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Sum of how many natural numbers?: ");
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
	    if(a<=0)
	    System.out.println("Invalid input");
        else
        {
        	int sum=(a*(a+1))/2;
        	System.out.println("Sum of "+a+" natural numbers is: "+sum);
        }
    }
		
		
}