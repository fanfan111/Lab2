package connect.JDBC;


import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

//Author {AuthorID (PK), Name, Age, Country} 


public class Author {

	//AuthorID (PK), Name, Age, Country
	
	private int authorId;
	private String name;
	private int age;
	private String country;
	Author(){
		
	}
	public int getAuthorId()
	{
		return this.authorId;
	}
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{ 
		this.name = name;
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

}
