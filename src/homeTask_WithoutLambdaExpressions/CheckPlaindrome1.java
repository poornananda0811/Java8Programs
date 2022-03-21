package homeTask_WithoutLambdaExpressions;

public class CheckPlaindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String isPalindrome=checkPalindrome("abc");
System.out.println(isPalindrome);
	}
	
	public static String checkPalindrome(String inputString) {
		
		String finalString="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			
			finalString=finalString+ inputString.charAt(i);
		}
		
		if(finalString.equalsIgnoreCase(inputString))
		{
		return inputString+ " is a palindrome";
		}
		else
		{
		return inputString+ " is not a palindrome";
		}
	}

}
