package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 
class AnotherEmployee{
    String name;
    int id;
   
    public AnotherEmployee() {}
   
    public AnotherEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }
   
   

    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
 
   
    class ComparatorName  implements Comparator<AnotherEmployee>{
      
        public int compare(AnotherEmployee obj1, AnotherEmployee obj2) {
          
           return obj1.name.compareTo(obj2.name);
        }
    }
   
 
}
 
 
 
public class ComparatorTToSortEmployeesinAlphabeticalOrder6 {
    public static void main(String[] args) {
 
    	AnotherEmployee emp1=new AnotherEmployee("sam",4);
    	AnotherEmployee emp2=new AnotherEmployee("amy",2);
    	AnotherEmployee emp3=new AnotherEmployee("brad",1);

        ArrayList<AnotherEmployee> list=new ArrayList<AnotherEmployee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new AnotherEmployee().new ComparatorName());
        System.out.println("\nlist after sorting on basis of name(ascending order), "
                  + "using inner class : \n"+ list);
    
    }
}
 