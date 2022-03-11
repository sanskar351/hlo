package recurssion;

import java.util.Scanner;

public class s {
	int power(int n,int m)
	{
		if(n==0)
		{
			return 0;
		}
		if(m==0)
		{
			return 1;
		}
	if(m%2==0)
	{
		return power(n,m/2)*power(n,m/2);
	}
	else
	{
		return power(n,m/2)*power(n,m/2)*n;
	}
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,m;
	System.out.println("Enter the n");
	a=sc.nextInt();
	System.out.println("Enter the m");
	m=sc.nextInt();
	s S=new s();
	System.out.println(S.power(a, m));
}
}
