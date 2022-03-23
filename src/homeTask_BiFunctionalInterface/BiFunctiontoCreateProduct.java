package homeTask_BiFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import homeTask_Consumer_Supplier.Product;

public class BiFunctiontoCreateProduct {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung*",1000,"mobile","Premium"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony*",4000,"Home Theatre","Premium"));
		 productsList.add(new Product("LG*",2500,"Refrigirator","D"));

		 BiFunction<String,Integer,List<Product>> biFunc= (newProdName,newProdPrice)->{

productsList.add(new Product(newProdName,newProdPrice,"Furniture","Premium"));
			
return productsList;
			 };
			 biFunc.apply("SofaSet",10000);
			 for(Product p: productsList)
				 System.out.println("Product name is"+ p.name+ " Product price is"+p.price+ " Product Category is "+p.category+ " Product Grade is " +p.grade);
	}
	

}
