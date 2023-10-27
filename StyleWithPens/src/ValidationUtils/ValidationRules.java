package ValidationUtils;
import Enum.Brand;
import Enum.Material;
import Enum.inkColor;
import StyleWithPen.Pen;

public class ValidationRules {

	
	public static Brand brandCheck(String brand)
	{
		return Brand.valueOf(brand.toUpperCase());
	}
	public static Material materialCheck(String material)
	{
		return Material.valueOf(material.toUpperCase());
	}
	
	public static inkColor inkCheck(String ink)
	{
		return inkColor.valueOf(ink.toUpperCase());
	}
	
	public static Pen validateAllInputs(String brand, String color, String inkColor,String Material)
{
    
		Brand b= brandCheck(brand);
		inkColor ink = inkCheck(inkColor);
		Material m= materialCheck(Material);
		int price = b.getPrice() + m.getPrice();
	return new Pen(b,color,ink,m,price);
}
}
