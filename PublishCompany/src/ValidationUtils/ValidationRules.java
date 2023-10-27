package ValidationUtils;

import java.time.LocalDate;
import java.util.Map;

import CustomException.CustomException;
import PublishCompany.Book;
import PublishCompany.Publication;

public class ValidationRules {

	//validating title
	public static String validateTitle(String title,Map<String, Publication>map) throws CustomException
	{
	if(map.containsKey(title))
		throw new CustomException("Duplicate Title");
	
		return title;
	}
	
	//validating all user inputs
	public static Book validateAllInputs(String title,double price,String date,int rating,int pages,Map<String, Publication>map) throws CustomException
	{
		String validatedtitle=validateTitle(title,map);
		LocalDate ValidatedDate=validateDate(date,map);
		int validatedRating=validateRating(rating,map);
		return new Book (validatedtitle,price,ValidatedDate,validatedRating,pages);
		
	}
	//Validate rating
	private static int validateRating(int rating, Map<String, Publication> map) throws CustomException {
		if(rating>10 && rating<0)
			throw new CustomException("invalid rating!");
		return rating;
	}

	//Validating date
	private static LocalDate validateDate(String date, Map<String, Publication> map) {
		
		return LocalDate.parse(date);
	}
}
