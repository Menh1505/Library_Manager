import java.util.ArrayList;
import java.util.List;

public class ManageDoc 
{
	private List<Document> docList;
	
	public ManageDoc()
	{
		this.docList = new ArrayList<>();
	}
	
	public void add(Document doc)
	{
		this.docList.add(doc);
	}
	
	public void search(String isbn)
	{
		for (Document document : docList) 
		{
			if(document.get_isbn() == isbn)
			{
				System.out.println(document.toString());
				break;
			}
		}
	}
	
	public void delete(String isbn)
	{
		for (Document document : docList) 
		{
			if(document.get_isbn() == isbn)
			{
				docList.remove(document);
			}
		}
	}
	
    public void showBook()
    {
    	for (Document document : docList)
    	{
			if(document instanceof Book)
			{
				System.out.println(document.toString());
			}
		}
    }
    
    public void showMagazine()
    {
    	for (Document document : docList)
    	{
			if(document instanceof Magazine)
			{
				System.out.println(document.toString());
			}
		}
    }
    
    public void showNews()
    {
    	for (Document document : docList)
    	{
			if(document instanceof News)
			{
				System.out.println(document.toString());
			}
		}
    }
    
	public void showDocumentList()
	{
		this.docList.forEach(o -> System.out.println(o.toString()));
	}
}
