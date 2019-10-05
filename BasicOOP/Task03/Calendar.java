package by.htp.BasicOOP.Task03;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Month> months;

    public Calendar() {
	months = new ArrayList<Month>();
    }

    public List<Month> getMonths() {
	return months;
    }

    public void setMonths(List<Month> months) {
	this.months = months;
    }

    public void addMonth(Month month) {
	months.add(month);
    }

    class Month {
	private List<Day> days;
	private String title;

	public Month(String title) {
	    days = new ArrayList<Day>();
	    this.title = title;
	}

	public void addDay(Day day) {
	    days.add(day);
	}

	public List<Day> getDays() {
	    return days;
	}

	public void setDays(List<Day> days) {
	    this.days = days;
	}

	public String getTitle() {
	    return title;
	}

	public void setTitle(String title) {
	    this.title = title;
	}
    }

    class Day {
	private int day;
	private boolean dayOff;
	private boolean holiday;

	public Day(int date, boolean holiday, boolean dayOff) {
	    this.day = date;
	    this.holiday = holiday;
	    this.dayOff = dayOff;
	}

	public int getDay() {
	    return day;
	}

	public void setDay(int day) {
	    this.day = day;
	}

	public boolean isHoliday() {
	    return holiday;
	}

	public void setHoliday(boolean holiday) {
	    this.holiday = holiday;
	}

	public boolean isDayOff() {
	    return dayOff;
	}

	public void setDayOff(boolean dayOff) {
	    this.dayOff = dayOff;
	}
    }
}
