package homeTask_PremitiveInterfaces;

import java.util.function.IntPredicate;

public class IntPredicateToVerifyPrimeNumber {

	public static void main(String[] args) {
		
		IntPredicate p=(n)->{
			int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
		return true;
		}
		return false;
				
		};			
System.out.println(p.test(77));
	}

}
