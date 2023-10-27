package Enum;

public enum Brand {
CELLO(5),PARKER(50),REYNOLDS(20);
	public int price;

	private Brand(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}
