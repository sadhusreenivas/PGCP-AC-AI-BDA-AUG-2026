//author
class Author{
	//data
	private String authorName;
	private String  country;

	//methods
	public Author(String authorName, String country){
		this.authorName = authorName;
		this.country = country;
	}
	//getter
	public void dispAuthor(){
		System.out.println("author name : "+authorName+" author country" + country);
	}
}  //James USA

//book
class Book{
	//data
	private String bName;
	private int price;
	private Author  author;
	//method
	public Book(String bName, int price,Author author){
		this.bName = bName; //java
		this.price = price; // 499 
		this.author= author; //  james usa
	}
	//getter
	public void dispBook(){
		System.out.println("Book Name : "+bName+" Price : "+price);
		author.dispAuthor();
	}
}
//library
class Library{
	//data
	private String lName;
	private String city;
	private Book book;
	//method
	public Library(String lName , String city,Book book){
		this.lName = lName;
		this.city = city;
		this.book = book;
	}
	//getter
	public void dispLib(){
		System.out.println("Lib Name : "+lName+" City :"+city);
		book.dispBook();
	}
}

public class AssociationEx{
	public static void main(String[] args) {
		Author a = new Author("James", "USA");
		System.out.println("***************");


		Book b = new Book("Java",499,a);  // Has- A


		System.out.println("*************");
		Library l = new Library("C-DAC","Hyd",b);
		l.dispLib();
	}
}





































//using Author class Reference variable