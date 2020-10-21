package pkg1;

import java.util.Scanner;

public class FactCC {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		try {
			int t = scn.nextInt();
			while (t > 0) {
				int n = scn.nextInt();
				System.out.println(n0s(n));
				t--;
			}
			scn.close();
		} catch (Exception e) {
			return;
		}
	}

	public static long n0s(int n) {
		long m = 5;
		long s = 0;
		while (m <= n) {
			s += (n / m);

			m = m * 5;
		}
		return s;
	}

}
