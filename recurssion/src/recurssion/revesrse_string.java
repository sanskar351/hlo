package recurssion;

import java.util.Scanner;

public class revesrse_string {
	public static void reverse(String s,int index)
	{   
		if(index==0)
		{
			System.out.print(s.charAt(index));
			return;
		}
		
		System.out.print(s.charAt(index));
		 reverse(s,index-1);
	}
	public static void main(String ars[]) {
		Scanner sc = new Scanner(System.in);
		String s;
System.out.println("Enter the string");
s=sc.next();
		revesrse_string rs = new revesrse_string();
rs.reverse(s, s.length()-1);
	}
}
