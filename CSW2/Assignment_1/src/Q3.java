//Q3. Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a 
//parameterized constructor to initialize these attributes. Implement a copy constructor to 
//create a new point object with the same attribute values. Ensure that modifications made to one 
//object do not affect the other. Utilize getter and setter methods to retrieve and update the 
//attribute values.


public class Q3 
{

	public static void main(String[] args) 
	{
		Point p1=new Point(3.2f, 2.2f);
		Point p2=new Point(p1);
		System.out.println("First point: "+p1);
		System.out.println("Second point: "+p2);
	}

}

class Point{
	private float x,y;
	Point(float x,float y){
		this.x=x;
		this.y=y;
		
	}
	Point(Point old){
		this.x=old.x;
		this.y=old.y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}