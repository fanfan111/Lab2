<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="connect.JDBC.Author"%>
<%@page import="connect.JDBC.Book"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><s:text name="Books" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
table {
	border-collapse: collapse;
	border: none;
	height: 80%;
	width: 80%;
	margin: 10px auto;
}

td {
	border: solid #000 1px;
	margin: 10px auto;
}

#an {
	margin: none;
	padding: none;
	width: 100%;
	height: 100%;
}
 body{      
 
        background-image: url(../../21.jpg);
		background-size: cover; 
     }
a {
	color: #333;
	text-decoration: none;
}

a:hover {
	color: #F00;
	text-decoration: underline;
}

a:active {
	color: #30F;
}
</style>

</head>
<body>

	<h1 style="text-align: center">All Books</h1>
	<table>
		<tr>
			<td>ISBN</td>
			<td>Title</td>
			<td>AuthorId</td>
			<td>Publisher</td>
			<td>PublishDate</td>
			<td>Price</td>
			<td>Delete</td>
			<td>Update</td>
		</tr>

		<%
			List<Book> list = (List<Book>) request.getAttribute("all_books");
			for (Object ele : list) {
				Book p = (Book) ele;
				String detail_url = "http://1.bookdb.applinzi.com/search_book_detial?ISBN=" + p.getISBN();
		%>
		<tr>
			<td><%=p.getISBN() %></td>
			<td><a href="<%=detail_url%>"><%=p.getTitle()%></a> </td>
			<td><%=p.getAuthorId()%></td>
			<td><%=p.getPublisher()%></td>
			<td><%=p.getPublishDate()%></td>
			<td><%=p.getPrice()%></td>
			<%
				String delete_url = "http://1.bookdb.applinzi.com/delete_a_book?ISBN=" + p.getISBN() + "&authorId="
							+ p.getAuthorId();
			
				String update_url = "http://1.bookdb.applinzi.com/Update?ISBN=" + p.getISBN() ;
			
			%>
			<td><a href="<%=delete_url%>">Delete</a></td>
			<td><a href="<%=update_url%>">Update</a></td>
		<tr>
			<%
				}
			%>
		
	</table>

	<p style="text-align: center">
		<a href="http://1.bookdb.applinzi.com/loginForm">return </a>
	</p>
</body>
</html>
