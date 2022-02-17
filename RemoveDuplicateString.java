package assignmentInString;

import java.util.Arrays;
import java.util.Iterator;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		String str;
		// b) Initialize an integer variable as count
		int count = 0;
		//StringBuilder builder =new StringBuilder();

		// c) Split the String into array and iterate over it
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
       // d) Initialize another loop to check whether the word is there in the array
			for (int j = 0; j < i; j++) {
				if (split[i].equalsIgnoreCase((split[j]))) {
					count++;
					break;	
				}

			}
			
			if(count==0) { // This means duplicate available
				//builder.append(split[i]).append(" ");
				
				System.out.println(split[i]);
				//System.out.println(Arrays.asList(split[i]));
			} else {
				count =0;
			}
		}
		
		//System.out.println(builder.toString());	
	}

}
/*  String sentence = "We learn java basics as part of Java sessions sessions in java week1";
		String[]str = sentence.split(" ");
		System.out.println(sentence);
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					int count=0;
					count++;
					str[j] = " ";
					//System.out.println("String without duplicates: ");
					//for (int i = 0; i< str.length; i++) {
						System.out.print(str[i] +" " );
				}
		        	}
				} */