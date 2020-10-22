package pkg1;

import java.util.Scanner;

//https://www.codechef.com/COOK123B/problems/SPLITIT

public class SplitString {
	public static void main(String[] args) throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			short t = scn.nextShort();
			while (t > 0) {
				int n = scn.nextInt();
				String s = scn.next();
				t--;
				if (spst(n, s))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			scn.close();

		} catch (Exception e) {
			return;
		}

	}

	public static boolean spst(int n, String s) {
		char ch = s.charAt(n - 1);
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == ch)
				return true;
		}
		return false;
	}

}
