<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.List"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="connect.JDBC.Author"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="Add New Book"/></title>
<style type="text/css">      
      body{      
 
        background-image: url(../../21.jpg);
		background-size: cover; 
     }
     a{ color:#333; text-decoration:none;}
a:hover{ color:#F00; text-decoration:underline;}
a:active{ color:#30F;}  
 </style> 
 <script type="text/javascript">
function validate(field,alerttxt)
{
	with (field)
	{
	  if (value.match("/^((?:19|20)\d\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$/"))
	  {
		 alert(alerttxt);
		 return false
	  }
	  else {
		  return true
	  }
	}
}

function validate_form(thisform)
{
with (thisform)
{
if (validate(publishDate,"Input error, please re-enter!") == false)
  {
	authorId.focus();
	age.focus();
	return false
}
}
}
</script>
</head>
<body>


 <div style="left: 20%; position: absolute; top: 10%;">
 <h1 style="text-align:center">Add New Book</h1>
<s:form action="addBook" onsubmit="return validate_form(this);" style="text-align:center">
	<s:textfield label="ISBN" name="ISBN"/>
	<s:textfield label="Title" name="title"/>
	<s:textfield label="AuthorId" name="authorId"/>
	<s:textfield label="Publisher" name="publisher"/>
	<s:textfield label="PublishDate" name="publishDate"/>
	<s:textfield label="Price" name="price"/>
	<s:submit value="OK"></s:submit>

	</s:form>
<p style="text-align:center">Remark:the date format is "yyyy-mm-dd",for example 2011-1-8</p>	
<p style="text-align:center"><a href="http://1.bookdb.applinzi.com/loginForm">return </a></p></div>
</body>
</html>
