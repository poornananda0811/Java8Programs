package homeTask_WithoutLambdaExpressions;
import java.util.*;




class AccordingtoId implements Comparator<NewEmployee> {
	public int compare(NewEmployee e1, NewEmployee e2)
	{
		return e2.getEmpid().compareTo(e1.getEmpid());
	}
}


public class TreeMapSortingAsPerValues {
	public static void main(String[] args)
	{

		
		TreeMap<NewEmployee, Integer> map
			= new TreeMap<>(new AccordingtoId());

		
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
