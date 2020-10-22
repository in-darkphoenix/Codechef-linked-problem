package pkg1;

import java.util.Scanner;

public class Mul3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		short t = scn.nextShort();
		while (t > 0) {
			t--;
			long k = scn.nextLong();
			int d0 = scn.nextInt();
			int d1 = scn.nextInt();

			long ld = (d0 + d1) % 10;
			long sum = d0 + d1 + ld;

			if (k == 2) {
				if ((d0 * 10 + d1) % 3 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				continue;
			}

			long rd = k - 3;
			while (rd > 0) {
				if (ld == 6) {
					long set = rd / 4;
					sum += 20 * set;
					rd -= set * 4;

					if (rd == 1)
						sum += 2;
					else if (rd == 2)
						sum += 6;
					else if (rd == 3)
						sum += 14;

					rd = 0;
					break;
				} else if (ld == 0) {
					rd = 0;
					break;
				} else {
					ld = (ld * 2) % 10;
					sum += ld;
					rd--;
				}
			}
			if ((sum) % 3 == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
