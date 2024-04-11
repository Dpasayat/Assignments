import java.util.*;


public class StringIndexingUsingBST 
{

	public static void main(String[] args) 
	{
		String[] st= {"aba","cd","aba","aa","cd","cd","aba","aa","aba","cd","aa"};
		BST b=new BST();
		b.create_BST(st);
		b.inorder(b.root);
		System.out.println("---------------------------------------------------------");
		String[] st2= {"aa","bb","cc","dd","ee","abc","aa","cc","dd","ee","abc","bb","abc","dd","iat","track","track"};
		BST b2=new BST();
		b2.create_BST(st2);
		b2.inorder(b2.root);
		System.out.println("---------------------------------------------------------");
	}

}

class BST
{
	class node
	{
		
		node left;
		node right;
		String str;
		ArrayList<Integer> pos=new ArrayList<>();
		
		node(String str,int idx)
		{
			this.str=str;
			this.pos.add(idx);
			left=right=null;
		}	
		
	}
	public node root=null;
	
	public void create_BST(String[] A)
	{
		root = new node(A[0],0);
		
		for(int i=1; i<A.length; i++ )
		{
			insert(root,A[i],i);
		}
		
	}
	
	public void insert(node temp, String k,int idx )
	{
		
		
		while(true) 
		{
			int res=temp.str.compareTo(k);
			
			if(res==0)
			{
				temp.pos.add(idx);
				return;
			}
			
			else if(res<0)
			{
				if(temp.right != null)
				{
					temp=temp.right;
				}
				else
				{
					node t=new node(k,idx);
					temp.right=t;
					return;
				}
			}
			else
			{
				if(temp.left != null)
				{
					temp=temp.left;
				}
				else
				{
					node t=new node(k,idx);
					temp.left=t;
					return;
				}
					
			}
		}
	}
	
	public void inorder(node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.str+": "+root.pos.toString()+"\n");
			inorder(root.right);
		}
	}
	
}
