<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tourist</title>
</head>
<body>

<sec:authorize access="!isAuthenticated()">
	

<a href="allTours"><button>find a tour</button></a>
<a href="enterToStart"><button>tour exchange</button></a>

<a href="touristLogin"><button>log in</button></a>
<a href="touristRegistration"><button>registration</button></a>

</sec:authorize>

<sec:authorize access="isAuthenticated()">

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>
	
	<a href="touristProfile"><button>my profile</button></a>
</sec:authorize>

</body>
</html>