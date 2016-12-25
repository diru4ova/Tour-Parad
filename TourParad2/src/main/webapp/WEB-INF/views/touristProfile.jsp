<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tourist Profile</title>
</head>
<body>



<sec:authentication property="name" />

<sec:authorize access="isAuthenticated()">

${tourist.name} ${tourist.email}

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>
</sec:authorize>

<img alt="add photo" src="${tourist.pathImage}">

<form:form action="./saveImage?${_csrf.parameterName}=${_csrf.token}"
	method="post" enctype="multipart/form-data">
	
	<input type="file" name="image">
	
	<button>save image</button>

</form:form>


</body>
</html>