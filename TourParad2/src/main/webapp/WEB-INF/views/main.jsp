<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main page</title>
</head>
<body>
<h1>MAIN PAGE</h1>

<a href="touristLogin"><button>log in</button></a>

<sec:authorize access="hasRole('ROLE_ADMIN')">

	<a href="adminPage">admin page</a>
	
	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>

</sec:authorize>



<a href="tourist"><button>i am a tourist</button></a></br>
<a href="agent"><button>i am an agent</button></a></br>
<a href="operator"><button>i am an operator</button></a>



</body>
</html>