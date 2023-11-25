
public class Magazine extends Document
{
	private int publishNum;
	private int publishMonth;
	
	public Magazine(String isbn, String publisher, int copies, int publishNum, int publishMonth)
	{
		super(isbn, publisher, copies);
		this.publishNum = publishNum;
		this.publishMonth = publishMonth;
	}
	
	public int get_publishNum()
	{
		return publishNum;
	}
	public int get_publishMonth()
	{
		return publishMonth;
	}
	
	public void set_publishNum(int value)
	{
		publishNum = value;
	}
	public void set_publishMonth(int value)
	{
		publishMonth = value;
	}
	
	@Override
	public String toString()
	{
		return 
				"Magazine - " + "isbn: " + isbn 
				+ " - publisher: " + publisher 
				+ " - copies: " + copies 
				+ " - publish number: " + publishNum 
				+ " - publish month: " + publishMonth;
	}
}
