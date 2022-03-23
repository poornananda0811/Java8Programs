package homeTask_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homeTask_Consumer_Supplier.Product;

public class GetAllElectronicProductsGreaterThanThousand {
	public static void main(String[] args) {
		
		 List<Product> productsList = new ArrayList<>();
	        productsList.add(new Product("Samsung",1000,"mobile","A"));
	        productsList.add(new Product("Mi",999,"electronics","B"));
	        productsList.add(new Product("Sony",40000,"electronics","C"));
	        productsList.add(new Product("LG",25000,"electronics","D"));

	        List<Product> productsWithPriceMoreThan1000 = productsList.stream().filter(product -> product.getPrice() > 1000)
	                .collect(Collectors.toList());
	        
	        List<Product> productsWithPriceMoreThan1000AndElectronicsCat = productsWithPriceMoreThan1000.stream()
	                .filter(product -> product.getCategory().equalsIgnoreCase("electronics"))
	                .collect(Collectors.toList());
	        
	        for(Product prod : productsWithPriceMoreThan1000AndElectronicsCat) {
	            System.out.println("Products with price more than 1000 and belonging to electronics category is " + prod.toString());
	        }
	}
}
