package sdt;
import java.util.*;
public class Hamburger 
{
	String Breadtype;
	String Meattype;
	double price;
    public Hamburger(String Breadtype,String Meattype,double price)
	{
		this.Breadtype=Breadtype;
		this.Meattype=Meattype;
		this.price=price;
		
	}
	public void total(List<String> a,List<Double> b)
	{
		double s=0;
		double t=0;
		System.out.println("Hamburger on a "+this.Breadtype+" with "+this.Meattype+", price is "+this.price);
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
		String toppings[]= {"Lettuce","Tomato","Cheese","Onions"};
		return toppings;
	}
	public double[] price()
	{
		double price[]= { 2.90,1.25,3.52,2.55};
		return price;
	}
}


