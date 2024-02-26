//Q7. Consider a scenario where you are tasked with developing a simple banking application 
//using Java, employing the concept of polymorphism. Your application should consist of three 
//classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the 
//base class with private attributes for account number and balance, along with abstract methods 
//for deposit and withdrawal. The SavingsAccount class, a subclass of Account, should include 
//an additional attribute for interest rate and override the deposit method to calculate interest, as 
//well as override the withdrawal method to ensure a sufficient balance. Similarly, the 
//CurrentAccount class, also a subclass of Account, should incorporate an overdraft limit 
//attribute and override the withdrawal method to check the overdraft limit. Implement the 
//classes as described, ensuring proper encapsulation and abstraction. Finally, create a 
//BankingApplication class (Main) to demonstrate the polymorphic behavior by creating 
//instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal 
//operations, and displaying account details.


public class BankingApplication_Question_7 
{

	public static void main(String[] args) 
	{
		

	}

}

abstract class Account
{
	private int accno;
	private float bal;
	
	abstract public void deposit();
	abstract public void withdrawal();
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	
}

class SavingsAccount extends Account
{
	private static final float ir=2.5f;

	@Override
	public void deposit() 
	{
		setBal(getBal()+ir*getBal());
		
	}

	@Override
	public void withdrawal() 
	{
		
		
	}
	
}
