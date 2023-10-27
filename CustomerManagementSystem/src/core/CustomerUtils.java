 package core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerUtils {

	public static List<Customer> populateData()
	{
		//String firstname, String lastname, String email, String password, double registrationamt,LocalDate dob, ServicePlan plan
		List<Customer> custlist=new ArrayList<>();
		custlist.add(new Customer("Raaj","chims","raaj@123","raaj123",1000,LocalDate.parse("1999-03-11"),ServicePlan.SILVER));
		custlist.add(new Customer("rajesh","chims","raaj@123","raaj123",1000,LocalDate.parse("2000-03-11"),ServicePlan.SILVER));
		custlist.add(new Customer("sahil","chims","raaj@123","raaj123",1000,LocalDate.parse("2011-03-11"),ServicePlan.SILVER));
		custlist.add(new Customer("pranav","chims","raaj@123","raaj123",1000,LocalDate.parse("1548-03-11"),ServicePlan.SILVER));
		custlist.add(new Customer("prem","chims","raaj@123","raaj123",1000,LocalDate.parse("1655-03-11"),ServicePlan.SILVER));
		return custlist;
	}
	
	
	
	
	public static int findByEmail(String email,List<Customer> custlist)
	{
		Customer c=new Customer(email);
		return custlist.indexOf(c);

	}
}
