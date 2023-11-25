import java.util.Scanner;

public class main 
{
	static void addNewDoc(ManageDoc mngDoc)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("DOCUMENT TYPE");
		System.out.println("1. Book");
		System.out.println("2. Magazine");
		System.out.println("3. News");
		
		int choice = scn.nextInt();
		
		String fflush = scn.nextLine();
		
		System.out.print("Enter isbn: ");
		String isbn = scn.nextLine();
		System.out.print("Enter publisher: ");
		String publisher = scn.nextLine();
		System.out.print("Enter copies: ");
		int copies = scn.nextInt();
	
		switch(choice)
		{
		case 1:
			fflush = scn.nextLine();
			
			System.out.print("Enter author: ");
			String author = scn.nextLine();
			System.out.print("Enter number of pages: ");
			int pages = scn.nextInt();
			Book b = new Book(isbn, publisher, copies, author, pages);
			mngDoc.add(b);
			break;
		case 2:
			System.out.print("Enter publish number: ");
			int publishNum = scn.nextInt();
			System.out.print("Enter publish month: ");
			int publishMonth = scn.nextInt();
			Magazine mgz = new Magazine(isbn, publisher, copies, publishNum, publishMonth);
			mngDoc.add(mgz);
			break;
		case 3:
			System.out.print("Enter day: ");
			int day = scn.nextInt();
			System.out.print("Enter month: ");
			int month = scn.nextInt();
			System.out.print("Enter year: ");
			int year = scn.nextInt();
			News news = new News(isbn, publisher, copies, day, month, year);
			mngDoc.add(news);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
	static void deleteDoc(ManageDoc mngDoc)
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter isbn of the document you want to delete: ");
		String isbn = scn.nextLine();
		
		mngDoc.delete(isbn);
	}
	static void showDocByType(ManageDoc mngDoc)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("DOCUMENT TYPE");
		System.out.println("1. Book");
		System.out.println("2. Magazine");
		System.out.println("3. News");
		
		int choice = scn.nextInt();
		switch(choice)
		{
		case 1:
			mngDoc.showBook();
		case 2:
			mngDoc.showMagazine();
		case 3:
			mngDoc.showNews();
		default:
			System.out.println("Invalid");
			System.out.println("Enter to continue");
			String stopScr = scn.nextLine();
			break;
		}
	}
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		ManageDoc manageDoc = new ManageDoc();
		
		while(true)
		{
			System.out.println("LIBRARY");
			System.out.println("1. Add new document");
			System.out.println("2. Delete a document by isbn");
			System.out.println("3. Show all document");
			System.out.println("4. Find document by isbn");
			System.out.println("5. Show document by type");
			System.out.println("6. Exit");
			
			int choice = scn.nextInt();
			switch(choice)
			{
			case 1:
				addNewDoc(manageDoc);
				break;
			case 2:
				deleteDoc(manageDoc);
				break;
			case 3:
				manageDoc.showDocumentList();
				
				System.out.println("Enter to continue");
				String stopScr = scn.nextLine();
				stopScr = scn.nextLine();
				break;
			case 4:
				System.out.print("Enter the isbn of document you want to find: ");
				String isbn = scn.nextLine();
				manageDoc.search(isbn);
				
				System.out.println("Enter to continue");
				String stopScr1 = scn.nextLine();
				stopScr1 = scn.nextLine();
				break;
			case 5:
				showDocByType(manageDoc);
				
				System.out.println("Enter to continue");
				String stopScr2 = scn.nextLine();
				stopScr2 = scn.nextLine();
				break;
			case 6:
				return;
			default:
				System.out.println("Invalid");
				continue;
			}
		}
		
	}
}
