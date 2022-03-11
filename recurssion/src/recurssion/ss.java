package recurssion;

import java.lang.reflect.Array;



public class ss {
	/*public static void reverse(String s,int index)
	{
		if(index==0)
		{
		System.out.println(s.charAt(index));
		return;
		}
		System.out.print(s.charAt(index));
		reverse(s,index-1);
	}
	public boolean sorted(int arrray[],int index)
	{
	    if(index==arrray.length-1){
	return true;
}
if(arrray[index]<arrray[index+1])
{
	return sorted(arrray,index+1);
	
}
else
{
	return false;
}
	}*/
static int f=-1;
static int l=-1;
public static void flo(String s, int index,char key)
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
	flo(s,index+1,key);
}

public static void main(String args[])
{
	 String s="abcdea";
	 //ss s1=new ss();
	// int array[]= {1,2,3,5,5,6,7,8};
		//ss s=new ss();
		//System.out.println(s.sorted(array, 0));
	ss s1=new ss();
	s1.flo(s, 0, 'a');
}
}
