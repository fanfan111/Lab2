package ActionPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import connect.JDBC.*;

public class ShowAllBooksAction extends ActionSupport{
	public String execute() throws Exception
	{
		try{
			
			
			ActionContext.getContext().put("all_books" , new MysqlJdbc().selectBooks());
			 
			return SUCCESS;
		}
		  catch(Exception e)
		{
			  ActionContext.getContext().put("e" , e);
			  return ERROR;
		}
	}
}