public class Address{

	private String city;
	private int street;

Address(String city, int street){      

	this.city = city;
	this.street = street;
}

Address(Address other){                

	this.city = other.city;
	this.street = other.street;
}

public void setCity(String city){

	this.city = city;
}
public String getCity(){

	return city;
}

public void setStreet(int street){

	this.street = street;
}
public int getStreet(){

	return street;
}


public void showAddress(){

	System.out.printf("%-8s %-8s", "City: ",city);
	System.out.printf("%-8s %-8s", "\nStreet: ",street);
}

//boolean equals(Object obj)



























}