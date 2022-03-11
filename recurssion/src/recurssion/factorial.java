package recurssion;

import java.util.Scanner;

public class factorial {
	int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	
	
	
public static void main(String args[])
{Scanner sc=new Scanner(System.in);

	int n;
	System.out.println("Enter the number");
	n=sc.nextInt();
	factorial f=new factorial();
	int a=f.fact(n);
	System.out.println(a);
}
}
