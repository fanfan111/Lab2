package ActionPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.*;

public class SABDetialByBSAction extends ActionSupport{
	
	private String ISBN;

	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	public String getISBN()
	{
		return this.ISBN;
	}
	
	public String execute() throws Exception
	{
		try{
			Book b = new MysqlJdbc().findBDetail(ISBN);
			Author a = new MysqlJdbc().findADetail(b.getAuthorId());
			ActionContext.getContext().put("a_book" , b);	
			ActionContext.getContext().put("a_author" , a);		

			return SUCCESS;
		}
		  catch(Exception e)
		{
			  return ERROR;
		}
	}
}
