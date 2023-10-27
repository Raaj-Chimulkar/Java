package PublishCompany;

import java.time.LocalDate;

public class Tape extends Publication {

private double playingTime;
	public Tape(String title, double price, LocalDate publishDate, int rating,double playingTime) {
		super(title, price, publishDate, rating);
		this.playingTime=playingTime;
	}
	@Override
	public String toString() {
		return "Tape [playingTime=" + playingTime + "]" + super.toString();
	}
}
