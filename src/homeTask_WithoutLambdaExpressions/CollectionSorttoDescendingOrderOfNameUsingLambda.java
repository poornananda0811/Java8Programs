package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class CollectionSorttoDescendingOrderOfNameUsingLambda {
    public static void main(String[] args) {
 
    	AnotherEmployee1 emp1=new AnotherEmployee1("sam",4);
    	AnotherEmployee1 emp2=new AnotherEmployee1("amy",2);
    	AnotherEmployee1 emp3=new AnotherEmployee1("brad",1);

        ArrayList<AnotherEmployee1> list=new ArrayList<AnotherEmployee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,(Employee1,Employee2)->Employee2.name.compareTo(Employee1.name));
        System.out.println("\nlist after sorting on basis of name(descending order), "
                  + "using inner class : \n"+ list);
    
    }
}
 