package homeTask_WithoutLambdaExpressions;

public class Employee implements Comparable{

String name;
int id;
		
Employee(String name,int id)
{
	this.name=name;
	this.id=id;
	
}
public String toString()
{
	return name +"---"+id;
}

public int compareTo(Object o) {
 int id1=this.id;
 Employee e=(Employee)o;
 int id2=e.id;
 if(id1<id2)
 {
	 return -1;
 }
 else if(id2>id1)
 {
	 return 1;
 }
 else
 {
	 
		return 0;
 }
	}

}
