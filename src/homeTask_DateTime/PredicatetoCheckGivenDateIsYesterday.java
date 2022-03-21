package homeTask_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Predicate;



public class PredicatetoCheckGivenDateIsYesterday {

	public static void main(String[] args) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate yesterday = LocalDate.now().minusDays(1);	 
		Predicate<String> i =(String a)->yesterday.equals(LocalDate.parse(a, formatter));
 						System.out.println(i.test("2022-03-19"));

}
}