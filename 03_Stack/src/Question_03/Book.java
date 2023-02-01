package Question_03;

public class Book 
{
	int bookid;
	String title;
	double price;
	
	public Book() 
	{
		bookid = 0000;
		title = "NA";
		price = 00.00;
	}
	public Book(int bookid, String title, double price) 
	{
		this.bookid = bookid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", price=" + price + "]";
	}
	
	public void display()
	{
		System.out.println("Book Id = "+bookid+"Book Title = "+title);
		System.out.println("Original Price of Book = "+price);
	}

}
