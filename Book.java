public class Book{
	//data members
	private int  num = 100;
	private int bookId;
	private String title;
	private String author;
	private int price;
	//setter - > constructor
	public Book(int bookId , String title,String author,int price){
		this.bookId = bookId;
		this.title  = title;
		this.author = author;
		this.price = price;
	}
	//getter -> toString()
	public String toString(){
		return bookId+" "+title+" "+author+" "+price;

	}
	public static void main(String[] args) {
		Book b1 = new Book(101, "The Java","James Gousling",500);
	    System.out.println(b1);
	    System.out.println(b1.toString());
	    System.out.println(b1.num);

	  
	}
}