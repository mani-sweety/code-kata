/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=1,t2=1;
		for(int i=0;i<n;++i)
		{
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
		
	}
}
