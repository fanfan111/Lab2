<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="connect.JDBC.Author"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="SearchBook" /></title>
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


</style>
</head>
<body>
<div style="left: 20%; position: absolute; top: 20%;">
	<h1 style="text-align: center">Search Books By Author Name</h1>

<br>
	<s:form action="search_book" class="form-signin"
		style="text-align:center">
		<s:textfield name="name" key="authorName" />
		<s:submit key="search" />
	</s:form>
	<p style="text-align:center"><a href="http://1.bookdb.applinzi.com/loginForm">return </a></p>
</div>
</body>
</html>
