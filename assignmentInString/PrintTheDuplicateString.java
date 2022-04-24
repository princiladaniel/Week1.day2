package assignmentInString;

public class PrintTheDuplicateString {

	public static void main(String[] args) {
		
		String sentence = "We learn java basics as part of Java sessions sessions in java week1";
		String[] str = sentence.split(" ");
		System.out.println(sentence);
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					int count = 0;
					count++;
					str[j] = " ";
					
					// for (int i = 0; i< str.length; i++) {
					System.out.print(str[i] + " ");
				}
			}
		}
	}
}
