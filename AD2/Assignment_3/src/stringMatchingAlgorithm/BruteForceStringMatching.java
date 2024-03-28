package stringMatchingAlgorithm;

public class BruteForceStringMatching 
{

	public static void main(String[] args) 
	{
		String s="abcaabcaabcba";
		String p="abc";
		bFStringMatching(s,p);
		s="aaaaaaaa";
		p="aaaa";
		System.out.println();
		bFStringMatching(s,p);
		

	}
	
	public static void bFStringMatching(String s,String p)
	{
		boolean flag=true;
		for(int i=0;i< s.length()-p.length();i++)
		{
			for(int j=0;j<p.length();j++)
			{
				if(s.charAt(i+j)!= p.charAt(j))
				{
					
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.print(i+" ");
			}
			flag=true;
		}
	}

}
