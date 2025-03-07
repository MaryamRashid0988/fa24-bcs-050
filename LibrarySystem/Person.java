public class Person{

	private int age;
	private Address address;
	private String role;

Person(int age, Address address, String role){

	this.age = age;
	this.address = address;
	this.role = role;

}

Person(Person other){

	this.age = other.age;
	this.address = other.address;
	this.role = other.role;
}

public void setAge(int age){
	this.age = age;
}
public int getAge(){
	return age;
}

public void setAddress(Address address){
	this.address = address;
}
public Address getAddress(){
	return address;
}

public void setRole(String role){
	this.role = role;
}
public String getRole(){
	return role;
}

void showPersonDetails(){

	System.out.println("DETAILS OF PERSON");
	System.out.println();
	System.out.printf("%-10s%-21s%-10s", "AGE","ADDRESS","ROLE");
	System.out.printf("\n%-10d%-7s%-14s%-10s", age, "Street:",address.getStreet(), role);
	System.out.printf("\n%-10s%-7s%-14s","","City:",address.getCity());
	System.out.println();
}

public boolean equals(Object other){
		Person person1=(Person)other;

		if(this.role==person1.role && this.adress==person1.address)
				{ return true;}
}






}