<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <h1>Register Page</h1>
    
    <fieldset>
        <legend>Login</legend>
    <form action="RegLogServlet" method="Post">
        <label>Username</label><br>
        <input type="text" name="Uname" required="required" placeholder="Enter Username"><br>
        <label>Password</label><br>
        <input type="password" name="Pass" required="required" placeholder="Enter Password"><br>
        <label>Email</label><br>
        <input type="email" name="Email" required="required" placeholder="Enter email"><br>
        <label>Phone Number</label><br>
        <input type="number" name="Phone" required="required" placeholder="Enter number"><br>
        <label>Gender</label><br>
        <input type="text" name="Gender" placeholder="Enter gender"> <br>
        <label>UserType</label> <br>
        <input type="text" name="Utype" placeholder="Entre the UserType"> <br>
        <input type="submit" value="register"> 
        <input type="reset" name="reset"><br>
        
        <a href="" Target="blank"><small>forgot password</small></a>
                
    </form></fieldset>

</body>
</html>