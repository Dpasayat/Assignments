//Q1. Write a Java code snippet that comprises a Car class and a CarTester class. The Car class 
//should define private fields for make and model, along with a parameterized constructor and 
//getter/setter methods for these attributes. In the CarTester class, instantiate two instances of 
//the Car class: myCar1 with a specified make and model, and myCar2 with null values. After 
//instantiation, the CarTester class should retrieve and print the initial make and model of both 
//cars. Then, it should set new values for myCar2 using setter methods and print the updated 
//make and model
 





public class myCarTester{
	public static void main(String []Args) {
		My_Car myCar1=new My_Car("Audi",1980);
		My_Car myCar2=new My_Car();
		System.out.println("_________________________________________");
		System.out.println(myCar1);
		System.out.println(myCar2);
		myCar2.setMake(2000);
		myCar2.setModel("Avanti");
		System.out.println("_________________________________________");
		System.out.println(myCar1+"\n"+myCar2);
		
		
	}
}




class My_Car
{
	private String model;
	private int make;
	
	My_Car()
	{
		make=0;
		model="";
		
	}
	
	My_Car(String model, int make) {
		super();
		this.model = model;
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMake() {
		return make;
	}
	public void setMake(int make) {
		this.make = make;
	}
	
	@Override
	public String toString()
	{
		return "make: "+make+". Model: "+model;
	}
	
	
	
}


