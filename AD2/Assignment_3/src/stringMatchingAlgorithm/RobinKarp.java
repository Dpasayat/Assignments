package stringMatchingAlgorithm;
import java.util.*;
//below is code for RabinKarp Matching without using the modular logic
public class RobinKarp 
{

	public static void main(String[] args) 
	{
		String s="abacbcaccbcabc";
		String p="cbc";
		notRKMatching(s,p);
		notRKMatching("abcaabccabcba","abc");
		notRKMatching("aaaaaaa","aaa");
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
//		System.out.println(code);
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
//		System.out.println(code);
//		System.out.println(Arrays.toString(sIntArr)+"\n"+Arrays.toString(pIntArr));
		//matching algorithm
		for(int i=0;i<pIntArr.length;i++)
		{
			pnum=pnum*10+pIntArr[i];
			tnum=tnum*10+sIntArr[i];
		}
		int h=1; int d=10;
		for (int i = 0; i < p.length() - 1; i++)
            h = (h * d);
		for(int sh=0;sh<sIntArr.length-pIntArr.length;sh++)
		{
//			System.out.println(pnum+" "+tnum);
			if(pnum==tnum)
				System.out.print(sh+" ");
			tnum= (tnum-(sIntArr[sh]*h))*10 +sIntArr[sh+p.length()] ;
//			System.out.println("tnum="+tnum);
			
		}
		System.out.println();
	}

}
