public class Book{

	private int issn;
	private Date dop;
	private Person author;

Book(int issn,Date dop,Person author){

	this.issn = issn;
	this.dop = dop;
	this.author = author;
}

Book(Book other){

	this.issn = other.issn;
	this.dop = other.dop;
	this.author = other.author;
}

public void setDop(Date issn){

	this.dop = dop;
}

public Date getDop(){
	return dop;
}

public void setAuthor(Person author){

	this.author = author;
}

public Person getAuthor(){
	return author;
}

public void setIssn(int issn){

	this.issn = issn;
}

public int getIssn(){
	return issn;
}


void showBookDetails(){

	System.out.println("\nBOOK DETAILS");
	System.out.printf("\n%-20s%-8d", "ISSN:",issn);
	System.out.printf("\n%-20s%-8s","Publishing Date:",dop.getDay()+"-"+dop.getMonth()+"-"+dop.getYear());
	System.out.println();
}

public boolean equals(Object other){
		Book book1=(Book)other;

		return this.issn==book1.issn?true:false;








}