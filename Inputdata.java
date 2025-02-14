import java.util.Scanner;
public class Inputdata{
 
public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in); //Scanner is built-in data type
     
     int i=0;
     String s="";
     
     System.out.println("Enter integer :");
     i = sc.nextInt();
     sc.nextLine();
     System.out.println("Enter name: ");
     s = sc.nextLine();
     System.out.printf("value entered: %d\n",i);
     System.out.printf("string entered: %s\n",s);
}

}

//sc.nextByte();
//sc.nextShort();
//sc.nextLong();

//sc.next(); //for single word
//sc.nextLine(); // for complete line