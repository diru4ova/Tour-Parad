<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}"
	method="post" enctype="multipart/form-data">
	
	<input type="file" name="image">
	
	<button>save image</button>

</form:form>

<form:form action="updateTourist" method="post">
	
	
	<input name="name" type="text" value="${tourist.name}"/><br>
	
	<input name="password" type="text" /><br>
	
	<input name="email" type="text" value="${tourist.email}" /><br>
	
	<button>save changes</button>
	
</form:form>

</body>
</html>