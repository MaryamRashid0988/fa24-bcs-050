
public class Product{
 private static int counter=1;
 private String ID;
 private String name;
 private int quantity;
 private double price;
 private String category;

 public Product(String n, int Quantity, double Price, String Category)    // constructor
{
  this.name = n;
  quantity = Quantity;
  price = Price;
  category = Category;
  ID = ""+counter++;
}
 
public void setname(String Name){
  name = Name;
}

public String getname(){
  return name;
}

public void setQuantity(int quant){
 if(quant>0)
  quantity=quant;
}
public int getQuantity(){
  return quantity; 
}

public void setPrice(double p){
  price = p;
}
public double getPrice(){
  return price; 
}

public void setCategory(String c){
  category=c;
}
public String getCategory(){
  return category; 
}

void displaydata(){
  System.out.printf("\n%-10s\t %-10s\t %d\t\t %-5.2f\t %-10s\t",ID,name,quantity,price,category); 
}

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


}
}














 