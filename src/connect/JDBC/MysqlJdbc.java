package connect.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import connect.JDBC.Author;
import connect.JDBC.Book;

public class MysqlJdbc {

	public List<Author> selectAuthors() throws Exception {
		List<Author> aNew = new ArrayList<Author>();

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序

		// "jdbc:mysql://localhost:3306/bookdb","root","123456"
		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM `author` WHERE 1");// user
		// 为你表的名称
		while (rs.next()) {
			Author a = new Author();
			a.setAuthorId(Integer.parseInt(rs.getString("authorId")));
			a.setAge(Integer.parseInt(rs.getString("age")));
			a.setCountry(rs.getString("country"));
			a.setName(rs.getString("name"));
			aNew.add(a);
		}

		return aNew;
	}

	public List<Book> selectBooks() throws Exception {
		List<Book> aNew = new ArrayList<Book>();

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM `book` WHERE 1");// user
		// 为你表的名称
		while (rs.next()) {
			Book a = new Book();
			a.setAuthorId(Integer.parseInt(rs.getString("authorId")));
			a.setISBN(rs.getString("ISBN"));
			a.setPrice(Float.parseFloat(rs.getString("price")));
			a.setPublishDate(rs.getString("PublishDate"));
			a.setPublisher(rs.getString("publisher"));
			a.setTitle(rs.getString("title"));
			aNew.add(a);
		}

		return aNew;
	}

	public void updatePrice(float price, String ISBN) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		state.execute("update book set price = " + price + " where ISBN ='" + ISBN + "'");

	}

	public void updatePublishDate(String publishDate, String ISBN) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		state.execute("update book set publishDate = '" + publishDate + "' where ISBN ='" + ISBN + "'");

	}

	public void updatePublisher(String publisher, String ISBN) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		String hql = "update book set publisher = '" + publisher + "' where ISBN ='" + ISBN + "'";
		System.out.println(hql);
		state.execute(hql);

	}

	public void updateAuthorId(int authorId, String ISBN) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		state.execute("update book set authorId = " + authorId + " where ISBN ='" + ISBN + "'");

	}

	public void insertAuthor(int authorId, String name, int age, String country) throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		state.execute("INSERT INTO author VALUES(" + authorId + ", '" + name + "'," + age + ",'" + country + "')");

	}

	public void insertBook(String ISBN, String title, int authorId, String publisher, String publishDate, float price)
			throws Exception {

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		String hql = "INSERT INTO book VALUES('" + ISBN + "','" + title + "'," + authorId + ",'" + publisher + "','"
				+ publishDate + "'," + price + ")";
		state.execute(hql);

	}

	public boolean isHaveAuthor(int authorId) throws Exception {
		boolean flag = false;

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();

		ResultSet rs = state.executeQuery("select * from author where authorId =" + authorId);
		if (rs.next()) {
			flag = true;
		} else {
			flag = false;
		}

		return flag;
	}

	public List<Book> findBooksByAName(String name) throws Exception {
		List<Book> aNew = new ArrayList<Book>();

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery(
				"select * from author a join book b where a.authorId = b.authorId and a.name ='" + name + "'");// user
		// 为你表的名称
		while (rs.next()) {
			Book a = new Book();
			a.setAuthorId(Integer.parseInt(rs.getString("authorId")));
			a.setISBN(rs.getString("ISBN"));
			a.setPrice(Float.parseFloat(rs.getString("price")));
			a.setPublishDate(rs.getString("PublishDate"));
			a.setPublisher(rs.getString("publisher"));
			a.setTitle(rs.getString("title"));
			aNew.add(a);
		}
		return aNew;
	}

	public boolean Delete(String ISBN) throws Exception {
		boolean flag = false;

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement state = connect.createStatement();
		flag = state.execute("delete from book where ISBN = '" + ISBN + "'");

		return flag;

	}

	public Book findBDetail(String ISBN) throws Exception {
		Book a = new Book();

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from book where ISBN ='" + ISBN + "'");// user
		// 为你表的名称
		while (rs.next()) {
			a.setAuthorId(Integer.parseInt(rs.getString("authorId")));
			a.setISBN(rs.getString("ISBN"));
			a.setPrice(Float.parseFloat(rs.getString("price")));
			a.setPublishDate(rs.getString("PublishDate"));
			a.setPublisher(rs.getString("publisher"));
			a.setTitle(rs.getString("title"));
		}
		return a;
	}

	public Author findADetail(int authorId) throws Exception {
		Author a = new Author();

		Class.forName("com.mysql.jdbc.Driver"); // 加载MYSQL JDBC驱动程序
		System.out.println("Success loading Mysql Driver!");

		Connection connect = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_bookdb",
				"5m4y44zk4m", "h3zkzzm01m3myix1k1hxlm14kl1wl0z54mj2kh1m");
		// 连接URL为 jdbc:mysql//服务器地址/数据库名 ，后面的2个参数分别是登陆用户名和密码

		System.out.println("Success connect Mysql server!");
		Statement stmt = connect.createStatement();
		ResultSet rs = stmt.executeQuery("select * from author where authorId =" + authorId);// user
		// 为你表的名称
		while (rs.next()) {
			a.setAuthorId(Integer.parseInt(rs.getString("authorId")));
			a.setAge(Integer.parseInt(rs.getString("age")));
			a.setCountry(rs.getString("country"));
			a.setName(rs.getString("name"));
		}

		return a;
	}

}