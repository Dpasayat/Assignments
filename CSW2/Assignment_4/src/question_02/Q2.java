package question_02;
import java.util.*;
public class Q2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String st=sc.next();
		try
		{
			if(st=="" || st==null)
				throw new NullPointerException();
			char[] charArray=st.toCharArray();
			System.out.println("Numbers preceded by vowels and consonants.");
			for(int i=0;i<charArray.length;i++)
			{
				if(Character.isDigit(charArray[i]))
				{
					boolean vowel=false;
					boolean consonant=false;
					for(int j=i-1;j>0 ;j--)
					{
						if(Character.isLetter(charArray[j]))
						{
							if(isVowel(charArray[j]))
								vowel=true;
							else
								consonant=true;
						}
						if(Character.isDigit(charArray[j]))
							break;
						
					}
					if(vowel && consonant)
						System.out.println(charArray[i]);
				}
			}
			
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}
		finally
		{
			sc.close();
		}

	}
	public static boolean isVowel(char ch)
	{
		Set<Character> vowels=new HashSet<>();
		vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o');vowels.add('u');
		return vowels.contains(ch);
	}

}
