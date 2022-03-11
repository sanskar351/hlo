
package recurssion;

public class allpossiblestring {
	public void all(String s, int index, String news) {
		if (index == s.length()) {
			System.out.println(news);
			return;
		}
		char c = s.charAt(index);
		all(s, index + 1, news + c);
		all(s, index + 1, news);
	}

	public static void main(String args[]) {
		String s = "abcd";
		allpossiblestring a = new allpossiblestring();
		a.all(s, 0, "");
	}
}
