<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h2>SpringMVC demo</h2>
<body>
<c:forEach items="${users}" var="user">
	<c:out value="${user.username}"></c:out><br/>
	<c:out value="${user.email}"></c:out><br/>
</c:forEach>
<input type="text" value="${handlingTime}"/>
</body>
</html>