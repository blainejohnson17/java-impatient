package ch02.ex11;

import static java.lang.System.out;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Cal {

	public static void main(String[] args) {
		LocalDate date = now().withDayOfMonth(1);
		int month;
		if (args.length >= 2) {
			month = Integer.parseInt(args[0]);
			int year = Integer.parseInt(args[1]);
			date = of(year, month, 1);
		} else {
			month = date.getMonthValue();
		}

		out.println(" Sun Mon Tue Wed Thu Fri Sat");
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
		for (int i = 0; i < value; i++)
			out.print("    ");
		while (date.getMonthValue() == month) {
			out.printf("%4d", date.getDayOfMonth());
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 7)
				out.println();
		}
		if (date.getDayOfWeek().getValue() != 7)
			out.println();
	}
}
