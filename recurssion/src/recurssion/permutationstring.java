package recurssion;

public class permutationstring {
	public void npr(String s, String n) {
		if (s.length() == 0) {
			System.out.println(n);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String t = s.substring(0, i) + s.substring(i + 1);
			npr(t, n + c);
		}
	}

	public static void main(String args[]) {
		String s = "abc";
		permutationstring p = new permutationstring();
		p.npr(s, "");
	}

}
