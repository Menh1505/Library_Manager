
public class News extends Document
{
	private Date date = new Date();
	
	public News(String isbn, String publisher, int copies, int day, int month, int year)
	{
		super(isbn, publisher, copies);
		date.set_day(day);
		date.set_month(month);
		date.set_year(year);
	}
	
	@Override
	public String toString()
	{
		return 
				"News - " + "isbn: " + isbn 
				+ " - publisher: " + publisher 
				+ " - copies: " + copies 
				+ " - Date: " + date.toString();
	}
}
