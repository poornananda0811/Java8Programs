package homeTask_ConstructorReference;



interface EmployeeWithDetails {
    public EmployeeDetails get(String name,int Salary,int account);
}

public class GetEmployeeDetailsUsingConstructorReference {

	public static void main(String[] args) {
		EmployeeWithDetails e1 = EmployeeDetails::new;
	e1.get("Aakash",10000,1000000);

	}
}	
	class EmployeeDetails {
	   
		EmployeeDetails(String name,int Salary,int account) {
	        System.out.println("Name is"+name +" Salary is"+Salary+" Account bal is"+account);
	      
	    }

	    
	}
 


