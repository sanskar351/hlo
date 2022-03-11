package recurssion;

import java.util.Scanner;

public class first_last_occurence {
	 static int f=-1;
	 static int l=-1;
	public static void first_last_occurence(String s,int index,char key)
	{
		if(index==s.length())
		{
			System.out.println(f);
			System.out.println(l);

					return;
		}
		char c=s.charAt(index);
		if(c==key)
		{
			if(f==-1)
			{
				f=index;
				
			}
			else
			{
				l=index;
			}
		}
		
		first_last_occurence(s,index+1,key);
	}
	
	
public static void main(String args[])
{   Scanner sc=new Scanner(System.in);
	String s;
	System.out.println("Enter the string");
	s=sc.next();
	first_last_occurence flo=new first_last_occurence();
	flo.first_last_occurence(s, 0, 'a');
}
}
