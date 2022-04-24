package assignmentInString;



public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
					String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					int count=0;
					// convert the string into char array
					char[]charstr=str.toCharArray();
					System.out.println(charstr);
					//get the length of the array
						int lengthstr = charstr.length;
						System.out.println(lengthstr);
					// traverse from 0 till the array length 
						for (int i = 0; i < charstr.length; i++) {
					// Check the char array has the particular char in it 
					 if(charstr[i]=='e') {
						// if is has increment the count
						count++;
						System.out.println("occurrences of a char'e': "+ i);
					 }
				 }	// print the count out of the loop			
					 System.out.println(count);
					 
	}

	}
