//Q2. Write a program to create a Book class with member variables bookId,
//bookName, and price. Add the respective method and constructor to it.
//Create a driver class in that class and create two book objects. Compare
//the book objects according to their price. Print the details of the book
//objects.
//Note: Overload toString and equals method.



package Question_2;

public class Book 
{
	private String bookId,bookName;
	private float price;
	
	
	public Book() 
	{
		super();
	}
	public Book(String bookId, String bookName, float price) 
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
