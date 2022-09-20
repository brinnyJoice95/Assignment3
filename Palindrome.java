package Assignment;

public class Palindrome {
public static void main(String[] args) {
	
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */
	String value="madam";
	String reverse="";
	int length = value.length();
	for (int i = value.length()-1; i >=0; i--) {
		reverse = reverse+value.charAt(i);
	}
	if(value.equals(reverse)){
	System.out.println(value+" is Palindrome");
	}
	else {
		System.out.println(value+"is not a Palindrome");
		
	}
    
	
		
}
}