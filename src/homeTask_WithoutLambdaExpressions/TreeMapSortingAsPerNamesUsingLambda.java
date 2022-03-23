package homeTask_WithoutLambdaExpressions;
import java.util.*;


public class TreeMapSortingAsPerNamesUsingLambda {
	public static void main(String[] args)
	{

		
		TreeMap<NewEmployee, Integer> map
			= new TreeMap<>((NewEmployee1,NewEmployee2)->NewEmployee2.getName().compareTo(NewEmployee1.getName()));

		
		map.put(new NewEmployee("Sachin", 4001), 1);
		map.put(new NewEmployee("Sourav", 5001), 2);
		map.put(new NewEmployee("Rahul", 3001), 3);
		map.put(new NewEmployee("Virat", 2001), 3);

		System.out.println(
			"TreeMap keys sorting in descending order of the name:");

		
		for (Map.Entry<NewEmployee, Integer> entry :
			map.entrySet()) {
			System.out.println("Key : (" + entry.getKey()
							+ "), Value : "
							+ entry.getValue());
		}
	}
}
