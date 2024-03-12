package question_5;

import java.util.*;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		return name +  author + ", quantity: " + quantity + "\n";
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
	private HashMap<Integer,Book> resouce=new HashMap<>();
	static int count=0;
	public void add(Book b)
	{
		count++;
		this.resouce.put(count, b);
	}
	public void remove(Book b)
	{
		
	}
	
}