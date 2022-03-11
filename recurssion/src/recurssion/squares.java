package recurssion;

import java.util.Scanner;

public class squares {
	int squares(int n)
	{
		if(n==0)
		{
			return n;
		}
		System.out.println(n*n);
		return squares(n-1);
		
	
		//System.out.println( b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the range");
		n = sc.nextInt();
		squares s = new squares();
	
		System.out.println(s.squares(n));
		
	}
}
