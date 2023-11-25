
public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public Date()
	{
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int get_day()
	{
		return day;
	}
	public int get_month()
	{
		return month;
	}
	public int get_year()
	{
		return year;
	}
	
	public void set_day(int value)
	{
		day = value;
	}
	public void set_month(int value)
	{
		month = value;
	}
	public void set_year(int value)
	{
		year = value;
	}
	
	@Override
	public String toString()
	{
		return this.day + "/" + this.month + "/" + this.year;
	}
}
