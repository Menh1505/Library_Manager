
public class Book extends Document
{
	private String author;
	private int pages;
	
	public Book(String isbn, String publisher, int copies, String author, int pages)
	{
		super(isbn, publisher, copies);
		this.author = author;
		this.pages = pages;
	}
	
	public String get_author()
	{
		return author;
	}
	public int get_pages()
	{
		return pages;
	}
	
	public void set_author(String value)
	{
		author = value;
	}
	public void set_pages(int value)
	{
		pages = value;
	}
	
	@Override
	public String toString()
	{
		return 
				"Book - " + "isbn: " + isbn 
				+ " - publisher: " + publisher 
				+ " - copies: " + copies 
				+ " - author: " + author 
				+ " - pages: " + pages;
	}
}
