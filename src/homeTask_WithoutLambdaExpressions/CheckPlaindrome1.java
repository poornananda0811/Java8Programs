package homeTask_WithoutLambdaExpressions;

public class CheckPlaindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isPalindrome=checkPalindrome("abc");
System.out.println(isPalindrome);
	}
	
	public static boolean checkPalindrome(String inputString) {
		
		String finalString="";
		
		for(int i=inputString.length()-1;i>=0;i--) {
			
			finalString=finalString+ inputString.charAt(i);
		}
		
		if(finalString.equalsIgnoreCase(inputString))
		{
		return true;
		}
		
		return false;
		
	}

}
