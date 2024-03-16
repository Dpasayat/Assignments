package question_8;
import java.util.*;
public class Q8 
{

	public static void main(String[] args) 
	{
		String s1="College";
		String s2="gellco";
		HashMap<Character,Integer> h1=new HashMap<>();
		HashMap<Character,Integer> h2=new HashMap<>();
		for(Character c:s1.toCharArray())
		{
			if(!h1.containsKey(c))
			{
				h1.put(Character.toLowerCase(c), 1);
			}
			else
			{
				Integer val=h1.get(c);
				val+=1;
				h1.put(Character.toLowerCase(c),val);
			}
		}
		for(Character c:s2.toCharArray())
		{
			if(!h2.containsKey(c))
			{
				h2.put(Character.toLowerCase(c), 1);
			}
			else
			{
				Integer val=h2.get(c);
				val+=1;
				h2.put(Character.toLowerCase(c),val);
			}
		}
		if(h1.equals(h2))
		System.out.println("anagram");
		else
			System.out.println("not anagram");

	}

}
