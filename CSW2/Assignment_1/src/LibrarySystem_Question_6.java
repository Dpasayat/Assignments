//Q6. Library System Assignment:
//Task: Develop a Java program for a library system incorporating encapsulation, abstraction, 
//and inheritance.
//i. LibraryResource Class:
// - Abstract class with private attributes for title and author.
// - Constructor, getters, setters, and an abstract method displayDetails().
//ii. Book Class:
// - Subclass of LibraryResource with additional attribute pageCount.
// - Constructor, getters, setters, and displayDetails() method override.
//iii. Magazine Class:
// - Subclass of LibraryResource with additional attribute issueDate.
// - Constructor, getters, setters, and displayDetails() method override.
//iv. DVD Class:
// - Subclass of LibraryResource with additional attribute duration.
// - Constructor, getters, setters, and displayDetails() method override.
//v. LibrarySystem Class (Main):
// - Instantiate various library resources (e.g., Book, Magazine, DVD).
// - Call displayDetails() for each instance to show resource information.


public class LibrarySystem_Question_6 
{

	public static void main(String[] args) 
	{
		LibraryResource b1=new Book("DSA","Hemant",1095);
		LibraryResource m=new Magazine("Learn DSA fast","Neetcode","19/02/2007"); 
		LibraryResource d=new DVD("Full Stack Web-Development","XYZ","16:14:36");
		System.out.println("Book:");
		b1.diaplayDetails();
		System.out.println("\nMagazine:");
		m.diaplayDetails();
		System.out.println("\nDVD:");
		d.diaplayDetails();
		

	}

}

abstract class LibraryResource
{
	private String title,author;

	public LibraryResource(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	abstract void diaplayDetails();
}
class Book extends LibraryResource
{
	private int pagecount;

	public Book(String title, String author,int pagecount) 
	{
		super(title, author);
		this.pagecount=pagecount;
		
	}

	public int getPagecount() {
		return pagecount;
	}

	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	
	@Override
	void diaplayDetails() 
	{
		System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPage: "+getPagecount());
		
		
	}
	
}
class Magazine extends LibraryResource
{
	private String issueDate;

	public Magazine(String title, String author,String issueDate) 
	{
		super(title, author);
		this.issueDate=issueDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	@Override
	void diaplayDetails() 
	{
		System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nIssue Date: "+getIssueDate());
		
	}
	
	
}
class DVD extends LibraryResource
{
	private String duration;

	public DVD(String title, String author,String duration) 
	{
		super(title, author);
		this.duration=duration;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	void diaplayDetails() 
	{
		System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nDuration: "+getDuration());
		
	}
	
	
	
}
