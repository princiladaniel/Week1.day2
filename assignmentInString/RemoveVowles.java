package assignmentInString;

public class RemoveVowles {

	public static void main(String[] args) {
		String vowles = "EDUCATION";
		// String vowles=new String();
		char[] charArray = vowles.toCharArray();
		//int length = charArray.length;
		String output=" ";
		for (int i = 0; i < charArray.length; i++) {
			char var=charArray[i];
			
			if (!(var == 'A'|| var == 'E' || var == 'I' || var == 'O' || var=='U')) {
			output=output+var;
				
			}
			
		}
		System.out.println(output);

	}

}
