package recurssion;

public class keypad {
	public void keypad(String s, int index, String n) {
		String[] k = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
		if (index == s.length()) {
			System.out.println(n);
			return;
		}
		char c = s.charAt(index);
		String a = k[c - '0'];
		for (int i = 0; i < a.length(); i++) {
			keypad(s, index + 1, n + a.charAt(i));
		}

	}

	public static void main(String args[]) {
		String s = "12";
		keypad k = new keypad();
		k.keypad(s, 0, "");
	}
}
