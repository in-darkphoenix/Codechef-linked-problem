package pkg1;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		// your code goes here
		try {
			short t = scn.nextShort();
			while (t > 0) {
				int n = scn.nextInt();
				System.out.println(rev(n));
				t--;
			}
			scn.close();
		} catch (Exception e) {
			return;
		}
	}

	public static int rev(int n) {
		int r = 0;
		while (n > 0) {
			r = r * 10 + n % 10;
			n = n / 10;
		}
		return r;
	}

}
