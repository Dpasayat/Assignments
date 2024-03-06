package question_3;

import java.util.Objects;

public class Q3 
{

	public static void main(String[] args) 
	{
		Car c1=new Car("chev","Red",22.8);
		Car c2=new Car("avanti","Blue",21.9);
		if(c1.compareTo(c2)==1)
			System.out.println(c1);
		else if(c1.compareTo(c2)==-1)
			System.out.println(c2);
		else
			System.out.println(c1+"\n"+c2);
		

	}

}


class Car implements Comparable<Car>
{
	private String model,color;
	private double speed;
	
	public Car() 
	{
		super();
	}

	Car(String model, String color, double speed) 
	{
		super();
		this.model = model;
		this.color = color;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && Objects.equals(model, other.model)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	@Override
	public int compareTo(Car o) 
	{
		
		if(this.equals(o))
			return 0;
		else
		{
			if(this.getSpeed() ==  o.getSpeed())
				return 0;
			else if(this.getSpeed() <  o.getSpeed())
				return -1;
			else 
				return 1;
		}
	}

	
	
	
	
}
