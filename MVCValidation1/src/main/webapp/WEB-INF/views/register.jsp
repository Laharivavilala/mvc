<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>
<c:url var="myAction" value="showRegister.obj"/>
<form:form method ="post" modelAttribute="user" action="checkregister.obj">
Enter First Name:<form:input path="firstName"/>
				 <form:errors path="firstName" cssStyle="color:red"/>
<br/>
Enter Last Name:<form:input path="lastName"/>
				<form:errors path="lastName" cssStyle="color:red"/>
<br/>
Gender: <form:radiobutton path="gender" value="M" label="M"/>
		<form:radiobutton path ="gender" value="F" label="F"/><br/>
		
Enter eMail:<form:input path="email"/>
			<form:errors path="email" cssStyle="color:red"/>
<br/>
Select Skills:
<form:checkboxes items="${skillList }"path="skillSet" />

<br/>

Select your city:
<form:select path="city">
<form:option value="" label="Please Select"/>
<form:options items="${cityList}"/>
</form:select>




	</form:form>
</body>
</html>