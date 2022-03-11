package recurssion;

import java.util.Scanner;

public class Main {
	void towerOfHanoi(int n, String S, String H, String D) {
	
	  if (n == 1)
      {
          System.out.println("Take disk 1 from rod " +  S + " to rod " + D);
          return;
      }
      towerOfHanoi(n-1,S,D,H);
      System.out.println("Take disk " + n + " from rod " +  S+ " to rod " + D);
      towerOfHanoi(n-1,H,S,D);
  }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the range");
		n = sc.nextInt();
		Main m = new Main();

		m.towerOfHanoi(n, "S", "H", "D");
	}
}
