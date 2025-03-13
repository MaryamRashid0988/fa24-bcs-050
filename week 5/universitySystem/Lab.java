public class Lab{

	private String name;
	private Person staff;
	private Computer comp[] = new Computer[50];

	Lab(String name, Person staff){
		this.name = name;
		this.staff = staff;
		for(int i=0;i<comp.length;i++)
			comp[i]=new Computer("C"+i);
		}

	public void displayLab(){
		System.out.println("Name: "+ name);
		staff.displayPerson();
		for(int i=0;i<comp.length;i++){
			comp[i].displayComputer();}
		System.out.println("");
	}




	






}