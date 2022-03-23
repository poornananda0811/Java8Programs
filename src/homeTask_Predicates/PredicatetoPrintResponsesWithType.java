package homeTask_Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import homeTask_Consumer_Supplier.Product;

public class PredicatetoPrintResponsesWithType {

	public static void main(String[] args) {
		
		List<NewRespon> respList = new ArrayList<>();
		respList.add(new NewRespon("Response",400,"JSON"));
		respList.add(new NewRespon("New Response",201,"XML"));
		respList.add(new NewRespon("Old Response",401,"JSON"));
		respList.add(new NewRespon("Another Response",400,"XML"));
		Predicate<NewRespon> i =(res)->res.type.equals("JSON");
		NewRespon res=respList.get(new Random().nextInt(respList.size()));
		System.out.println("The res body is---"+res.body+ " res code is"+res.code +" res type is"+res.type);
			System.out.println(i.test(res));
			
			for(NewRespon newres:respList)
			{
				if(i.test(newres))
				{
					System.out.println("The res body is---"+newres.body+ " res code is"+newres.code+ " res type is"+newres.type);
				}
			}

	}

}
