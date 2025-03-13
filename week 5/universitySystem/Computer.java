public class Computer{

	private String ID;
	private String version="I3",ram="8GB", diskSize="200GB";
	
	Computer(String ID){
		this.ID = ID;	
	}
	
	public String getRam(){
		return ram;
	}
	public String getdiskSize(){
		return diskSize;
	}



	public void displayComputer(){
		System.out.println("ID: " + ID);
	        System.out.println("Version: "+version);
		System.out.println("RAM: " +ram);
		System.out.println("DISK SIZE: " + diskSize);
		


}

















}