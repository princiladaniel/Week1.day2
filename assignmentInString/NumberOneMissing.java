package assignmentInString;

import java.util.Arrays;

public class NumberOneMissing {
	public static void main(String[] args) {
		
		int[] arr = {8,6,4,3,2,5};
		int arrlength = arr.length;
		
		for(int i=0;i<=arrlength;i++)
		// Sort the array
			Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// loop through the array (start i from arr[0] till the length of the array)
		for(int i=arr[0];i<=arrlength;i++)
		            {
	// check if the iterator variable is not equal to the array values respectively
		if(i!=(i-1)) {
	// print the number
				System.out.println("Missing Element in Array:"+(i-1));
	// once printed break the iteration
				break;
			}
		
		}

	
	}
}
