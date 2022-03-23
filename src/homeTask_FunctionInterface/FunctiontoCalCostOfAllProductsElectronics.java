package homeTask_FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import homeTask_Consumer_Supplier.Product;

public class FunctiontoCalCostOfAllProductsElectronics {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung*",1000,"mobile","Premium"));
		 productsList.add(new Product("Mi",3100,"Electronics","A"));
		 productsList.add(new Product("Sony*",4000,"Home Theatre","Premium"));
		 productsList.add(new Product("LG*",2500,"Electronics","B"));

		 Function<List<Product>,Integer> fun=(li)->{
			 int total=0;
			 for(Product p:li)
			 {
				 if(p.category.equals("Electronics"))
				 {
				 total=total+p.price;
				 }
			 }
			 return total;
		 };
		 System.out.println(fun.apply(productsList) +" is the total cost of all Products whose category is Electronics");
	}

}
