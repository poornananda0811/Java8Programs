package homeTask_WithoutLambdaExpressions;


class NewEmployee {

	private String name;
	private int empid;

	public NewEmployee(String name, Integer empid)
	{
		this.name = name;
		this.empid = empid;
	}

	public String getName() 
	{ 
		return this.name; 
	}

	
	public Integer getEmpid() {
		return empid;
	}

	public String toString()
	{
		return this.name + ": " + empid;
	}
}