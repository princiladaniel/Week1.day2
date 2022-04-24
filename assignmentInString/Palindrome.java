package assignmentInString;

public class Palindrome {

	public static void main(String[] args) {

		// a) Declare A String value as"madam"
		String str = "madam";
		// b) Declare another String rev value as ""
		String rev = "";
		int strlength = str.length();
		System.out.println(str);
		// char[] charArray=str.toCharArray();
		// c) Iterate over the String in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			// d) Add the char into rev
			System.out.println(str.charAt(i));
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		/*
		 * e) Compare the original String with the reversed String, if it is same then
		 * print palinDrome
		 */
		if (str.equals(rev)) {
			System.out.println("is palindrome");
		} else {
			// rev=rev+length;
			System.out.println("is not palindrome");

		}

	}
}
/*
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
 */
