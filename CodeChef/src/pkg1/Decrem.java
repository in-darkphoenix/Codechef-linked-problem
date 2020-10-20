package pkg1;

import java.util.Scanner;

public class Decrem {
	public static void main(String[] args) throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			while (t > 0) {
				int l = scn.nextInt();
				int r = scn.nextInt();
				t--;
				if (r < 2 * l)
					System.out.println(r);
				else
					System.out.println(-1);
			}
			scn.close();

		} catch (Exception e) {
			return;
		}

	}

}
