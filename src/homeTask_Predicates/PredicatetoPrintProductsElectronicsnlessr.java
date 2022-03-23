package homeTask_Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import homeTask_Consumer_Supplier.Product;

public class PredicatetoPrintProductsElectronicsnlessr {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Samsung",1000,"mobile","A"));
        productsList.add(new Product("Mi",999,"electronics","B"));
        productsList.add(new Product("Sony",40000,"electronics","C"));
        productsList.add(new Product("LG",25000,"electronics","D"));
		Predicate<Product> i =(prod)->
		{
		if(prod.category.equals("electronics") && prod.price<1000)
		{
			return true;
		}
		return false;
		};
		
		Product prod=productsList.get(new Random().nextInt(productsList.size()));
		System.out.println("The prod Name is---"+prod.name+ " prod category is"+prod.category+" prod price is"+prod.price);
			System.out.println(i.test(prod));
			
			for(Product p:productsList)
			{
				if(i.test(p))
				{
					System.out.println("Product name is"+ p.name+ " Product price is"+p.price+ " Product Category is "+p.category+ " Product Grade is " +p.grade);
				}
			}

	}

}
