<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.servlet.DbConnection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

    
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>
<body>

<h1>Student Record :</h1>

<table border ="1">
<tr>

<th>Name :</th>
<th>Branch :</th>
<th>Rollno :</th>
<th>Marks :</th>

</tr>

<%

ResultSet rs = null;

String sname="";
String rollno="";
String branch="";
String marks="";

String qry = "select * from Student";
Connection con = DbConnection.getConnection();
Statement st = con.createStatement();
rs =st.executeQuery(qry);

while(rs.next())
{
	sname=rs.getString("Sname");
	branch = rs.getString("Branch");
	rollno = rs.getString("Rollno");
	marks = rs.getString("Marks");
	


%>

<table border ="2"><tr>

<td><%=sname %></td>
<td><%=branch %></td>
<td><%=rollno %></td>
<td><%=marks %></td>

</tr>
</table>

<%} %>
</body>
</html>