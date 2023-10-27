package PublishCompany;

import java.time.LocalDate;

public class Book extends Publication {
private int pgCount;
	public Book(String title, double price, LocalDate publishDate, int rating,int pgCount) {
		super(title, price, publishDate, rating);
		this.pgCount=pgCount;
	}
	@Override
	public String toString() {
		return "Book [pgCount=" + pgCount + "]" + super.toString();
	}
	@Override
	public LocalDate getPublishDate() {
		// TODO Auto-generated method stub
		return super.getPublishDate();
	}

}
