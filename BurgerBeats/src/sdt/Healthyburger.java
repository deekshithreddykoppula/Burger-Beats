package sdt;
import java.util.*;
public class Healthyburger extends Hamburger
{

	public Healthyburger(String Breadtype, String Meattype, double price)
	{
		super(Breadtype, Meattype, price);
		super.Breadtype=Breadtype;
		super.Meattype=Meattype;
		super.price=price;
	}
	public void total(List<String> a,List<Double> b)
	{
		double s=0;
		double t=0;
		System.out.println("Healthyburger on a "+this.Breadtype+" with "+this.Meattype+", price is "+this.price);
		for(int i=0;i<a.size();i++) 
		{
			System.out.println("Added "+a.get(i)+" for an extra "+b.get(i));
			 s=b.get(i)+s;
	     }
		 t=this.price+s;
     System.out.println("Total cost is " +t);
	}
	public String[] toppings()
	{
		String [] toppings= {"Lettuce","Tomato","Cheese","Onions","Capscicum","Corn"};
		return toppings;
	}
	public double[] price() 
	{
		double [ ] price= { 2.67,1.25,3.52,3.50,2.56,4.25};
		return price;
	}
}
