<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="connect.JDBC.Author"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="Update" /></title>
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
	<div style="left: 20%; position: absolute; top: 15%;">
		<h1 style="text-align: center">Update</h1>

		<!-- 可更新一本图书的作者、出版社、出版日期、价格-->
		<s:form action="up" namespace="/tag">
			<s:textfield label="ISBN" name="ISBN" />
			<s:radio label="Select"
				list="{'publisher','publishDate','price','authorId'}" name="a"
				value="1" />
			<s:textfield label="Update content" name="file" />
			<s:submit value="OK"></s:submit>
		</s:form>

		<p style="text-align: center">
			<a href="http://1.bookdb.applinzi.com/loginForm">return </a>
		</p>
	</div>


</body>
</html>
