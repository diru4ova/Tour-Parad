<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

<form:form modelAttribute="tourist" action="newTourist" method="post">
	<form:input path="name" placeholder="name"/>
	<form:input path="surname" placeholder="surname"/>
	<form:input path="email" type="email" placeholder="email"/>
	<form:input path="phone" placeholder="phone"/>
	<form:input path="password" type="password" placeholder="password"/>
		
	
	<button>save tourist</button>   
</form:form>


</body>
</html>