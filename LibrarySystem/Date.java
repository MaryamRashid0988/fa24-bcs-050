public class Date{

	private int day, month, year;

Date(int day, int month, int year){

	this.day = day;
	this.month = month;
	this.year = year;
}

Date(Date other){

	this.day = other.day;
	this.month = other.month;
	this.year = other.year;
}

public void setDay(int day){
	this.day = day;
}
public int getDay(){
	return day;
}

public void setMonth(int month){
	this.month = month;
}
public int getMonth(){
	return month;
}

public void setYear(int year){
	this.year = year;
}
public int getYear(){
	return year;
}

void showDate(){

	System.out.println("Date: "+day+"/"+month+"/"+year);
}










}