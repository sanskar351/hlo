package recurssion;

import java.util.Scanner;

public class power {
	int power(int n,int m)
	{
		if(m==0)
		{
			return 1;
		}
		if(n==0)
		{
			return 0;
		}
		//int poww=power(n,(m-1));
		//int pow=n*poww;
		//return pow;
		//return m;
		//if even
		if(m%2==0)
		{
			return power(n,m/2)*power(n,m/2);
		}
		//if odd
		else
		{
			return power(n,m/2)*power(n,m/2)*n;
		}
		
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		System.out.println("Enter the value of n");
		n = sc.nextInt();
		System.out.println("Enter the value of m");
		m = sc.nextInt();
		power p=new power();
		int a=p.power(n, m);
		System.out.println(a);

	}
}
