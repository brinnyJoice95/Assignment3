package Assignment;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
			
			
			/*
			 Pseudo Code
			 
			 * Declare String Input as Follow
			  
			 * String test = "changeme";
			 
			 * a) Convert the String to character array
			 
			 * b) Traverse through each character (using loop)
			 
			 * c)find the odd index within the loop (use mod operator)
			 
			 * d)within the loop, change the character to uppercase, if the index is odd else don't change
			  
			 */
		String test ="Changname";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			
		//	if(i%2!=0)
			{
			//	System.out.println(charArray[i]);
				//String lowerCase = test.toLowerCase();
				//System.out.println(lowerCase);
			//}
				if (i % 2 != 0) {
					//e)within the loop, change the character to uppercase, 
					//if the index is odd else don't change  
							char c = Character.toUpperCase(charArray[i]);
							System.out.print(c);
						} else
							System.out.print(charArray[i]);
				
			
		}
		}}
}


	

