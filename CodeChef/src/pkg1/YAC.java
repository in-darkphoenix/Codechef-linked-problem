package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

//https://www.codechef.com/COOK123B/problems/DIANE
public class YAC {

	public static void main(String[] args) throws Exception {
		try {
			Scanner scn = new Scanner(System.in);
			byte t = scn.nextByte();
			while (t > 0) {
				t--;
				int d = scn.nextInt();
				ArrayList<Integer> al = seq(d);
				System.out.println(al.size());
				for (int val : al) {
					System.out.print(val + " ");
				}
				System.out.println();
			}
			scn.close();
		} catch (Exception e) {
			return;
		}

	}

	public static ArrayList<Integer> seq(int d) {
		int p = (int) (Math.pow(10, 5) - 2);
		ArrayList<Integer> al = new ArrayList<>();
		if (d == 0)
			al.add(1);
		while (d > 0) {
			p = Math.min(p, d);
			al.add(p + 2);
			al.add(p + 1);
			al.add(1);
			d -= p;
		}
		return al;
	}
}
