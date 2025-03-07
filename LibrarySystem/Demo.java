public class Demo{

public static void main(String args[]){

	Address address = new Address("fsd",3);
	Date publishDate = new Date(3,6,2000);
	Person p1 = new Person(25, new Address("lhr",4),"staff");
	Person p2 = new Person(30, new Address("lhr",6),"incharge");
	Book book = new Book(1234, publishDate, new Person(40, address, "author"));

	Library library = new Library(p1, p2, book, "ABC");

       	// address.showAddress();
	
	//p1.showPersonDetails();

	//publishDate.showDate();
	
	//book.showBookDetails();

	library.showLibraryDetails();

       




















}


}