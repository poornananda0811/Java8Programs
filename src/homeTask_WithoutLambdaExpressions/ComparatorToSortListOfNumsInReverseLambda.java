package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorToSortListOfNumsInReverseLambda{

	public static void main(String... args)
	{

		ArrayList<Integer> values= new ArrayList<Integer>();
		
		values.add(350);
		values.add(450);
		values.add(575);
		values.add(634);
		values.add(203);
		values.add(102);
		Collections.sort(values,((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0));
		
		System.out.println(values);
		
	}
}
