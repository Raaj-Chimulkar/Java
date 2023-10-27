package Cricketer;

public class Cricketer {
private String name;
private int age;
private String email_id;
private String phoneNo;
private int rating;


public Cricketer(String name, int age, String email_id, String phoneNo, int rating) {
	super();
	this.name = name;
	this.age = age;
	this.email_id = email_id;
	this.phoneNo = phoneNo;
	this.rating = rating;
}


@Override
public String toString() {
	return "Cricketer [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phoneNo=" + phoneNo + ", rating="
			+ rating + "]";
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getEmail_id() {
	return email_id;
}


public void setEmail_id(String email_id) {
	this.email_id = email_id;
}


public String getPhoneNo() {
	return phoneNo;
}


public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}


public int getRating() {
	return rating;
}


public void setRating(int rating) {
	this.rating = rating;
}





}
