package Exam;

import java.util.Scanner;

class Vehical
{
	float mileage;
	int price;
	
	public Vehical(float mileage,int price)
	{
		this.mileage=mileage;
		this.price=price;
	}

	public float getMileage() {
		return mileage;
	}

	public int getPrice() {
		return price;
	}
	
	public void Display()
	{
	    System.out.println("mileage : "+mileage);
	    System.out.println("price : "+price);
	}

	
	
}
class Car extends Vehical
{
	int owershipcost;
    int warranty;
    int seatingcap;
    String fueltype;
    
     public Car(float mileage, int price,int owershipcost,int warranty,int seatingcap,String fueltype) {
		super(mileage, price);
		this.owershipcost=owershipcost;
		this.warranty=warranty;
		this.seatingcap=seatingcap;
		this.fueltype=fueltype;
	
	}

	public int getOwershipcost() {
		return owershipcost;
	}

	public int getWarranty() {
		return warranty;
	}

	
	public int getSeatingcap() {
		return seatingcap;
	}

	public String getFueltype() {
		return fueltype;
	}

	public void Display()
	{
		super.Display();
		System.out.println("owernshipcost : "+owershipcost);
		System.out.println("warranty : "+warranty);
		System.out.println("seatingcap : "+seatingcap);
		System.out.println("fueltype : "+fueltype);
	}
       
}
class Bike extends Vehical
{
	int numbercylinder;
    int noofgears;
    String coolingtype;
    String weeltype;
    float fueltanksize; 
	
	
	public Bike(float mileage, int price,int numbercylinder,int noofgears,String coolingtype,String weeltype,float fueltanksize) {
		
		super(mileage, price);
		
		
		this.numbercylinder= numbercylinder;
	    this.noofgears=noofgears;
	    this.coolingtype= coolingtype;
	    this.weeltype=weeltype;
	    this.fueltanksize=fueltanksize; 
		
	}
	public int getNumbercylinder() {
		return numbercylinder;
	}
	
	public int getNoofgears() {
		return noofgears;
	}
	
	public String getCoolingtype() {
		return coolingtype;
	}
	
	public String getWeeltype() {
		return weeltype;
	}
	
	public float getFueltanksize() {
		return fueltanksize;
	}
	
	public void Display()
	{
		super.Display();
		System.out.println("numbercylinder : "+numbercylinder);
		System.out.println("noofgears : "+noofgears);
		System.out.println("coolingtype : "+coolingtype);
		System.out.println("weeltype : "+weeltype);
		System.out.println("fueltanksize : "+fueltanksize);
	}
	
}

class Audi extends Car
{
	String modeltype;
	
	public Audi(float mileage,int price,int owershipcost,int warranty,int seatingcap,String fueltype,String modeltype)
	{
		super(mileage, price,owershipcost,warranty,seatingcap,fueltype);
		
		this.modeltype=modeltype;
	}
	public void Display()
	{
		super.Display();
		System.out.println("modeltype : "+modeltype);
		
		}
	public String modeltype() {
		return modeltype;
	}
	
}  
class Ford extends Car
{
String modeltype;
	
	public Ford(float mileage,int price,int owershipcost,int warranty,int seatingcap,String fueltype,String modeltype)
	{
		super(mileage, price,owershipcost,warranty,seatingcap,fueltype);
		
		this.modeltype=modeltype;
	}
	public void Display()
	{
		super.Display();
		System.out.println("modeltype: "+modeltype);
		
		}
	public String modeltype() {
		return modeltype;
	}
	
}


class TVS extends Bike
{
	String modeltype;
	public TVS(float mileage, int price, int numbercylinder, int noofgears, String coolingtype, String weeltype,
			float fueltanksize,String modeltype) {
		super(mileage, price, numbercylinder, noofgears, coolingtype, weeltype, fueltanksize);
		this.modeltype=modeltype;
	}
	public void Display()
	{
		super.Display();
		System.out.println("modeltype: "+modeltype);
		
		}
	public String modeltype() {
		return modeltype;
	}
		
}
class Bajaj extends Bike
{
	String modeltype;
	public Bajaj(float mileage, int price, int numbercylinder, int noofgears, String coolingtype, String weeltype,
			float fueltanksize,String modeltype) 
	{
		super(mileage, price, numbercylinder, noofgears, coolingtype, weeltype, fueltanksize);
		this.modeltype=modeltype;
	}
	public void Display()
	{
		super.Display();
		System.out.println("modeltype : "+modeltype);
		
		}
	public String modeltype() {
		return modeltype;
	}
	
}

public class vehimain{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float mileage=sc.nextFloat(); 
		int price=sc.nextInt();
		int numbercylinder=sc.nextInt(); 
		int noofgears=sc.nextInt(); 
		String coolingtype=sc.next(); 
		String weeltype=sc.next();
		float fueltanksize=sc.nextFloat();
		String modeltype=sc.next();
		
		Bajaj b1=new Bajaj(mileage, price, numbercylinder, noofgears, coolingtype, weeltype, fueltanksize,modeltype);
		b1.Display();
		
		
		
		
		
		
		/*
		Audi a1=new Audi(10,100000,5000000,10,5,"Petrol","A8");
		a1.Display();
		System.out.println();
		Ford f1=new Ford(5,750000,25000000,12,4,"Disel","A40");
		f1.Display();
		System.out.println();
		TVS t1=new TVS(75,51000,4,5,"Air","Spoke",13.5f,"Heavy-Duty-Scooter");
		t1.Display();
        System.out.println();
		Bajaj b1=new Bajaj(80,95000,6,6,"oil","Alloy",15.0f,"Pulser220");
		b1.Display();
		*/
	}
}