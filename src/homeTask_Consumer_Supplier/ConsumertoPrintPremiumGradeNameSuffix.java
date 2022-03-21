package homeTask_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumertoPrintPremiumGradeNameSuffix {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung",1000,"mobile","A"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony",4000,"Home Theatre","C"));
		 productsList.add(new Product("LG",2500,"Refrigirator","D"));
		 
		 Consumer<Product> c1= (p)->{
			if(p.price>3000)
			{
				p.name=p.name+"*";
			}
			 
		 };
		 for(Product prod: productsList)
		 {
			 c1.accept(prod);
		 }
		 
		 for(Product p:productsList)
		 {
			 System.out.println("Product name is"+ p.name+ " Product price is"+p.price+ " Product Category is "+p.category+ " Product Grade is " +p.grade);
		 }

	}
	
	

}
