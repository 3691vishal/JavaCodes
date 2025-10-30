package testing;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String s1 = "abcdegdcbeaf";
		String res = "";

		for (int i = 0; i <= s1.length() - 1; i++) {
			String ch = "" + s1.charAt(i);
			if (res.contains(ch)) {
				continue;
			}
			res += ch;
		}

		System.out.println(res);
		System.out.println(res.length());

	}
}
