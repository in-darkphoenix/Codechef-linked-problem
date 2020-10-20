package pkg1;
//https://www.codechef.com/problems/CVDRUN

import java.util.Scanner;

public class CovidRun {
	public static void main(String[] args) throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			while (t > 0) {
				int n = scn.nextInt();
				int k = scn.nextInt();
				int x = scn.nextInt();
				int y = scn.nextInt();
				System.out.println(covidRun(n, k, x, y));
				t--;
			}
		} catch (Exception e) {
			return;
		}

	}

	public static String covidRun(int n, int k, int x, int y) {
		int temp = x;

		if (x == y)
			return "YES";

		do {
			x = (x + k) % n;
			if (x == y)
				return "YES";
		} while (temp != x);

		return "NO";
	}

}
