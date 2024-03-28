package stringMatchingAlgorithm;
import java.util.*;
public class RobinKarp 
{

	public static void main(String[] args) 
	{
		String s="abacbcaccbcabc";
		String p="cbc";
		notRKMatching(s,p);
	}
	//below is not robin karp
	public static void notRKMatching(String s,String p)
	{
		char sarr[]=s.toCharArray();
		char parr[]=p.toCharArray();
		int sIntArr[]=new int[s.length()];
		int pIntArr[]=new int[p.length()];
		int tnum=0;
		int pnum=0;
		HashMap<Character,Integer> code=new HashMap<>();
		int numcode=0;
		//encoding pattern
		int index=0;
		for(char ch:parr)
		{
			if(code.containsKey(ch))
			{
				pIntArr[index]=code.get(ch);
			}
			else
			{
				code.put(ch, ++numcode);
				pIntArr[index]=numcode;
			}
			index++;
		}
		//encoding string
		index=0;
		for(char ch:sarr)
		{
			if(code.containsKey(ch))
			{
				sIntArr[index]=code.get(ch);
			}
			else
			{
				code.put(ch, ++numcode);
				sIntArr[index]=numcode;
			}
			index++;
		}
		//matching algorithm
		for(int i=0;i<pIntArr.length;i++)
		{
			pnum=pnum*10+pIntArr[i];
			tnum=tnum*10+sIntArr[i];
		}
		for(int sh=0;sh<sIntArr.length-pIntArr.length;sh++)
		{
			System.out.println(pnum+" "+tnum);
			if(pnum==tnum)
				System.out.println(sh);
			tnum= (tnum-(sIntArr[sh]*(int) Math.pow(10, p.length()-1)))*10 +sIntArr[sh+1] ;
			
		}
		
	}

}
