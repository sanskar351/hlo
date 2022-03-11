package recurssion;

public class palindromerecurssion {
	public boolean ps(String s, int left, int right) {

		if (left >= right) {
			return true;
			}
		if(left==right)
		{
			return true;
		}
		if(s.charAt(left)!=s.charAt(right))
		{
			return false;
		}
		return ps(s,left+1,right-1);

	}

	public static void main(String args[]) {
		String s = "malayalam";

		palindromerecurssion ps = new palindromerecurssion();
		System.out.println(ps.ps(s, 0, s.length()-1));
	}
}
