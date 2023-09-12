<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/SearchServlet" method="post">
  Enter your username
  <input type="text" name="Uname" />
  <br />
  <input type="submit" value="search" /> </form>

</body>
</html>