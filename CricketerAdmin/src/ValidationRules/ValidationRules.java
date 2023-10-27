package ValidationRules;

import java.util.Map;

import Cricketer.Cricketer;
import Cricketer.CustomException;

public class ValidationRules {

	
	
	public static String validateEmail(String email,Map<String, Cricketer>map) throws CustomException
	{
		if(map.containsKey(email))
			throw new CustomException ("Duplicate email!!");
		
		return email;
	}
	
	public static int validateRating(int rating,Map<String, Cricketer>map) throws CustomException
	{
		if(rating>10 && rating<0)
			throw new CustomException ("Invalid rating");
		return rating;
	}
	
	public static  Cricketer validateAllInputs(String name,int age,String email,String phoneNo,int rating,Map<String, Cricketer>map) throws CustomException
	{
		
		String validatedEmail=validateEmail(email,map);
		int finalrating=validateRating(rating,map);
		return new Cricketer(name,age,validatedEmail,phoneNo,finalrating);
	}
}
