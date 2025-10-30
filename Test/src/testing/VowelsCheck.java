package testing;

public class VowelsCheck {

	public static void main(String[] args) {
		
		String s1 = "Vishal Sharma";
		int count=0;
		
		s1.toLowerCase();
		
		for(int n=0; n<s1.length(); n++) {
			if(s1.charAt(n)=='a' || s1.charAt(n)=='e' || 
					s1.charAt(n)=='i' || s1.charAt(n)=='o' || s1.charAt(n)=='u') {
				count++;
			}
		} 
		
		System.out.println("Vowel count is: "+count);

	}

}
