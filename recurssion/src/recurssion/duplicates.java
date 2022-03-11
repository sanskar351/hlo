package recurssion;

public class duplicates {
	static boolean[] m=new boolean[26];
	public void duplicates(String s,int index,String n)
	{ if(index==s.length())
	{
		System.out.println(n);
		return;
	}
		char c=s.charAt(index);
		
		if(m[c-'a']==true)
		{
			duplicates(s, index+1,n);
		}
		else
		{
			n=n+c;
			m[c-'a']=true;
			duplicates( s,index+1, n);
		}
	}
	public static void main(String args[]) {
		String s = "abbccdd";

		duplicates d = new duplicates();
d.duplicates(s, 0, "");
	}
}
