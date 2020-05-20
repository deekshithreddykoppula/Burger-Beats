package sdt;
import java.util.*;
public class Deluxeburger extends Hamburger 
{
	public Deluxeburger(String Breadtype,String Meattype,double price) 
	{
		super(Breadtype, Meattype, price);
		super.Breadtype=Breadtype;
		super.Meattype=Meattype;
		super.price=price;
		
	}
	public void total(List<String> a,List<Double> b)
	{
		System.out.println("Deluxeburger on a "+this.Breadtype+" with "+this.Meattype+", price is "+this.price);
		for(int i=0;i<a.size();i++) 
		{
			System.out.println("Included "+a.get(i)+" of price "+b.get(i));
	    }

     }

}
