package homeTask_WithoutLambdaExpressions;

interface interif{
	public boolean checkRotation(String s1,String s2);
}

public class CheckIfTwoStringsAreRotationsUsingLambda {

	public static void main(String[] args) {
			
  interif i=(s1,s2)->{
	  if (s1.length() != s2.length())
          return false;

      String temp = s1 + s1; 

      if (temp.indexOf(s2) != -1) {
          return true; 
      } else {
          return false;
      }
  };
 System.out.println(i.checkRotation("abcd","cdab")); 
	}
	
}
