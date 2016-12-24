<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>  
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 


Here You can see all the tours, offered by travel agencies

Use a  different filters for better search

<core:forEach var="tour" items="${tours}">
	${tour.name } ${tour.price}
	<a href="tourDetails/${tour.id}">details</a>


</core:forEach>



