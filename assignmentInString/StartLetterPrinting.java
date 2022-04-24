package assignmentInString;

public class StartLetterPrinting {

	public static void main(String[] args) {
		String str="Testleaf is located at Teynampet andabove a Taccobell";
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
		
		  if(split[i].startsWith("T")) {
			 
		  
			System.out.println(split[i]);
		}

	}

	}

}
