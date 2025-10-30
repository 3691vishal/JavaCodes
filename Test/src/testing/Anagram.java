package testing;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		// check Anagram
		String s1 = "Listen";
		String s2 = "Silent";

		// Convert both to lowercase and assign back
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (ch1.length != ch2.length) {
			System.out.println("Not Anagram-1");
			System.exit(0);
		}

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		System.out.println("After sorting ch1[]: " + Arrays.toString(ch1));
		System.out.println("After sorting ch2[]: " + Arrays.toString(ch2));

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				System.out.println("Not Anagram-2");
				System.exit(0);
			}
		}
		System.out.println("S1 & S2 are Anagram");
	}
}
