
public class Document 
{
	protected String isbn;
	protected String publisher;
	protected int copies;
	
	public Document()
	{
		isbn = "NONE";
		publisher = "NONE";
		copies = 0;
	}
	public Document(String isbn, String publisher, int copies)
	{
		this.isbn = isbn;
		this.publisher = publisher;
		this.copies = copies;
	}
	
	public String get_isbn()
	{
		return isbn;
	}
	public String get_publisher()
	{
		return publisher;
	}
	public int get_copies()
	{
		return copies;
	}
	
	public void set_isbn(String value)
	{
		isbn = value;
	}
	public void set_publisher(String value)
	{
		publisher = value;
	}
	public void set_copies(int value)
	{
		copies = value;
	}
}
