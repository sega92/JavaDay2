package inventoryExercise1;

public class InventoryProgramme {
	public static void main(String[] args) {
		Inventory inventory = new Inventory(100);

		Product id = new Product();
		id.setItemNumber(1243);
		id.setName("Lorry");
		id.setNumberOfUnits(2);
		id.setprice(35000);
		inventory.addProduct(id);
		id = new Product(1545, "Car", 50, 6750);
		inventory.addProduct(id);
		id = new Product(1234, "Cycle", 50, 200);
		inventory.addProduct(id);
		id = new Product(2389, "Vans", 10, 10000);
		inventory.addProduct(id);
		
		inventory.sortItems();
		
		for (int i = 0; i < inventory.getSize(); i++) {
			id = inventory.getProduct(i);
			System.out.println(id);
		}
		
		// displays the value of the entire stock
		double totalInventory = inventory.totalValue();
		System.out.println("");
		System.out.println("The value of the entire inventory: " + totalInventory);
		
		
	}
}

