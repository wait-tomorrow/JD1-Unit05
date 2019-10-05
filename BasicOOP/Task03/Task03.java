package by.htp.BasicOOP.Task03;
import java.util.List;

import by.htp.BasicOOP.Task03.Calendar.Day;
import by.htp.BasicOOP.Task03.Calendar.Month;

/*
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов 
 * которого можно хранить информацию о выходных и праздничных днях.
 */

public class Task03 {

    public static void main(String[] args) {
	Calendar calendar = new Calendar();
	Month jan = calendar.new Month("Январь");
	
	for (int i=1; i<=31; i++) {
	    if(i==5 || i==6 || i==12 || i==13 || i==19 || i==20 || i==26 || i==27) {
		jan.addDay(calendar.new Day(i, false, true));
	    } else if(i==7) {
		jan.addDay(calendar.new Day(i, true, false));
	    } else {
		jan.addDay(calendar.new Day(i, false, false));
	    }
	}

	calendar.addMonth(jan);
	
	System.out.println("Выходные дни: ");
	printDays(CalendarLogic.getDaysOff(calendar, "Январь"));
    }
    
    private static void printDays(List<Day> days) {
	for (Day day : days) {
	    System.out.println(day.getDay());
	}
    }
}
