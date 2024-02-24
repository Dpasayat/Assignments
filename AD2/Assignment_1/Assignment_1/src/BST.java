
public class BST 
{
	private static node root;
	class node
	{
		int info;
		node left;
		node right;
		
		node()
		{
			info=0;
			left=null;
			right=null;
		}
		node(int info)
		{
			this.info=info;
			left=null;
			right=null;
		}
		
	}
	
	public static node getRoot()
	{
		return root;
	}
	
	public void create_BST(int[] A)
	{
		root = new node(A[0]);
		
		for(int i=1; i<A.length; i++ )
		{
			insert(root,A[i]);
		}
		
	}
	
	public void insert(node temp, int k)
	{
		node t=new node(k);
		
		while(true) {
			if(k>temp.info)
			{
				if(temp.right != null)
				{
					temp=temp.right;
				}
				else
				{
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
			System.out.print(root.info+" ");
			inorder(root.right);
		}
	}
	
	public void preorder(node root)
	{
		if(root != null)
		{
			System.out.print(root.info+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(node root)
	{
		if(root != null)
		{
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.info+" "); 
		}
	}
	
	


}
