package ActionPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import connect.JDBC.*;
public class DeleteBookAction extends ActionSupport {
	private String ISBN;
	private int authorId;
	

	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	public String getISBN()
	{
		return this.ISBN;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String execute() 
	{
		
		try{

			new MysqlJdbc().Delete(ISBN);
			return SUCCESS;
		}
		catch(Exception e)
		{
			return ERROR;
		}
		    
	}
}

	