import java.util.Scanner;
public class Test1{

public static void main(String[]args){
  Product obj1 = new Product("mug",2,550,"mugs");
  Product obj2 = new Product("kitchen knife",1,80,"knives");
  Product obj3 = new Product("plate",5,850,"glass");
  Product obj4 = new Product("stanley",1,500,"bottles");

  System.out.printf("%-10s\t %-10s\t %-4s\t %-5s\t %-10s\t","Product ID","Name","Quantity","Price","Category");
  obj1.displaydata();
  obj2.displaydata();
  obj3.displaydata();
  obj4.displaydata();

  
  UserInfo user1 = new UserInfo();
  Scanner sc = new Scanner(System.in);
  
  System.out.print("Enter Username: ");
  user1.username = sc.nextLine();
  
  if(user1.username.equals(UserInfo.username))
    System.out.print("VALID");
  
  System.out.print("Enter password: ");
  user1.password = sc.nextLine();

  if(user1.password.equals(UserInfo.password));
  System.out.print("VALID");
  
  
  


}
}