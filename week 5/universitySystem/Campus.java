public class Campus{

	Department dept[] = new Department[5];


	Campus(){		
		
		for(int i=0;i<dept.length;i++){
			dept[i]=new Department("Department"+i,new Person("Incharge"+i,i+1));
		}
	}

	public void displayCampus(){
 		System.out.println();
		for(int i=0;i<dept.length;i++)
		    {dept[i].displayDept();}
	}



















}