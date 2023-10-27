package Tester;
import java.util.*;

import StyleWithPen.Pen;
import ValidationUtils.ValidationRules;

public class Tester {

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
List<Pen> p=new ArrayList<>();
boolean exit=false;
{
while(!exit)
{
	System.out.println("Choose the Operation\n"
			+ "1.Add pen\n"
			+ "2.Update Stock;"
			+ "3.Set discount 20%\n"
			+ "4.Remove pens with 90+ days sales\n"
			+ "0.exit");
	switch(sc.nextInt())
	{
	case 1:
		System.out.println("Enter details\n"
				+ "Brand,Color,inkColor,Material");
		p.add(ValidationRules.validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next()));
		System.out.println("Added Succesfully!");
	
		break;
		
	case 2:
		
		break;
		
	case 3:
		
		break;
		
	case 4:
		
		break;
		
	case 0:
		exit=true;
		break;
	}
}

}
}
}