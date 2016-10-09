package connect.JDBC;

public class Book {
	//图书
	//ISBN (PK), Title, AuthorID (FK)
	//, Publisher, PublishDate, Price
	
	private String ISBN;
	private String title;
	private int authorId;
	private String publisher;
	private String publishDate;
	private float price;
	/*create table tutorials_tbl(
   tutorial_id INT NOT NULL AUTO_INCREMENT,
   tutorial_title VARCHAR(100) NOT NULL,
   tutorial_author VARCHAR(40) NOT NULL,
   submission_date DATE,
   PRIMARY KEY ( tutorial_id )
);*/

	public String getISBN()
	{
		return this.ISBN;
	}
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getAuthorId()
	{
		return this.authorId;
	}
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	
	public String getPublisher()
	{
		return this.publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public String getPublishDate()
	{
		return this.publishDate;	
	}
	public void setPublishDate(String PublishDate)
	{
		this.publishDate = PublishDate;
	}
	
	
	public float getPrice()
	{
		return this.price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	
}
