package homeTask_Consumer_Supplier;

public class Product {
	public String name;
	public int price;
	public String category;
	public String grade;
	
	
 public	Product(String name,int price,String category,String grade)
	{
		this.name=name;
		this.price=price;
		this.category=category;
		this.grade=grade;
	}
 
 public String getCategory() {
		return this.category;
	}

	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Product with name " + this.name + " price " + this.price + " category " + this.category + " and grade is "
			+ this.grade;
	}


}
