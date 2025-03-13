public class Person{

	private String name;
	private int ID;

	Person(String name, int ID){

		this.name = name;
		this.ID = ID;

	}

	public void displayPerson(){

		System.out.println("Name: " + name);
		System.out.println("ID: " + ID);



	}

	public void setName(String name){
		this.name = name;
	}
        public String getName(){
		return name;
	}

	public void setName(int ID){
		this.ID = ID;
	}
        public int getID(){
		return ID;
	}




















}