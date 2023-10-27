package PublishCompany;

import java.time.LocalDate;

public class Publication {
private int id;
private String Title;
private double price;
private LocalDate publishDate;
private int rating;
private static int idGen=0;


@Override
public String toString() {
	return "TaskMenu [id=" + id + ", Title=" + Title + ", price=" + price + ", publishDate=" + publishDate + ", rating="
			+ rating + "]";
}


public Publication(String title, double price, LocalDate publishDate, int rating) {
	super();
	this.id=++idGen;
	Title = title;
	this.price = price;
	this.publishDate = publishDate;
	this.rating = rating;
}


public int getId() {
	return id;
}
public String getTitle() {
	return Title;
}

public double getPrice() {
	return price;
}
public LocalDate getPublishDate() {
	return publishDate;
}
public int getRating() {
	return rating;
}
public void setId(int id) {
	this.id = id;
}
public void setTitle(String title) {
	Title = title;
}
public void setPrice(double price) {
	this.price = price;
}
public void setPublishDate(LocalDate publishDate) {
	this.publishDate = publishDate;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
