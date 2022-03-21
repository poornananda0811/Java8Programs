package homeTask_Consumer_Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class ConsumertoPrintFileorConsole {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung",1000,"mobile","A"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony",4000,"Home Theatre","C"));
		 productsList.add(new Product("LG",2500,"Refrigirator","D"));
		printType("Print",productsList.get(new Random().nextInt(productsList.size())));	 

	}
	public static void printType(String s,Product product)
	 {
		
	 Consumer<Product> c1= (p)->System.out.println(" Printing to"+s+" Product name is"+ p.name+ " Product price is"+p.price+ " Product Category is "+p.category+ " Product Grade is " +p.grade);			 
		 
		 c1.accept(product);
		
	 }
	

}
