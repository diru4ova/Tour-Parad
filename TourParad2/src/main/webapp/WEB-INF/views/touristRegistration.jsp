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
${tourists}
${tourist}

<form:form modelAttribute="tourist" action="newTourist" method="post">

	<div style="text-align: center; color: red; margin: 5px">
		<label for="msg">${usernameException}</label></div>
	<form:input path="name" type="text"
		class="validate[required,custom[onlyLetter],length[0,100]] feedback-input"
		placeholder="name" id="name"/><br>
	<form:input path="password" type="password" placeholder="password" />
	
	
	
	
	

	<%-- <p>
	<div><label for="msg">${usernameException}</label></div>
	<form:input path="name" placeholder="name" id="msg"/><br>
	</p>
	<p>
	<form:input path="surname" placeholder="surname"/><br>
	</p>
	<p>
	<div><label for="msg">${emailException}</label></div>
	<!--  <label for="msg2">${invalidEmail}</label>-->
	<form:input path="email" type="email" placeholder="email" id="msg" /><br>
	</p>
	<p>
	<div><label for="msg">${emptyPhone}</label></div>
	<!-- <label for="msg2">${phoneExists}</label> -->
	<form:input path="phone" placeholder="phone" id="msg" /><br>
	</p>
	<p>
	<div><label for="msg">${emptyPassword}</label></div>
	<!-- <label for="msg2">${invalidPassword}</label> -->
	<form:input path="password" type="password" placeholder="password" id="msg" />
	</p>	
	 --%>
		
	 
	<%--<button>save tourist</button>   --%>
	<div class="submit">
			<input type="submit" value="SEND" id="button-blue" />
						
	</div>
</form:form>


</body>
</html>