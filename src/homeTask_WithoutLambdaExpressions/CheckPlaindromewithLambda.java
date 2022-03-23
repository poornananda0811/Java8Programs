package homeTask_WithoutLambdaExpressions;

interface interf{
	
	public boolean checkPalindrome(String inputString);
}

public class CheckPlaindromewithLambda {

	public static void main(String[] args) {


interf inter=(inputString)->{
String finalString="";

for(int i=inputString.length()-1;i>=0;i--) {
	
	finalString=finalString+ inputString.charAt(i);
}

if(finalString.equalsIgnoreCase(inputString))
{
return true;
}
return false;

};
	System.out.println(inter.checkPalindrome("abc"));
	}
}	
	
