<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="connect.JDBC.Book"%>
<%@page import="connect.JDBC.Author"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><s:text name="Detail" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
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
table {
	border-collapse: collapse;
	border: none;
	height: 80%;
	width: 50%;
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
</style>

</head>
<body>
	<h1 style="text-align: center">Title</h1>
	<table>
		<%
			Book p = (Book) request.getAttribute("a_book");
		%>

		<tr>
			<td>ISBN</td>
			<td><%=p.getISBN()%></td>
		</tr>

		<tr>
			<td>Title</td>
			<td><%=p.getTitle()%></td>
		</tr>

		<tr>
			<td>AuthorId</td>
			<td><%=p.getAuthorId()%></td>
		</tr>

		<tr>
			<td>Publisher</td>
			<td><%=p.getPublisher()%></td>
		</tr>

		<tr>
			<td>PublishDate</td>
			<td>
				<%=p.getPublishDate()%>
			</td>
		</tr>

		<tr>
			<td>Price</td>
			<td><%=p.getPrice()%></td>
		</tr>


		<%
			Author a = (Author) request.getAttribute("a_author");
		%>
		<tr>
			<td>Author Age</td>
			<td><%=a.getAge()%></td>
		</tr>
		<tr>
			<td>Author Country</td>
			<td><%=a.getCountry()%></td>
		</tr>
		<tr>
			<td>Author Name</td>
			<td><%=a.getName()%></td>
		</tr>

	</table>

	<p style="text-align: center">
		<a href="http://1.bookdb.applinzi.com/loginForm">return </a>
	</p>
</body>
</html>
