package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Comparator;


public class ComparatorToSortListOfNumsInReverse5{

	public static void main(String... args)
	{

		ArrayList<Integer> values= new ArrayList<Integer>();
		
		values.add(350);
		values.add(450);
		values.add(575);
		values.add(634);
		values.add(203);
		values.add(102);
		values.sort(Comparator.reverseOrder());
		
		System.out.println(values);
		values.sort(Comparator.naturalOrder());
		System.out.println(values);
	}
}
