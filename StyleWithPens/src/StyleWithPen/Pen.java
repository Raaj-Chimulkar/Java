package StyleWithPen;
import java.time.LocalDate;

import Enum.Brand;
import Enum.Material;
import Enum.inkColor;

public class Pen {
private int id;
private Brand brand;
private String color;
private inkColor inkColor;
private Material material;
private int stock;
private LocalDate stockUpdateDate;
private LocalDate listingDate;
private int price;
private double Discount;

static int idGen=100;

//
//public Pen(Brand brand, String color, String inkColor, Material material, int stock, LocalDate stockUpdateDate,
//		LocalDate listingDate, int price, double discount) {
//	super();
//	this.brand = brand;
//	this.color = color;
//	this.inkColor = inkColor;
//	this.material = material;
//	this.stock = stock;
//	this.stockUpdateDate = stockUpdateDate;
//	this.listingDate = listingDate;
//	this.price = price;
//	Discount = discount;
//}
//Brand,Color,inkColor,Material,Price
public Pen(Brand brand, String color, inkColor inkColor,Material Material,int Price) {
this.id=idGen++;
this.brand=brand;
this.color=color;
this.inkColor=inkColor;
this.material=Material;
this.price=price;
}
public Brand getBrand() {
	return brand;
}

public String getColor() {
	return color;
}

public inkColor getInkColor() {
	return inkColor;
}

public Material getMaterial() {
	return material;
}

public int getStock() {
	return stock;
}

public LocalDate getStockUpdateDate() {
	return stockUpdateDate;
}

public LocalDate getListingDate() {
	return listingDate;
}

public double getPrice() {
	return price;
}

public double getDiscount() {
	return Discount;
}

public void setBrand(Brand brand) {
	this.brand = brand;
}

public void setColor(String color) {
	this.color = color;
}

public void setInkColor(String inkColor) {
	this.inkColor =getInkColor().valueOf(inkColor.toUpperCase());
}

public void setMaterial(Material material) {
	this.material = material;
}

public void setStock(int stock) {
	this.stock = stock;
}

public void setStockUpdateDate(LocalDate stockUpdateDate) {
	this.stockUpdateDate = stockUpdateDate;
}

public void setListingDate(LocalDate listingDate) {
	this.listingDate = listingDate;
}

public void setPrice(int price) {
	this.price = price;
}

public void setDiscount(double discount) {
	Discount = discount;
}


}