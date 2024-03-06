package Question_2;

public class Q2 
{
	public static void main(String[] args) 
	{
		Book b1=new Book("cl82242","Problem Solving in java",1500.0f);
		Book b2=new Book("cl82267","Full Stack Web Development",1700.0f);
		
		System.out.println("Books are: \nB1:"+b1+"\nB2:"+b2);
		
		System.out.println("Are books (B1,B2) same price ? : "+b1.equals(b2));
		Book b3=new Book("cl82267","Algorithms",1700.0f);
		System.out.println("B3:"+b3);
		System.out.println("Are books (B2,B3) same price ? : "+b2.equals(b3));

	}

}


class Book
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
	public void setPrice(float price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Id=" + bookId + ", Name=" + bookName + ", price=" + price + "]";
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
		return Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}
		

}

