<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="connect.JDBC.Author"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="loginPage" /></title>
<style type="text/css">
body {
	background-image: url(../../1.jpg);
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

	<div style="left: 25%; position: absolute; top: 20%;">
		<h1 style="text-align: center">BookDB</h1>


		<h3 style="text-align: center">
			<a href="http://1.bookdb.applinzi.com/SearchBooksByAuthorName">SearchBooksByAuthorName
			</a>

			<p style="text-align: center">
				<a href="http://1.bookdb.applinzi.com/addNewBook">AddNewBook </a> <br>
			<p style="text-align: center">
				<a href="http://1.bookdb.applinzi.com/addNewAuthor">AddNewAuthor
				</a> <br>
			<p style="text-align: center">
				<a href="http://1.bookdb.applinzi.com/show_all_books">ShowBooks

					<p style="text-align: center">
						<a href="http://1.bookdb.applinzi.com/show_all_authors">ShowAuthors


						</a> <br>
					<p style="text-align: center">
					<p style="text-align: center">
						<a href="http://1.bookdb.applinzi.com/UpdateInput">Update</a>
	</div>
	</h3>
	

</body>
</html>
