package recurssion;

import java.util.Scanner;

public class fibonacci {
	int fibo(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
		}
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the number");
	n=sc.nextInt();
	fibonacci f=new fibonacci();
	for(int i=0; i<n; i++)
	{
		System.out.println(f.fibo(i));
	}	
	}
	
	
}
