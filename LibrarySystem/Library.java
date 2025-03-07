public class Library{

	private Person staff;
	private Person incharge; 
	private Book book;
	private String name;


Library(Person staff, Person incharge, Book book, String name){

	this.staff = staff;
	this.incharge = incharge;
	this.book = book;
	this.name = name;
}

public void setStaff(Person staff){
	this.staff = staff;
}
public Person getStaff(){
	return staff;
}

public void setIncharge(Person incharge){
	this.incharge = incharge;
}
public Person getIncharge(){
	return incharge;
}

public void setBook(Book book){
	this.book = book;
}
public Book getBook(){
	return book;
}

public void setName(String name){
	this.name = name;
}
public String getName(){
	return name;
}


void showLibraryDetails(){

	System.out.printf("%" + ((50 - name.length()) / 2 + name.length()) + "s", name);
	System.out.printf("\n%" + ((50 - "INCHARGE DETAILS".length()) / 2 + "INCHARGE DETAILS".length()) + "s%n", "INCHARGE DETAILS");
	
	



































}



























}