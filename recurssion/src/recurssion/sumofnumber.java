package recurssion;

import java.util.Scanner;

public class sumofnumber {
	int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+sum(n-1);
	}
	
	
	
	
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter the number");
	a=sc.nextInt();
	sumofnumber s=new sumofnumber();
	int a1=s.sum(a);
	System.out.println(a1);
}
}
