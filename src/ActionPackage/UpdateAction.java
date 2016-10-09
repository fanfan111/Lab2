package ActionPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import connect.JDBC.*;
public class UpdateAction extends ActionSupport {

	private String ISBN;
	private String a;
	private String file;

	public void setFile(String file) {
		this.file = file;
	}

	public String getFile() {
		return this.file;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getISBN() {
		return this.ISBN;
	}
	
	public void setA(String a) {

		this.a = a;
	}
	
	public String getA() {
		return this.a;
	}
	//{'出版社','出版日期','价格','作者编号'}"
	public String execute() throws Exception {
		try {
			// String [ ] values = Request.getParamterValues("name");
			//long ISBN = new HqlQuery().findISBN(title);

			if (a.compareTo("publisher") == 0) {
				new MysqlJdbc().updatePublisher(file, ISBN);
			} else if (a.compareTo("publishDate") == 0) {
				
				new MysqlJdbc().updatePublishDate(file, ISBN);

			} else if (a.compareTo("price") == 0) {
				float price = Float.parseFloat(file);
				new MysqlJdbc().updatePrice(price, ISBN);

			} else if (a.compareTo("authorId") == 0) {
				int authorId = Integer.parseInt(file);
				new MysqlJdbc().updateAuthorId(authorId, ISBN);
				if(new MysqlJdbc().isHaveAuthor(authorId)==false){
					ActionContext.getContext().put("author_id" ,authorId);
					return INPUT;
				}
				
			} else {
				return ERROR;
			}
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

}
