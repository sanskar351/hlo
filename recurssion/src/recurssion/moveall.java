package recurssion;

public class moveall {
	public void move(String s, int index, int count, String a, char x) {
		if (index == s.length()) {
			for (int i = 0; i < count; i++) {
				a = a + x;
			}
			System.out.println(a);
			return;
		}
		char c = s.charAt(index);
		if (c == x) {
			count++;
			move(s, index + 1, count, a, x);
		} else {
			a = a + c;
			move(s, index + 1, count, a, x);
		}
	}

	public static void main(String args[])

	{
		String s = "abxxcxd";
		System.out.println(s);
		moveall m = new moveall();
		m.move(s, 0, 0, "", 'x');
	}
}
