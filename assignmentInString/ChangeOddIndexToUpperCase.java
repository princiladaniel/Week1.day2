package action;
public class ChangeOddIndexToUpperCase {
public static void main(String[] args) {
	//String test = "changeme";
	String test = "changeme";
	//a) Convert the String to character array
	char strArray[] = test.toCharArray();
	int len = strArray.length;
	//b) Traverse through each character (using loop)
	for (int i = 0; i < len; i++) {
	//c)find the odd index within the loop (use mod operator)
		if (i % 2 != 0) {
	//e)within the loop, change the character to uppercase, 
	//if the index is odd else don't change  
			char c = Character.toUpperCase(strArray[i]);
			System.out.print(c);
		} else
			System.out.print(strArray[i]);

	}
		}
		

	
}




