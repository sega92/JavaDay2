package inventoryExercise1;

public class Product {
	private int itemNumber;
	private String name;
	private int numberOfUnits;
	private double price;
	
	//Constructor
	Product(){
		
	}
	
	//constructor overloading
	Product(int itemNumber, String name, int numberOfUnits, double price){
		this.itemNumber = itemNumber;
		this.name = name;
		this.numberOfUnits = numberOfUnits;
		this.price = price;
	}
	
	//method that returns value for inventory
	public double inventory()
	{
		return this.numberOfUnits * this.price;
	}
	
	//Getters
	public int getItemNumber(){
		return itemNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public int getnumberOfUnits(){
		return numberOfUnits;
	}
	
	public double price(){
		return price;
	}
	
	//Setters
	public void setItemNumber(int itemNumber){
		this.itemNumber = itemNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumberOfUnits(int numberOfUnits){
		this.numberOfUnits = numberOfUnits;
	}
	
	public void setprice(double price){
		this.price = price;
	}
	
	
	public String toString() {
		return "Item Number: " + itemNumber + "\tName: " + name + "\tPrice: " + 
	price + "\tNumber of Units: " + numberOfUnits + "\tInventory: " + inventory()  ;	
	}
	
}


