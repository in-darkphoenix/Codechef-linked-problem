package pkg1;
// https://www.codechef.com/LRNDSA01/problems/TEST

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		// your code goes here
		try {
			while (true) {
				byte n = scn.nextByte();
				if (n == 42)
					break;
				System.out.println(n);

			}
			scn.close();
		} catch (Exception e) {
			return;
		}
	}

}
