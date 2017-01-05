<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<title>Welcome to KAFON</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"
	type="text/javascript"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	type="text/javascript"></script>
<style type="text/css">
body {
	background-image: url("http://wallpapercave.com/wp/LOodQ4x.jpg");
	background-size:100%;
}
</style>
</head>
<body>
	<c:if test="${empty successadmin12}">
	<jsp:include page="header.jsp"></jsp:include>
	</c:if>
	<c:if test="${carousel}">
		<jsp:include page="Carousel.jsp" />
		<jsp:include page="categoryhm.jsp"></jsp:include>
	</c:if>
	${successlogin}
	<c:if test="${not empty successlogin}">
		<jsp:include page="Carousel.jsp" />
		<jsp:include page="categoryhm.jsp"></jsp:include>
	</c:if>
	
	<c:if test="${not empty successadmin12}">
		<jsp:include page="headeradmin.jsp" />
	</c:if>
	${successadmin12}
	<c:if test="${log}">
		<jsp:include page="login.jsp" />
	</c:if>
	${failedlogin}
	<c:if test="${not empty failedlogin}">
		<jsp:include page="login.jsp" />
	</c:if>
	<c:if test="${reg}">
		<jsp:include page="register.jsp" />
	</c:if>
	${failedregister}
	<c:if test="${not empty failedregister}">
		<jsp:include page="register.jsp" />
	</c:if>
	${successregister}
	<c:if test="${not empty successregister}">
		<jsp:include page="login.jsp" />
	</c:if>
	<c:if test="${contact}">
		<jsp:include page="contact.jsp" />
	</c:if>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
