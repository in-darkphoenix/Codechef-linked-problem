package pkg1;
// https://www.codechef.com/LRNDSA01/problems/CARVANS

import java.util.Scanner;

public class Carvan {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		byte t = scn.nextByte();
		while (t > 0) {
			t--;
			short n = scn.nextShort();
			int arr[] = new int[n];
			for (short i = 0; i < n; i++)
				arr[i] = scn.nextInt();
			//scn.close();
			System.out.println(cnvs(arr, n));
		}

	}

	public static short cnvs(int[] arr, short n) {
		short c = 1;
		int temp = arr[0];
		for (short i = 1; i < n; i++) {
			if (temp >= arr[i]) {
				temp = arr[i];
				c++;
			}
		}

		return c;
	}

}
