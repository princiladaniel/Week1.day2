package javachallenge;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class PalindromeNumber {

	public static void main(String[] args) {


//Check the given number is palindrome or not 

int num =16461;
int rev = 0;
//Initialize a  temporary variable.
int temp;
temp=num;
//Reverse the number (using for loop and add to the temporary variable)
for (;num!=0;num=num/10) {  
rev = rev * 10 +num%10;  
}
//Compare the temporary number with reversed number
if(temp==rev) {
	System.out.println("palindrome");
}
else {
	System.out.println("Not palindrome");
}
//If both numbers are same, print "palindrome number"

//Else print "not palindrome number"

		 

	}

}
