package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface myinterf{
	
	public int secondLargestNumber(ArrayList<Integer> nums);
}
public class Find2ndBiggestNumberUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(33);
		numbers.add(13);
		numbers.add(88);
		numbers.add(57);
		numbers.add(56);
	
		myinterf my=(nums)->
		{
			Collections.sort(nums);
			Collections.reverse(nums);
			return nums.get(1);		
		};
		
		System.out.println(my.secondLargestNumber(numbers));
	}
		
}
