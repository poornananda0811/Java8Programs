package homeTask_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homeTask_Consumer_Supplier.Product;

public class GetAllProductsElectronicsCategory {

	public static void main(String[] args) {
	
		 List<Product> productsList = new ArrayList<>();
	        productsList.add(new Product("Samsung",1000,"mobile","A"));
	        productsList.add(new Product("Mi",999,"electronics","B"));
	        productsList.add(new Product("Sony",40000,"electronics","C"));
	        productsList.add(new Product("LG",25000,"electronics","D"));
	        
	        List<Product> productsWithCategoryOfElectronics = productsList.stream().filter(product ->
            product.getCategory().equalsIgnoreCase("electronics")).collect(Collectors.toList());
	        
	        for(Product prod : productsWithCategoryOfElectronics) {
	            System.out.println("Products belonging to electronics category is " + prod.toString());
	        }

	}

}
