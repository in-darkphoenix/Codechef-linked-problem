package pkg1;

//Lapindrome is defined as a string which when split in the middle, 
//gives two halves having the same characters and same frequency of each character. 
//If there are odd number of characters in the string, we ignore the middle character 
//and check for lapindrome. For example gaga is a lapindrome, since the two halves ga 
//and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy 
//are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves 
//contain the same characters but their frequencies do not match.
//Your task is simple.Given a string,you need to tell if it is a lapindrome.

import java.util.HashMap;
import java.util.Scanner;

public class Lapindrome {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			String s = scn.next();
			if (lp(s)) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}
		scn.close();
	}

	public static boolean lp(String s) {
		int l = s.length();
		String s1, s2;
		if (l % 2 == 0) {
			s1 = s.substring(0, l / 2);
			s2 = s.substring(l / 2);
		} else {
			s1 = s.substring(0, l / 2);
			s2 = s.substring((l / 2 + 1));
		}

		HashMap<Character, Integer> map = new HashMap<>();
		int en = 0;

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);

			if (map.containsKey(c1)) {
				int cv = map.get(c1);
				int nv = cv + 1;
				map.put(c1, nv);
			} else {
				map.put(c1, 1);
				en++;
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			char c2 = s2.charAt(i);

			if (map.containsKey(c2)) {
				int cv = map.get(c2);
				int nv = cv - 1;
				if (nv < 0)
					return false;
				if (nv == 0)
					en--;
				map.put(c2, nv);
			} else {
				return false;
			}
		}
		if (en == 0)
			return true;
		else
			return false;

	}

	public static boolean lapindrome(String s) {
		int l = s.length();
		String s1, s2;
		if (l % 2 == 0) {
			s1 = s.substring(0, l / 2);
			s2 = s.substring(l / 2);
		} else {
			s1 = s.substring(0, l / 2);
			s2 = s.substring((l / 2 + 1));
		}

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if (map1.containsKey(c1)) {
				int cv = map1.get(c1);
				int nv = cv + 1;
				map1.put(c1, nv);
			} else {
				map1.put(c1, 1);
			}

			if (map2.containsKey(c2)) {
				int cv = map2.get(c2);
				int nv = cv + 1;
				map2.put(c2, nv);
			} else {
				map2.put(c2, 1);
			}

		}
		boolean flag = false;

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			if ((map1.get(c1) == map2.get(c1)) && (map1.get(c2) == map2.get(c2))) {

				flag = true;
			}
		}
		return flag;
	}

}
