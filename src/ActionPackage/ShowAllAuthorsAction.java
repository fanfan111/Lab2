package ActionPackage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import connect.JDBC.*;

public class ShowAllAuthorsAction extends ActionSupport {
	public String execute() throws Exception {
		try {
			ActionContext.getContext().put("all_authors", new MysqlJdbc().selectAuthors());

			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
}