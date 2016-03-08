package inventoryExercise1;

public class Inventory {
	private Product[] items;
	private final int maxSize;
	private int itemSize;


	public Inventory(int maxSize) {
		this.maxSize = maxSize;
		this.items = new Product[maxSize];
		this.itemSize = 0;
	}

	public boolean addProduct(Product p) {
		if (itemSize < maxSize) {
			items[itemSize] = p;
			itemSize++;
			return true;
		} else {
			return false;
		}
	}

	public int getSize() {
		return itemSize;
	}

	
	public Product getProduct(int index) {
		return items[index];
	}
	
	
	public void sortItems() {
		int size = itemSize;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < size - 1; i++) {
				String name1 = items[i].getName();
				String name2 = items[i + 1].getName();
				if (name1.compareToIgnoreCase(name2) > 0) {
					// swap
					Product temp = items[i];
					items[i] = items[i + 1];
					items[i + 1] = temp;
					swapped = true;
				}
			}
			size = size - 1;
		} while (swapped);
	}
	
	
	public double totalValue() {
		double value = 0;
		for (int i = 0; i < itemSize; i++) {
			value += items[i].inventory();
		}
		return value;
	}

}

