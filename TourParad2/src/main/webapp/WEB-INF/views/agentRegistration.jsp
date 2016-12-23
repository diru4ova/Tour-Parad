<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agency registration</title>
</head>
<body>

<form:form modelAttribute="agency" action="agentRegProcess" method="post">
	<form:input path="name" placeholder="name"/><br>
	<form:input path="official_name" placeholder="official name"/><br>
	<form:input path="owner_form" placeholder="owner form"/><br>
	<form:input path="adress" placeholder="adress"/><br>
	<form:input path="phone_number" placeholder="phone"/><br>
	<form:input path="tax_form" placeholder="tax form"/><br>
	<form:input path="tax_payment_id" placeholder="tax payment id"/><br>
	<p>information for on-line payment<p><br>
	<form:input path="bank_code" placeholder="bank code"/><br>
	<form:input path="bank_name" placeholder="bank name"/><br>
	<form:input path="bank_account" placeholder="bank account"/><br>
	<form:input path="email" type="email" placeholder="email"/>	<br>
	<form:input path="password" type="password" placeholder="password"/><br>	
		
	
	<button>save agency</button>   
</form:form>

</body>
</html>