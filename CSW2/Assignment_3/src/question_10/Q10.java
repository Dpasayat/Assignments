package question_10;
import java.util.*;
public class Q10 
{

	public static void main(String[] args) 
	{
		Hashtable<Character,Integer> htable=new Hashtable<>();
		String s="sakfhoifwegnshgfaisfraewokfnasoigoifkhgoigfofhogafgogagjgiis";
		System.out.println("String: "+s);
		for(int i=0;i<s.length();i++)
		{
			Character c=Character.toLowerCase(s.charAt(i));
			if(htable.containsKey(c))
			{
				Integer val=htable.get(c);
				val+=1;
				htable.put(c, val);
			}
			else
			{
				htable.put(c, 1);
			}
		}
		
		Set<Character> charset=htable.keySet();
		Iterator<Character> itr=charset.iterator();
		char maxOccur=s.charAt(0);
		System.out.println("frequency: ");
		
		while(itr.hasNext())
		{
			Character key=itr.next();
			System.out.println(key+": "+htable.get(key));
			
			if(htable.get(key)>htable.get(maxOccur))
				maxOccur=key;
		}
		System.out.println("Max occurring element: "+maxOccur+": "+htable.get(maxOccur));

	}

}
