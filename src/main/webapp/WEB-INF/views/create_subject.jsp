<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table>
			<tr>
				<td>�����⵵:</td>
				<td><input name="year" type="text"></td>
			</tr>
			<tr>
				<td>�б�:</td>
				<td><input name="semester" type="text"></td>
			</tr>
			<tr>
				<td>�����ڵ�:</td>
				<td><input name="code" type="text"></td>
			</tr>
			<tr>
				<td>�������:</td>
				<td><input name="name" type="text"></td>
			</tr>
			<tr>
				<td>����:</td>
				<td><input name="division" type="text"></td>
			</tr>
			<tr>
				<td>����:</td>
				<td><input name="credit" type="text"></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="create subject" type="submit" /></td>
			</tr>
		</table>

	</form>


</body>
</html>