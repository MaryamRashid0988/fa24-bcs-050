public class Department{

	private Person incharge;
	private String name;
	private Lab labs[] = new Lab[20];
	
 	Department(String name, Person incharge){
		this.incharge = incharge;
		this.name = name;

		for(int i=0;i<labs.length;i++)
			labs[i]=new Lab("Lab"+i,new Person("Staff"+i, i+1));
		
	}


	public void displayDept(){
		
		System.out.println("Name: " + name);
		System.out.println("Incharge: " + incharge);
		for(int i=0;i<labs.length;i++){
			labs[i].displayLab();}
		System.out.println("");



	} 






















}