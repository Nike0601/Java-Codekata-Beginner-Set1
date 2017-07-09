/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog9{
	public static void main (String[] args) throws java.lang.Exception
	{
	   System.out.println("Enter number: ");
	   Scanner x=new Scanner(System.in);
	   int num=x.nextInt();
	   int i;
	   int n=0;
	   int sum=0;
	   int digit;
	   int num1=num;
       while(num!=0)
       {
        digit=num%10;
        sum+=digit;
        num /= 10;
        n++;
       }
       System.out.println("No.of digits is: "+n);
       System.out.println("Sum of digits is: "+sum);
    }
		
		
}