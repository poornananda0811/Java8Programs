package homeTask_WithoutLambdaExpressions;

public class CheckIfTwoStringsAreRotations3 {

	public static void main(String[] args) {
		
  boolean value=checkRotation("abcd","cdab");
  System.out.println(value);
		
	}
	
	public static boolean checkRotation(String s1, String s2) {
       
        if (s1.length() != s2.length())
            return false;

        String temp = s1 + s1; 

        if (temp.indexOf(s2) != -1) {
            return true; 
        } else {
            return false;
        }

}
}
