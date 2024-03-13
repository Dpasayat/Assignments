package question_7;
import java.util.*;
public class Q7 
{

	public static void main(String[] args) 
	{
		TreeMap<String,Address> personMap=new TreeMap<>();
		personMap.put("Anand", new Address("A/1","Krish nagar","Chapra"));
		personMap.put("Dhiraj", new Address("C/15","Balijodi","Tangarpali"));
		// the below line does not create a new entry in the map, it just updates the value of the corresponding key
//		personMap.put("Dhiraj", new Address("C/14","Jalda","Sundargarh"));
		
		
		Set<?> set1=personMap.entrySet();
		Iterator<?> i=set1.iterator();
		while(i.hasNext())
		{
			Map.Entry<?,?> m1=(Map.Entry<?,?>)i.next();
			System.out.println(m1.getKey()+" => "+m1.getValue());
		}
		
		// below code also works!!!!
		
//		for(Map.Entry<String, Address> entry: personMap.entrySet())
//		{
//			System.out.println(entry.getKey()+" => "+entry.getValue());
//		}
		

	}

}

class Address
{
	private String plotNo,at,post;
	Address(){super();}

	Address(String plotNo, String at, String post) {
		super();
		this.plotNo = plotNo;
		this.at = at;
		this.post = post;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Address : " + plotNo + ", " + at + ", " + post + ".";
	}
	
	
	
}
