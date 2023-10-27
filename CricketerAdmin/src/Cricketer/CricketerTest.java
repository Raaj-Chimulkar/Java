package Cricketer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static ValidationRules.ValidationRules.*;
public class CricketerTest {

	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);	
	Map<String, Cricketer> map= new HashMap<>();
	boolean exit=false;
	
	try {
		while(!exit)
		{
			System.out.println("********Admin Menu**********");
			System.out.println("Choose required operation\n"
					+ "1.Add cricketer\n"
					+ "2.Modify cricketers rating\n"
					+ "3.Display cricketers details\n"
					+ "4.Display all cricketers\n"
					+ "5.Display all sorted based on rating\n"
					+ "0.Exit");
			switch(sc.nextInt())
			{
			case 1://Add a cricketer
				System.out.println("Enter players Details\n"
						+ "Name , Age , EmailId , PhoneNo , Rating ");
				Cricketer c= validateAllInputs(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),map);
				//Cricketer c=new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
				map.put(c.getEmail_id(), c);
				System.out.println("Player Added Succesfully!!");
				
//				Cricketer c1=new Cricketer("Raaj",25,"raajchimulkar@123","9765163728",10);
//				Cricketer c2=new Cricketer("Arjun",24,"arjun@123","9854215871",9);
//				Cricketer c3=new Cricketer("Krishna",22,"krsih@123","8754357124",2);
//				Cricketer c4=new Cricketer("Vishal",28,"vishals@123","3354215524",4);
//				Cricketer c5=new Cricketer("Prem",23,"premsashh@123","8875428712",5);
//				
//				map.put(c1.getEmail_id(), c1);
//				map.put(c2.getEmail_id(), c2);
//				map.put(c3.getEmail_id(), c3);
//				map.put(c4.getEmail_id(), c4);
//				map.put(c5.getEmail_id(), c5);
				
				break;
				
			case 2://Modify cricketers rating
				System.out.println("Enter emailId and rating to be modified");
				String email=sc.next();
				int rating =sc.nextInt();
				map.get(email).setRating(rating);
//				Cricketer cp=map.get(sc.next());
//				if(cp==null)
//					System.out.println("User doesnt exit");
//				cp.setRating(sc.nextInt());
				
				break;
				
			case 3:
				map.values().forEach(p->System.out.println(p));
				
				break;
				
			case 4://Display all cricketers
				map.values().forEach(p->System.out.println(p.getName()));
				break;
				
			case 5:
				//sorted(Comparator.comparing(Publication::getRating).reversed())
				//.forEach(p -> System.out.println(p));
				map.values().stream().sorted((Comparator.comparing(Cricketer::getRating).reversed()))
				.forEach(p->System.out.println(p));

						
				
				break;
				
			case 0:
				exit=true;
				
			default:
					break;
				
			}
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}
	
}
