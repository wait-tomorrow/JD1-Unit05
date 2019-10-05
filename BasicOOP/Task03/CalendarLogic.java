package by.htp.BasicOOP.Task03;

import java.util.ArrayList;
import java.util.List;

import by.htp.BasicOOP.Task03.Calendar.Day;
import by.htp.BasicOOP.Task03.Calendar.Month;

public class CalendarLogic {

    public static List<Day> getDaysOff(Calendar calendar, String month) {
	ArrayList<Day> result = new ArrayList<Day>();

	for (Month m : calendar.getMonths()) {
	    if (month.equals(m.getTitle())) {
		for (Day day : m.getDays()) {
		    if (day.isDayOff()) {
			result.add(day);
		    }
		}
	    }
	}

	return result;
    }
}
