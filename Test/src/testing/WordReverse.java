package testing;

public class WordReverse {

	public static void main(String[] args) {

		String s1 = "This is Hello World";
		StringBuilder ans = new StringBuilder();

		String s3[] = s1.split(" "); // s3 = {'This' 'is' 'Hello' 'World'}

		for (int i = s3.length - 1; i >= 0; i--) {
			ans = ans.append(s3[i]); // World
			if (i != 0) {
				ans = ans.append(" ");
			}
		}
		System.out.println(ans);
	}

}






/*
Features:
String >>>>>>	Immutable, 	ThreadSafe,		Synchronized,		Slow;	 FixedString
StringBuffer >	Mutable,	ThreadSafe,		Synchronized,		Slow;	 MultiThreadThreadOperation
StringBuilder > Mutable,	Not-ThreadSafe,	Not-Synchronized,	Fastest; SingleThreadOperation
*/
