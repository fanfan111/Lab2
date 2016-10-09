package ActionPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import connect.JDBC.*;

public class SBookByANAction extends ActionSupport{
	private String name;

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public String execute() throws Exception
	{
		try{
			ActionContext.getContext().put("books_author_someone" , new MysqlJdbc().findBooksByAName(name));
			return SUCCESS;
		}
		  catch(Exception e)
		{
			  return ERROR;
		}
	}
}
