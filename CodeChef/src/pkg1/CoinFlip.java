package pkg1;

import java.util.Scanner;

// https://www.codechef.com/LRNDSA01/submit/CONFLIP

public class CoinFlip {
	public static void main(String[] args) throws Exception {
		// your code goes here
		try {
			Scanner scn = new Scanner(System.in);
			byte t = scn.nextByte();
			while (t > 0) {
				int g = scn.nextInt();
				while (g > 0) {
					byte i = scn.nextByte();
					int n = scn.nextInt();
					byte q = scn.nextByte();
					System.out.println(cf(i, n, q));
					g--;
				}
				t--;
			}
			scn.close();
		} catch (Exception e) {
			return;
		}
	}

	public static int cf(byte i, int n, byte q) {
		if (n % 2 == 0) {
			return n / 2;
		}
		if (i == 1) {
			if (q == 1)
				return n / 2;
			else
				return n / 2 + 1;
		} else {
			if (q == 1)
				return n / 2 + 1;
			else
				return n / 2;
		}
	}

}
