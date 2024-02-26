//Q4. Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class 
//defines private fields model and price, alongside setter methods for each attribute. 
//Additionally, it overrides the toString() method to return a string representation of the laptop's 
//model and price. In the Main class, create an instance of Laptop, setting its model using the 
//setter method. Then, print the laptop object using the toString() method. Describe the 
//functionality of the toString() method in the Laptop class and explain how it is utilized in the 
//Main class.


public class Question_4MainClass 
{

	public static void main(String[] args) 
	{
		Laptop L1=new Laptop("HP-bsx014",30000);
		System.out.println(L1);
		
//		toString method in Laptop class is inplemented such that it returns the model
//		and price of the laptop

	}

}

class Laptop
{
	private String model;
	private int price;
	
	Laptop(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	Laptop()
	{
		model="Test Bench";
		price=0;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", price=" + price + "]";
	}
	
	
}


