package ActionPackage;

import java.util.ArrayList;
import java.util.List;
import connect.JDBC.*;

import connect.JDBC.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AddBookAction extends ActionSupport{
	private String ISBN;
	private String title;
	private int authorId;
	private String publisher;
	private String publishDate;
	private float price;
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	public String getISBN()
	{
		return this.ISBN;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getTitle()
	{
		return this.title;
	}
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	public int getAuthorId()
	{
		return this.authorId;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	
	public void setPublishDate(String PublishDate)
	{
		this.publishDate = PublishDate;
	}
	public String getPublishDate()
	{
		return this.publishDate;	
	}

	
	public void setPrice(float price)
	{
		this.price = price;
	}
	public float getPrice()
	{
		return this.price;
	}
	
	public String execute() 
	{
		try{
			String[] a = publishDate.split("\\-");
			
			int day = Integer.parseInt(a[2]);
			int month = Integer.parseInt(a[1]);
			int year = Integer.parseInt(a[0]);
			
			
			new MysqlJdbc().insertBook(ISBN, title, authorId, publisher, publishDate, price);
			
			if(new MysqlJdbc().isHaveAuthor(authorId) == false){
				ActionContext.getContext().put("author_id" ,authorId);
				return INPUT;
			}
			
			return SUCCESS;
		}
		catch(Exception e)
		{
			return ERROR;
		}
		    
	}
	
}