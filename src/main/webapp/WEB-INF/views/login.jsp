<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/common.css' />" />
</head>
<body>

	<c:if test="${not empty error}">
		<div class="errorblock">
			Your login attempt was not successful, try again.<br /> Caused :
			${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
		</div>
	</c:if>
	
	<c:set var="login" value="${login}" />
	
	<c:if test="${login == 'success'}">
		<div style="width: 300px;">
			WELCOME ${userid} <a href="<%= request.getContextPath() %>/j_spring_security_logout">Logout</a>
		</div>
	</c:if>
	
	<c:if test="${login == 'fail'}">
		<form name="loginForm" action="<c:url value='j_spring_security_check' />" method="POST">
			<div class="loginDiv">
				<div><input type="text" name="j_username" /></div>
				<div><input type="password" name="j_password" /></div>
				<div><input name="submit" type="submit" value="submit" /></div>
			</div>
		</form>
	</c:if>
 
</body>
</html>