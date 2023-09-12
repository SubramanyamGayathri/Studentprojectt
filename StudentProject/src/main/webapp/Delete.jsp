<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Front Page</title>
<link rel="stylesheet" href="Delete.css">
</head>

<body>

   
<h1>Managing Student Details</h1>

<fieldset class="main">

    <form action="DelServlet" method="Post">
    <label class="rn">RollNo</label> <br>
    <input class="tx" type="text" name="Rollno" placeholder="enter the rollno" required="required"> <br>

    <button>submit</button>

</form></fieldset>


</body>
</html>