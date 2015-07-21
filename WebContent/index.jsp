<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/webtest/reqeustString?a=1&b=2&c=3">get</a>
	<form action="/webtest/reqeustString" method="post">
		<input name="a" value=1>
		<input name="b" value=2>
		<input name="c" value=3>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>
