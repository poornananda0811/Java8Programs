package homeTask_BiFunctionalInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import homeTask_Consumer_Supplier.Product;

public class BiFunctiontoCreateProductCart {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<>();
		 productsList.add(new Product("Samsung",1000,"mobile","Premium"));
		 productsList.add(new Product("Mi",3100,"television","B"));
		 productsList.add(new Product("Sony*",4000,"Home Theatre","Premium"));
		 productsList.add(new Product("LG",2500,"Refrigirator","D"));

		 HashMap<String,Integer> cartMap= new HashMap<String,Integer>();
		 cartMap.put("Samsung",3);
		 cartMap.put("LG",2);
		 BiFunction<List<Product>,Map<String,Integer>,Integer> biFunc= (Prodlist, newmap)->{
int totalcost=0;

			 for (Map.Entry<String, Integer> pair : newmap.entrySet()) {
				   for(Product p:Prodlist)
				   {
					   	if(p.name.equals(pair.getKey()))
					   	{
					   		totalcost=totalcost+(pair.getValue()*p.price);
					   	}
				   }
				}
			 
			return totalcost; 
			 };
			
			 
				System.out.println(biFunc.apply(productsList,cartMap)); 
			 
	}
	

}
