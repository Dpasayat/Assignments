
public class Q1 
{

	public static void main(String[] args) 
	{
		double a = 9.6; double b = 3.4;
		new calculator('+',a,b);
		new calculator('-',a,b);
		new calculator('*',a,b);
		new calculator('/',a,b);
		
		

	}

}
class calculator extends Thread
{
	char op; double a,b;
	calculator(char op,double a, double b)
	{
		this.op=op;
		this.a=a;
		this.b=b;
		Thread t1 = new Thread(this); 
		t1.start();
	}
	public void run()
	{
		switch(op)
		{
		case '+':
			System.out.println("Addition: "+(a+b));
			break;
		case '-':
			System.out.println("Substraction: "+(a-b));
			break;
		case '*':
			System.out.println("Multiplication: "+(a*b));
			break;
		case '/':
			System.out.println("Division: "+(a/b));
			break;
		default:
			System.out.println("Error");
		}
	}
}
