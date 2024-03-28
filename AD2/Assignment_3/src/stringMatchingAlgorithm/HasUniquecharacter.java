package stringMatchingAlgorithm;
import java.util.*;
public class HasUniquecharacter {

	public static void main(String[] args) 
	{
		String s="apple";
		System.out.println(isUnique(s));
		s="aple";
		System.out.println(isUnique(s));
		

	}
	public static boolean isUnique(String s)
	{
		Set<Character> st=new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(st.contains(s.charAt(i)))
			{
				return false;
			}
			else
			{
				st.add(s.charAt(i));
			}
			
		}
		return true;
		
	}

}
