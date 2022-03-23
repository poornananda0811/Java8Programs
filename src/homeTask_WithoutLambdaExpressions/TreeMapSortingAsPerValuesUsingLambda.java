package homeTask_WithoutLambdaExpressions;
import java.util.*;


public class TreeMapSortingAsPerValuesUsingLambda {
	public static void main(String[] args)
	{

		
		TreeMap<NewEmployee, Integer> map
			= new TreeMap<>((Employee1,Employee2)->Employee1.getEmpid()>Employee2.getEmpid()?-1:Employee1.getEmpid()<Employee2.getEmpid()?1:0);

		
		map.put(new NewEmployee("Sachin", 4001), 1);
		map.put(new NewEmployee("Sourav", 5001), 2);
		map.put(new NewEmployee("Rahul", 3001), 3);

		System.out.println(
			"TreeMap keys sorting in descending order of the id:");

		
		for (Map.Entry<NewEmployee, Integer> entry :
			map.entrySet()) {
			System.out.println("Key : (" + entry.getKey()
							+ "), Value : "
							+ entry.getValue());
		}
	}
}
