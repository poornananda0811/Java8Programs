package homeTask_PremitiveInterfaces;

import java.util.function.IntConsumer;

public class IntConsumerToPrintSquare {

	public static void main(String[] args) {
		
		IntConsumer square = a -> System.out.println(a * a);

		
		square.accept(3);

	}

}
