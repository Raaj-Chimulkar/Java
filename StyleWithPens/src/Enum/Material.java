package Enum;

public enum Material {
PLASTIC(5),ALLOY_STEEL(20),METAL(30);
	public int price;

	private Material(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	
}
