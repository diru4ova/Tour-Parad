<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">

div{
	color: blue;
}
</style>

<title>Tourist Profile</title>
</head>
<body>



<sec:authentication property="name" />

<sec:authorize access="isAuthenticated()">

${tourist.name} 

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>
	
	<a href="updateProfile"><button>update profile</button></a>
	
	
	
</sec:authorize>

<img alt="profile photo" src="${tourist.pathImage}" width="100px" height="100px">





  

<div>
<c:forEach var="tour" items="${tours}">
	${tour.name } ${tour.price} 
	<a href="tourDetails"><button>details</button></a><br>
	
</c:forEach>

</div>


</body>
</html>