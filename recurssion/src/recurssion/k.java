package recurssion;

public class k {
	
public void k(String s,int index,String n)
{
 String[] s1={ ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	if(index==s.length())
{ System.out.println(n);
	return;
}
	char c=s.charAt(index);
	String s2=s1[c-'0'];
	for(int i=0; i<s2.length(); i++)
	{
		k( s, index+1,n+s2.charAt(i));
	}
	
}
	
public static void mian(String args[])
{   String k="32";

	k K=new k();
	K.k(k, 0, "");
}
}
