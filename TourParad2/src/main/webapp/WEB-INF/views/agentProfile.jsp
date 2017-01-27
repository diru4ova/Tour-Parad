<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agent Profile</title>
</head>
<body>


<a href="myAgency"><button>my profile</button></a>
<a href="agentOrders"><button>my orders</button></a>
<a href="agentChats"><button>chat</button></a>
<a href="findTour"><button>tour search</button></a><br>
<br>
<a href="myTours"><button>my tours</button></a><br>
<br>



<div background="blue">
<core:forEach var="tour" items="${tours}">
	${tour.name } ${tour.price}<br>
	
</core:forEach>
<a href="newTour"><button>create tour</button></a><br>
</div>
 
 
 
<div background="yellow">
 <core:forEach var="chat" items="${chats}">
	 
	${chat.theme } ${tour.date}<br>
	
	
</core:forEach>

</div>

<a href="main">main page</a><br>

 




</body>
</html>