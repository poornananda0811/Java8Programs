package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;


 public class ComparatorTToSortEmployeesinAlphabeticalOrderLambda {
    public static void main(String[] args) {
 
    	AnotherEmployee emp1=new AnotherEmployee("sam",4);
    	AnotherEmployee emp2=new AnotherEmployee("amy",2);
    	AnotherEmployee emp3=new AnotherEmployee("brad",1);

        ArrayList<AnotherEmployee> list=new ArrayList<AnotherEmployee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
        ;
        Collections.sort(list,(employee1,employee2) -> employee1.name.compareTo(employee2.name));
        System.out.println("\nlist after sorting on basis of name(ascending order), "
                  + "using inner class : \n"+ list);
    
    }
}
 