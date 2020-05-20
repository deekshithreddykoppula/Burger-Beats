package sdt;
import java.util.*;
public class Baseburger
{
    public static void main(String[] args)
	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("                 ***BURGER BEATS***");
    	System.out.println("--------------------------------------------------------");
		String Baseburger[]= {"Hamburger","Healthy Burger","Deluxe Burger"};
		List<String> Tlist=new ArrayList<>();
		List<Double>TPrice=new ArrayList<>();
		double Bprice[]= {5.0,8.25,14.25};
		double Mprice[]= {0,0,0,0};
		String Breadtype[]= {"White Roll","Brown Roll","French Torpedo Roll"};
		String  Meattype[]= {"Chuck","Dry-Aged Beef","Short Rib","sirloin,"};
		char ab=0;
		do
		{
		Tlist.clear();
		TPrice.clear();
		menu(Baseburger,3,Bprice);
		System.out.println("4  Exit");
		int choice=sc.nextInt();
		if(choice<4 && choice>0)
		{
		   menu(Breadtype,3,Mprice);
		   int bread=sc.nextInt();
		   menu(Meattype,4,Mprice);
	       int meat=sc.nextInt();
		   if(choice==1)
		   {
			  Hamburger obj=new Hamburger(Breadtype[bread-1],Meattype[meat-1],5);
			  String toppings[]=obj.toppings();
			  double price[]=obj.price();
			  char ch;
				System.out.println("Do u want to add toppings  y/n");
				ch=sc.next().charAt(0);
				while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N') 
				{
					System.out.println("Invalid input");
					System.out.println("Do u want to add toppings  y/n");
					ch=sc.next().charAt(0);
				}
				while(ch=='Y'||ch=='y') 
				{
					menu(toppings,4,price);
					int t=sc.nextInt();
					Tlist.add(toppings[t-1]);
					TPrice.add(price[t-1]);
					System.out.println("Do u want to add  toppings  y/n");
				    ch=sc.next().charAt(0);
					while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N') 
					{
						System.out.println("Invalid input");
						System.out.println("Do u want to add toppings  y/n");
						ch=sc.next().charAt(0);
					}
				}
			    obj.total(Tlist, TPrice);
			}
		    if(choice==2)
		    {
			   Healthyburger obj=new Healthyburger(Breadtype[bread-1],Meattype[meat-1],7.25);
			   String toppings[]=obj.toppings();
			   double price[]=obj.price();
			   System.out.println("Do u want to add  toppings  y/n");
			   char ch=sc.next().charAt(0);
			   while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N')
			   {
					System.out.println("Invalid input");
					System.out.println("Do u want to add toppings  y/n");
					ch=sc.next().charAt(0);
			   }
			        while(ch=='Y'||ch=='y') 
			        {
					   menu(toppings,6,price);
				    	int t=sc.nextInt();
					    Tlist.add(toppings[t-1]);
					    TPrice.add(price[t-1]);
					    System.out.println("Do u want to add  toppings  y/n");
					    ch=sc.next().charAt(0);
						  while(ch!='y'&&ch!='Y'&&ch!='n'&&ch!='N')
						  {
								System.out.println("Invalid input");
								System.out.println("Do u want to add toppings  y/n");
								ch=sc.next().charAt(0);
						  }
			        }
		            obj.total(Tlist, TPrice);
		     }
             if(choice==3)
             {
	            Tlist.add("Chips");
	            Tlist.add("Drink");
	            TPrice.add(2.75);
	            TPrice.add(1.50);
	            Deluxeburger obj=new Deluxeburger(Breadtype[bread-1],Meattype[meat-1],14.25);
	            obj.total(Tlist, TPrice);
             }
	     }
         if(choice==4)
         {
	        System.out.println("THANK YOU..VISIT AGAIN");
	        break;
         }
         System.out.println("Do you want another burger y/n?:");
         ab=sc.next().charAt(0);
	     while(ab!='y'&&ab!='Y'&&ab!='n'&&ab!='N')
	     {
				System.out.println("Invalid input");
				System.out.println("Do u want another burger  y/n?");
				ab=sc.next().charAt(0);
	     }
      }
      while(ab=='Y'||ab=='y'); 
	  if(ab=='N'||ab=='n')
	     System.out.println("THANK YOU..VISIT AGAIN");
  }
  public static void menu(String[] a,int b,double[] c) 
  {
    	for (int i=0;i<b;i++) 
		System .out.println(i+1 + "  " +a[i] +"  "+ c[i]+"$");
  }
}
