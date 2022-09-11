package bean;

import java.time.LocalDate;

import utils.Ex03utils;

public class FirstAndLastDayOfWeek {
	private LocalDate firstDayOfWeek;
	private LocalDate lastDateOfWeek;
	public FirstAndLastDayOfWeek() {
	}
	public FirstAndLastDayOfWeek(LocalDate firstDayOfWeek, LocalDate lastDateOfWeek) {
		this.firstDayOfWeek = firstDayOfWeek;
		this.lastDateOfWeek = lastDateOfWeek;
	}
	public LocalDate getFirstDayOfWeek() {
		return firstDayOfWeek;
	}
	public void setFirstDayOfWeek(LocalDate firstDayOfWeek) {
		this.firstDayOfWeek = firstDayOfWeek;
	}
	public LocalDate getLastDateOfWeek() {
		return lastDateOfWeek;
	}
	public void setLastDateOfWeek(LocalDate lastDateOfWeek) {
		this.lastDateOfWeek = lastDateOfWeek;
	}
	@Override
	public String toString() {
		return "FirstAndLastDayOfWeek [firstDayOfWeek=" + Ex03utils.df1.format(firstDayOfWeek) + ", lastDateOfWeek=" + Ex03utils.df1.format(lastDateOfWeek) + "]";
	}
	
}
