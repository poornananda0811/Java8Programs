package homeTask_WithoutLambdaExpressions;
import java.util.*;




class Accordingtoname implements Comparator<NewEmployee> {
	public int compare(NewEmployee e1, NewEmployee e2)
	{
		return e2.getName().compareTo(e1.getName());
	}
}


public class TreeMapSortingAsPerNames9 {
	public static void main(String[] args)
	{

		
		TreeMap<NewEmployee, Integer> map
			= new TreeMap<>(new Accordingtoname());

		
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
