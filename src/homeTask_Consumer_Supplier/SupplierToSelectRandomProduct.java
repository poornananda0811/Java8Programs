package homeTask_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierToSelectRandomProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung",1000,"mobile","A"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony",4000,"Home Theatre","C"));
		 productsList.add(new Product("LG",2500,"Refrigirator","D"));
		 
		 Supplier<Product> s1= ()->{	 
		Product prod=productsList.get(new Random().nextInt(productsList.size()));
		return prod;
		 };
		 
		 Product finalProd=s1.get();
		 System.out.println("Product name is"+ finalProd.name+ " Product price is"+finalProd.price+ " Product Category is "+finalProd.category+ " Product Grade is " +finalProd.grade);
	}

}
