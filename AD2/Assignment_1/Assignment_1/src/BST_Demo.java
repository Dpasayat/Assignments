
public class BST_Demo {

	public static void main(String[] args) 
	{
		int A[]= {15,27,6,82,18,4,9,65};
		BST ob = new BST();
		ob.create_BST(A);
		System.out.println("Inorder:");
		ob.inorder(BST.getRoot());
		System.out.println("\nPostorder");
		ob.postorder(BST.getRoot());
		System.out.println("\nPreorder");
		ob.preorder(BST.getRoot());
//		ob.delete(4);
//		ob.delete(6);
		System.out.println("\n"+ob.inorderSuccessor(ob.getRoot()).info);

	}

}
