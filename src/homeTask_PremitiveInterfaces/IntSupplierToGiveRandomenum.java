package homeTask_PremitiveInterfaces;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierToGiveRandomenum {

	public static void main(String[] args) {
		
		IntSupplier randomNum= ()->{
			Random rnum = new Random();
		
		return rnum.nextInt(5000);
		};
		
		System.out.println(randomNum.getAsInt());
		}

	

}
