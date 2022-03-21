package homeTask_DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class SupplierForNextThursday {

	public static void main(String[] args) {
		
		Supplier<LocalDate> s=()->LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		System.out.println(s.get());
	}

}
