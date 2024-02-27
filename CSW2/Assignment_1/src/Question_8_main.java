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



public class Question_8_main 
{

	public static void main(String[] args) 
	{
		Car2 cr=new Car2();
		cr.accelerate();
		cr.accelerate(2.2);
		cr.accelerate(5.0f);
		cr.brake();
		Bicycle bc=new Bicycle();
		bc.accelerate();
		bc.accelerate(0.2d);
		bc.accelerate(5.0f);
		bc.brake();

	}

}

interface Vehicle
{
	void accelerate();
	void brake();
}

class Car2 implements Vehicle
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