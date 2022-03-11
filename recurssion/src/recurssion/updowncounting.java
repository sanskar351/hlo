package recurssion;

import java.util.Scanner;

public class updowncounting {
	int downcount(int n) {
		if (n == 0) {
			return 0;
		}
		System.out.println(n);
		return downcount(n - 1);
		}
	int upcount(int n) {
		if (n == 6) {
			return 0;
		}
		System.out.println(n);
		return upcount(n + 1);
		}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number");
		n = sc.nextInt();
		//updowncounting u = new updowncounting();
		//System.out.println(u.downcount(n));
		updowncounting u1 = new updowncounting();
		System.out.println(u1.upcount(n));
	}
}
