//Q2. Design a Java class called Rectangle with private attributes length and width. Include a 
//constructor to initialize these attributes, as well as setter and getter methods for each attribute. 
//Additionally, implement methods to calculate the area and perimeter of the rectangle. Write a 
//main method to create an object of the Rectangle class, set values for its attributes, and display 
//the area and perimeter.



public class Question_2 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(2,3);
		System.out.println("Area: "+r1.area()+"\nPerimeter: "+r1.perimeter());

	}

}


class Rectangle
{
	private float l,w;
	
	Rectangle()
	{
		l=0.0f;
		w=0.0f;
	}

	Rectangle(float l, float w) {
		super();
		this.l = l;
		this.w = w;
	}

	public float getL() {
		return l;
	}

	public void setL(float l) {
		this.l = l;
	}

	public float getW() {
		return w;
	}

	public void setW(float w) {
		this.w = w;
	}
	
	public float area()
	{
		return l*w;
	}
	public float perimeter()
	{
		return 2*(l+w);
	}
	
}

