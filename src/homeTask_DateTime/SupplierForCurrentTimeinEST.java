package homeTask_DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Supplier;

public class SupplierForCurrentTimeinEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDateTime> s=()->LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(s.get());
	}

}
