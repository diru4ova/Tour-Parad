<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Tour</title>
</head>
<body>

<form:form modelAttribute="tour" action="newTour" method="post">

<form:input path="name" placeholder="name"/><br>
<form:input path="type" placeholder="type"/><br>
<form:input path="date" placeholder="date"/><br>
<form:input path="duration" placeholder="duration"/><br>
<form:input path="price" placeholder="price"/><br>
<form:input path="route" placeholder="route"/><br>
<form:input path="description" placeholder="description"/><br>

<form:select path="country" items="${countries}" itemLabel="name"
			itemValue="id">
		</form:select>


<button>save tour</button>


</form:form>

</body>
</html>