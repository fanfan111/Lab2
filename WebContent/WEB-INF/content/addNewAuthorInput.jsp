<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.List"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
 <%@page import="connect.JDBC.Author" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="Add New Author"/></title>
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
	  if (value.match("[^0-9]") != null)
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
if (validate(age,"Input error, please re-enter!") == false)
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
<div style="left: 20%; position: absolute; top: 15%;">
<h1 style="text-align:center">Add New Author</h1>
<% int a = (int) request.getAttribute("author_id");%>
<s:form action="addAuthor" onsubmit="return validate_form(this);" style="text-align:center">
	<input type=hidden name="authorId" value=<%=a%> />
	<s:textfield label="Name" name="name" />
	<s:textfield label="Age" name="age" />
	<s:textfield label="Country" name="country" />
	<s:submit value="OK"></s:submit>
</s:form>
<p style="text-align:center"><a href="http://1.bookdb.applinzi.com/loginForm">return </a></p>
</div>
<br>

</body>
</html>
