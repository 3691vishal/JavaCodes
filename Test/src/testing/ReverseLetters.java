package testing;

public class ReverseLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Revese this String";
		StringBuilder s2 = new StringBuilder();

		s2.append(s1);
		s2.reverse();

		System.out.println("Original: " + s1);
		System.out.println("Refersed: " + s2);

	}

}
