package homeTask_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class FunctiontoCalculateAge {

	public static void main(String[] args) {
		
		Function<String,String> f= (s)->{
			
		LocalDate localDobDate = LocalDate.parse(s);
		
       LocalDate presentDate=LocalDate.now();
		LocalDate dobDate = LocalDate.of(localDobDate.getYear(), localDobDate.getMonth(), localDobDate.getDayOfMonth());
		LocalDate pdate = LocalDate.of(presentDate.getYear(), presentDate.getMonth(), presentDate.getDayOfMonth());

		Period period = Period.between(dobDate, pdate);
	String value= "age is"+ period.getYears()+" years" + period.getMonths()+" months"+period.getDays() +"days";
	return value;
		};
		System.out.println(f.apply("1986-11-08"));
	}

}
