package assignmentInString;

import java.util.Arrays;


//import java.util.Iterator;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		// a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		String str="";
		// b) Initialize an integer variable as count
		int count = 0;
		// c) Split the String into array and iterate over it
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
		for (int i = 0; i < split.length; i++) {
       // d) Initialize another loop to check whether the word is there in the array
			for (int j=0; j <=i; j++) {
				if (split[i].equalsIgnoreCase((split[j]))) {
	  // e) if it is available then increase and count by 1. 
					count++;		
				}

			}
	//f) if the count > 1 then replace the word as "" 
			if(count>1) {
				str=str+"  ";
			}
			else {
				str=str+split[i]+"";
			}
			count=0;
		}
		//g) Displaying the String without duplicate words	
		System.out.println(str+"  ");
		//System.out.println(builder.toString());	
	}

}
