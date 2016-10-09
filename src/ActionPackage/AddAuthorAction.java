package ActionPackage;

import java.util.ArrayList;
import java.util.List;
import connect.JDBC.Book;

import connect.JDBC.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AddAuthorAction extends ActionSupport{
	private int authorId;
	private String name;
	private int age;
	private String country;

	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	public int getAuthorId()
	{
		return this.authorId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return this.country;
	}
	

	public String execute() 
	{
		try{
			
			if(name == null || country == null || age<=0 ||age >=150){
				return ERROR;
			}
			new MysqlJdbc().insertAuthor(authorId, name, age, country);

			return SUCCESS;
		}
		catch(Exception e)
		{
			return ERROR;
		}
		    
	}
	
}