package homeTask_WithoutLambdaExpressions;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapToSortInDescendingOrderNames10 implements Comparator{

	public static void main(String[] args) {
		
		TreeMap<String,Integer> tm= new  TreeMap<String,Integer>(new TreeMapToSortInDescendingOrderNames10());
		
		tm.put("abcd", 17);
		tm.put("pqrs", 14);
		tm.put("xyz", 13);
		tm.put("mnop", 23);
		tm.put("rstb", 33);
		System.out.println(tm);

	}

	
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
				
	}

	
	

}
