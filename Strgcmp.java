/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Strgcmp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String name1=sc.next();
		String name2=sc.next();
	            int n1=name1.length();
	            int n2=name2.length();
		if(n1>=n2)
		    System.out.println(name1);
		else 
	            System.out.println(name2);
	}
}
