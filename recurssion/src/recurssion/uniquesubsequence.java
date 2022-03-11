package recurssion;

import java.util.HashSet;

public class uniquesubsequence {
	public void unique(String s, int index, String n,HashSet<String> h) {
		if (index == s.length()) {
			if(h.contains(n))
			{
				return;
			}
			else
			{ h.add(n);
				System.out.println(n);
				return;
			}


		}
		char c = s.charAt(index);
		unique(s, index + 1, n + c,h);
		unique(s, index + 1, n,h);
	}

	public static void main(String args[]) {
		String s = "abc";
		HashSet<String> h=new HashSet<>();
		
		uniquesubsequence u = new uniquesubsequence();
u.unique(s,0, "",h);
	}
}
