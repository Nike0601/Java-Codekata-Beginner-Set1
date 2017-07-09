/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prog4{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		System.out.print("Please enter number: ");
		Scanner x=new Scanner(System.in);
		char c=x.next().charAt(0);
		if (Character.isLetter(c))
		System.out.println("It is an alphabet");
		else
		System.out.println("It is not an alphabet");
		
	}
}