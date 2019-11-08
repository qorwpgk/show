<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel = "skylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4/0/0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<%! String greeting = "웹 쇼핑몰에 오신 것을 환영합니다!";
String tagline = "Welcome to Web Market!";%>
<div class="jumbotron">
<div class="container">
<h1 class="display-3">
<%= greeting %></h1>
</div>
</div>
<main role = "main">
<div class="container">
<div class="text-center">
<h3><%=tagline %></h3>
</div>
</div>
response.setIntHeader("Refresh",5);
<%@ include file="footer.jsp" %>
</body>
</html>