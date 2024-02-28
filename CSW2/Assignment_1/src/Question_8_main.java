//Q8. Write a Java program that illustrates the concepts of interfaces, method overriding, and 
//method overloading. Begin by defining an interface named Vehicle with two abstract methods: 
//accelerate() and brake(). Then, create two classes, Car and Bicycle, both of which implement 
//the Vehicle interface. In the Car class, override the accelerate() and brake() methods to print 
//appropriate messages indicating the acceleration and braking actions for a car. Similarly, in the 
//Bicycle class, override the same methods to display messages specific to a bicycle's 
//acceleration and braking. Additionally, implement method overloading in both classes by 
//providing multiple versions of the accelerate() method, each accepting different parameters 
//such as speed and duration. Finally, create a Main class to instantiate objects of both Car and 
//Bicycle classes, test their overridden methods, and demonstrate method overloading by 
//invoking different versions of the accelerate() method.

//The Question was modified to add an Owner class and implement the vehicle through it.

import java.util.Scanner;

public class Question_8_main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Owner p1=new Owner();
		System.out.println("Set your Owner' name, date of birth");
		p1.setName(sc.nextLine());
		p1.setDob(sc.next());
		System.out.println("Enter 1 if Owner has a car, 2 for bicycle, anything else for no vehicle");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			Vehicle v=new CAR();
			p1.setV(v);
			System.out.println("Enter Licence number: ");
			p1.setLicence(sc.nextLine());
			break;
		case 2:
			Vehicle v2=new Bicycle();
			System.out.println("Enter Licence number: ");
			p1.setLicence(sc.nextLine());
			p1.setV(v2);
			break;
		default:
			break;
			
		}
		System.out.println(p1);
		if(ch==1)
		{
			System.out.println("Owner has a car.");
		}
		else if(ch==2)
		{
			System.out.println("Owner has a bicycle");
		}
		else
		{
			System.out.println("Owner does not have a vehicle.");
		}
		if(p1.v != null)
		{
			p1.go(54);
			p1.accelerate();
			p1.accelerate(54.67d);
			p1.accelerate(23.5f);
			p1.brake();
			p1.stop();
			
		}
		else
		{
			System.out.println("Owner walks.");
		}
		sc.close();

	}

}

class Owner 
{
	String name;
	String dob;
	String licence;
	Vehicle v;
	Owner()
	{
		name="Jhon Doe";
		dob="12/12/1990";
		licence="00000000000";
		v=null;
	}
	public Owner(String name, String dob, String licence, Vehicle v) 
	{
		this.name = name;
		this.dob = dob;
		this.licence = licence;
		this.v = v;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + ", dob=" + dob + ", licence=" + licence + "]";
	}
	
	public void go(int distance)
	{
		if(this.v instanceof CAR)
		{
			System.out.println("Owner drives the car for "+distance+" Kilometers");
		}
		else if(this.v instanceof Bicycle)
		{
			System.out.println("Owner peddles Bicycle for "+distance+" Kilometers");
		}
		else
		{
			System.out.println("Owner walks for "+distance+" Kilometers");
		}
	}
	public void accelerate()
	{
		this.v.accelerate();
	}
	public void accelerate(float f)
	{
		this.v.accelerate(f);
	}
	public void accelerate(double d)
	{
		this.v.accelerate(d);
	}
	public void brake()
	{
		this.v.brake();
	}
	public void stop()
	{
		if(this.v instanceof CAR)
		{
			System.out.println("Owner stops the car ");
		}
		else if(this.v instanceof Bicycle)
		{
			System.out.println("Owner stops the Bicycle");
		}
		else
		{
			System.out.println("Owner stops Walking. ");
		}
	}
	
	
	
}

interface Vehicle
{
	void accelerate();
	void accelerate(float duration);
	void accelerate(double speed);
	void brake();
}

class CAR implements Vehicle
{

	@Override
	public void accelerate() 
	{
		System.out.println("Car accelerated...it went vroooommmmm!!!!!");
		
	}
	public void accelerate(double speed)
	{
		System.out.println("Car accelerated with an additional speed of "+speed+" m/s");
	}
	public void accelerate(float duration)
	{
		System.out.println("Car accelerated for a duration of "+duration+" minutes");
	}

	@Override
	public void brake() 
	{
		System.out.println("Car pressed on the brakes.");
		
	}
	
	
}
class Bicycle implements Vehicle
{

	@Override
	public void accelerate() 
	{
		System.out.println("Bicycle accelerated...it went tring tring!!!!!");
		
	}
	public void accelerate(double speed)
	{
		System.out.println("Bicycle accelerated with an additional speed of "+speed+" m/s");
	}
	public void accelerate(float duration)
	{
		System.out.println("Bicycle accelerated for a duration of "+duration+" minutes");
	}

	@Override
	public void brake() 
	{
		System.out.println("Bicycle pressed on the brakes and came to a halt.");
		
	}
	
}