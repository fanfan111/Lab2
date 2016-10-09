<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="connect.JDBC.Book"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><s:text name="succPage" /></title>
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
	<h1 style="text-align: center">Title</h1>
	<%
		List<Book> list = (List<Book>) request.getAttribute("books_author_someone");
		for (Object ele : list) {
			Book p = (Book) ele;

			String b_v = p.getISBN();
			int a_v = p.getAuthorId();
			String detail_url = "http://1.bookdb.applinzi.com/search_book_detial?ISBN=" + b_v;
			String delete_url = "http://1.bookdb.applinzi.com/delete_a_book?ISBN=" + b_v + "&authorId=" + a_v;
	%>
	<p style="text-align: center">
		<a href="<%=detail_url%>"><%=p.getTitle()%></a> 
		<a href="<%=delete_url%>">Delete</a>
		
		<br>
	</p>

	<%
		}
	%>
	<p style="text-align: center">
		<a href="http://1.bookdb.applinzi.com/loginForm">return </a>
	</p>
</body>
</html>
