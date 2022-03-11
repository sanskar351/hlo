package recurssion;

import java.util.Scanner;

public class sortedarray {
	public boolean sorted(int array[],int index)
	{
		if(index==array.length-1)
		{
			return true;
		}
	if(array[index]<array[index+1])
	{
		return sorted(array,index+1);
	}
	else
	{
		return false;
	}
	}
	
	
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	int array[]= {1,2,3,4,5};
	sortedarray s=new sortedarray();
System.out.println(	s.sorted(array, 0));
	
}
}
