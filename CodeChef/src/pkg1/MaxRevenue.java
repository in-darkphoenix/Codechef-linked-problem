package pkg1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxRevenue {
	public static void main(String[] args) throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			byte t = scn.nextByte();
			while (t > 0) {
				t--;
				int n = scn.nextInt();
				long arr[] = new long[n];
				for (int i = 0; i < n; i++)
					arr[i] = scn.nextLong();
				scn.close();
				System.out.println(mr(arr, n));
			}
		} catch (Exception e) {
			return;
		}

	}

	public static long mr(long[] arr, int n) {
		Arrays.sort(arr);
		long max = 0L;
		for (int i = 0; i < arr.length; i++) {
			long temp = arr[i] * n;
			if (max < temp) {
				max = temp;
			}
			n--;
		}
		return max;
	}

}
