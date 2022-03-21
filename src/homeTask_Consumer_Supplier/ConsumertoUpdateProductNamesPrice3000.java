package homeTask_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumertoUpdateProductNamesPrice3000 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung*",1000,"mobile","Premium"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony*",4000,"Home Theatre","Premium"));
		 productsList.add(new Product("LG*",2500,"Refrigirator","D"));
		 
		 Consumer<Product> c1= (p)->{
			if(p.name.contains("*")&&p.grade.equals("Premium"))
			{
				 System.out.println("Product name is"+ p.name+ " Product price is"+p.price+ " Product Category is "+p.category+ " Product Grade is " +p.grade);
			}
			 
		 };
		 for(Product prod: productsList)
		 {
			 c1.accept(prod);
		 }
		 
	}
	
	

}
