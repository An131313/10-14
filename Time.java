package time;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
	private int hour;
	private int minutes;
	private int seconds;
	
	public Time() {
		this(System.currentTimeMillis());
	}
	
	public Time(long milliseconds) {
			setTime(milliseconds);
	}
	
	public Time(int h, int m, int s) {
		setHour(h); // setHour(h);
		setMinutes(m);
		setSeconds(s);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public void setTime( long milliseconds) {
		long millisecondsToday = milliseconds % (1000l * 60 * 60 * 24);
		this.hour = (int) (millisecondsToday / (1000 * 60 * 60));
		this.minutes = (int) (millisecondsToday % (1000 * 60 * 60) / (1000 * 60));
		this.seconds = (int) (millisecondsToday % (1000 * 60 * 60) % (1000 * 60) / 1000);
	}
	
	public String toString() {
		return "Hour: " + hour + "\n" + "Minutes: " + minutes + "\n" +  "Seconds: " + seconds;
	}
	
}
