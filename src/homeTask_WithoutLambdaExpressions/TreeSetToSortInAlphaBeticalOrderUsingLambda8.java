package homeTask_WithoutLambdaExpressions;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetToSortInAlphaBeticalOrderUsingLambda8 {
	
	public static void main(String args[])
	{
		
		 Employee e1= new Employee("Uday",200);
		 Employee e2=new Employee("Abhi",400);
		 Employee e3= new Employee("Yash",100);
		 
		 TreeSet<Employee> t= new TreeSet<Employee>((Employee1,Employee2)->Employee1.name.compareTo(Employee2.name));
		 t.add(e1);
		 t.add(e2);
		 t.add(e3);
		 System.out.println(t);
	}

	
}
