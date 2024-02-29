
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
	

	
	public void delete(int key)
	{
		node temp=root;
		node parent=null;
		while(temp!=null) 
		{
			if(temp.info==key) 
			{
				checkCase(parent,temp);
				break;
			}
			else
			{
				if( key > temp.info)
				{
					parent=temp;
					temp=temp.right;
				}
				else
				{
					parent=temp;
					temp=temp.left;
				}
			}
		}
		inorder(root);
		
	}
	public void checkCase(node parent,node temp)
	{
		node deletedNode=null;
		if(temp.left==null && temp.right==null)
		{
			deletedNode=delLeafNode(parent,temp);
		}
		else if((temp.left==null && temp.right!=null) || (temp.left!=null && temp.right==null))
		{
			deletedNode=delNodeWith1child(parent,temp);
		}
		System.out.println("\n"+deletedNode.info+" Deleted.");
		return;
		
	}
	public node delLeafNode(node parent,node temp)
	{
		if(parent.right==temp)
		{
			parent.right=null;
		}
		else
		{
			parent.left=null;
		}
		return temp;
	}
	public node delNodeWith1child(node parent,node temp)
	{
		if(parent.left==temp)
		{
			if(temp.left!=null)
			{
				parent.left=temp.left;
				temp.left=null;
			}else 
			{
				parent.left=temp.right;
				temp.right=null;
			}
		}else {
			if(temp.left!=null)
			{
				parent.right=temp.left;
				temp.left=null;
			}else 
			{
				parent.right=temp.right;
				temp.right=null;
			}
		}
		return temp;
	}
	public node inorderSuccessor(node temp)
	{
		if(root != null)
		{
			inorder(root.left);
			if(root.info>temp.info)
			{
				return temp;
			}
			inorder(root.right);
		}
		return temp;
	}
	
	


}
