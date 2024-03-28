package stringMatchingAlgorithm;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar 
{

	public static void main(String[] args) 
	{
		String s="apple";
		System.out.println(Unique(s));
		s="ggfsgfdhftiygjhfdr";
		System.out.println(Unique(s));
		

	}
	public static String Unique(String s)
	{
		Set<Character> st=new HashSet<>();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			if(st.contains(s.charAt(i)))
			{
				continue;
			}
			else
			{
				st.add(s.charAt(i));
				result+=s.charAt(i);
			}
			
		}
		return result;
		
	}
}
