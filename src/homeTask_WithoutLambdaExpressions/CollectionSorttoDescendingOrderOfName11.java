package homeTask_WithoutLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 
class AnotherEmployee1{
    String name;
    int id;
   
    public AnotherEmployee1() {}
   
    public AnotherEmployee1(String name, int id) {
        this.name = name;
        this.id = id;
    }
   
   

    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
 
   
    class ComparatorName  implements Comparator<AnotherEmployee1>{
      
        public int compare(AnotherEmployee1 obj1, AnotherEmployee1 obj2) {
          
           return obj2.name.compareTo(obj1.name);
        }
    }
   
 
}
 
 
 
public class CollectionSorttoDescendingOrderOfName11 {
    public static void main(String[] args) {
 
    	AnotherEmployee1 emp1=new AnotherEmployee1("sam",4);
    	AnotherEmployee1 emp2=new AnotherEmployee1("amy",2);
    	AnotherEmployee1 emp3=new AnotherEmployee1("brad",1);

        ArrayList<AnotherEmployee1> list=new ArrayList<AnotherEmployee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new AnotherEmployee1().new ComparatorName());
        System.out.println("\nlist after sorting on basis of name(descending order), "
                  + "using inner class : \n"+ list);
    
    }
}
 