<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="credit_year" items="${credit_year}">
		<p>
			<c:out value="${credit_year}">
			</c:out>
			<c:if test="${credit_year.year == 2014 && credit_year.semester == 1}">
				<a href="${pageContext.request.contextPath}/show_subject_2014_1">
				[상세보기] </a>
			</c:if>
			<c:if test="${credit_year.year == 2014 && credit_year.semester == 2}">
				<a href="${pageContext.request.contextPath}/show_subject_2014_2">
				[상세보기] </a>
			</c:if>
			<c:if test="${credit_year.year == 2015 && credit_year.semester == 1}">
				<a href="${pageContext.request.contextPath}/show_subject_2015_1">
				[상세보기] </a>
			</c:if>
			<c:if test="${credit_year.year == 2015 && credit_year.semester == 2}">
				<a href="${pageContext.request.contextPath}/show_subject_2015_2">
				[상세보기] </a>
			</c:if>
			<c:if test="${credit_year.year == 2016 && credit_year.semester == 1}">
				<a href="${pageContext.request.contextPath}/show_subject_2016_1">
				[상세보기] </a>
			</c:if>
			<c:if test="${credit_year.year == 2016 && credit_year.semester == 2}">
				<a href="${pageContext.request.contextPath}/show_subject_2016_2">
				[상세보기] </a>
			</c:if>
		</p>
	</c:forEach>
</body>
</html>
