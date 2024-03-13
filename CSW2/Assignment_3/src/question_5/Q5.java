package question_5;

import java.util.*;

public class Q5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Library L1=new Library();
		Book b1= new Book("Algebra","Gilbert Strang",38);
		Book b2= new Book("DSA","Hemant Jain",40);
		Book b3= new Book("Algorithm","Eva Tardos",40);
		L1.add(b1);
		L1.add(b2);
		L1.add(b3);
		System.out.println("Books in Library are:");
		L1.printResource();
		
//		System.out.println(Objects.hash("Algebra"));
		System.out.println("Enter a book name to search: ");
		String book=sc.nextLine();
		System.out.println("Book present? : "+L1.isPresent(book));
		System.out.println(L1.remove(b2)+" removed");
		System.out.println("Updated resources: ");
		L1.printResource();
		sc.close();

	}

}


class Book
{
	private String name,author;
	private int quantity;
	
	Book()
	{
		super();
	}
	Book(String name,String author,int quantity)
	{
		this.name=name;
		this.author=author;
		this.quantity=quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "[ "+name +", "+  author + ", quantity: " + quantity+" ]" ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(name, other.name);
	}
	
}

class Library
{
	private HashMap<Integer,Book> resource=new HashMap<>();
	
	public void add(Book b)
	{
		
		this.resource.put(b.hashCode(), b);
	}
	public Book remove(Book b)
	{
		Integer key=b.hashCode();
		Book removed=this.resource.get(key);
		this.resource.remove(key);
		return removed;
	}
	public void printResource()
	{
		for(Map.Entry<Integer, Book> entry: resource.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}
	public boolean isPresent(String name)
	{
		Integer key=Objects.hash(name);
		return this.resource.containsKey(key);
		
	}
	
	
}