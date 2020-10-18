package pkg1;

import java.util.Scanner;

public class AdaKing {
	public static void main(String[] args) throws Exception {

		try {
			Scanner scn = new Scanner(System.in);
			short t = scn.nextShort();
			while (t > 0) {
				byte k = scn.nextByte();
				cb(k);
				t--;
			}
		}

		catch (Exception e) {
			return;
		}
	}

	public static void cb(byte k) {
		byte c = 0;
		for (byte i = 0; i < 8; i++) {
			for (byte j = 0; j < 8; j++) {
				if (i == 0 && j == 0) {
					System.out.print("O");
				} else {
					if (c < k)
						System.out.print(".");
					else
						System.out.print("X");
				}
				c++;
			}
			System.out.println();
		}
	}
}
