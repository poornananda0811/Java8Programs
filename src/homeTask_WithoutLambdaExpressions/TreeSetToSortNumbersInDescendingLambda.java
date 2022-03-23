package homeTask_WithoutLambdaExpressions;

import java.util.TreeSet;

public class TreeSetToSortNumbersInDescendingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t= new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		t.add(50);
		t.add(74);
		t.add(23);
		t.add(66);
		System.out.println(t);

	}

}
