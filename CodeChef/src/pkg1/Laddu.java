package pkg1;

import java.util.Scanner;

public class Laddu {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		byte t = scn.nextByte();
		while (t > 0) {
			t--;
			int l = 0;
			byte act = scn.nextByte();
			String origin = scn.next();
			while (act > 0) {
				act--;
				String type = scn.next();
				if (type.equals("CONTEST_WON")) {
					int r = scn.nextInt();
					if (r >= 20)
						r = 20;
					l += 300 + (20 - r);
				} else if (type.equals("TOP_CONTRIBUTOR")) {
					l += 300;
				} else if (type.equals("BUG_FOUND")) {
					int s = scn.nextInt();
					l += s;
				} else if (type.equals("CONTEST_HOSTED")) {
					l += 50;
				}

			}
			if (origin.equals("INDIAN")) {
				System.out.println(l / 200);
			} else {
				System.out.println(l / 400);
			}
		}
	}

}
