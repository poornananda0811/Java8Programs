package homeTask_WithoutLambdaExpressions;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetToSortInAlphaBeticalOrderUsingLambda8 implements Comparator{
	
	public static void main(String args[])
	{
		
		 Employee e1= new Employee("Uday",200);
		 Employee e2=new Employee("Abhi",400);
		 Employee e3= new Employee("Yash",100);
		 
		 TreeSet<Employee> t= new TreeSet<Employee>(new TreeSetToSortInAlphaBeticalOrderUsingLambda8());
		 t.add(e1);
		 t.add(e2);
		 t.add(e3);
		 System.out.println(t);
	}

	
	public int compare(Object o1, Object o2) {
		Employee ee1=(Employee)o1;
		String name1=ee1.name;
		Employee ee2=(Employee)o2;
		String name2=ee2.name;
		
		return name1.compareTo(name2);
	}

	
	

}
