/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog5{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		//System.out.print("Please enter number1: ");
		Scanner x1=new Scanner(System.in);
		float a=x1.nextFloat();
        //System.out.print("Please enter number2: ");
		
		float b=x1.nextFloat();
        //System.out.print("Please enter number3: ");
	
		float c=x1.nextFloat();
        float d[]=new float[3];
        d[0]=a;
        d[1]=b;
        d[2]=c;
        float large=d[0];
        for(int i=1;i<3;i++)
        {
        	if(d[i]>large)
        	large=d[i];
        }
		System.out.println("Largest no is: "+large);
		
	}
}