
public class Bank_Account
{
	private String name,acc;
	private float bal;
	
	Bank_Account()
	{
		name="Jhon Doe";
		acc="000000000";
		bal=0.0f;
	}
	Bank_Account(String name, String acc, float bal)
	{
		this.name=name;
		this.acc=acc;
		this.bal=bal;
	}
	
	public Object address()
	{
		return super.toString();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcc() {
		return acc;
	}
	public void setAcc(String acc) {
		this.acc = acc;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	
	@Override 
	public String toString()
	{
		return "\n------------------------------\nName: " + getName()+"\nAccount no.: "+ getAcc()+"\nBalance: "+ getBal()+"\n-------------------------------\n";
	}
	@Override
	public boolean equals(Object o)
	{
		if( o instanceof Bank_Account)
		{
			Bank_Account ob=(Bank_Account)o;
			if(this.acc.equalsIgnoreCase(ob.acc) && this.name.equalsIgnoreCase(ob.name))
				return true;
			else 
				return false;

		}
		else return false;
	}
}