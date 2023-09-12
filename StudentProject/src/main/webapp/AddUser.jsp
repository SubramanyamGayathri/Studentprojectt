<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD USER</title>
 <link rel="stylesheet" href="AddUser.css">
</head>
<body>

   
<p class="headline">Add Users</p>

<fieldset>

    <form action="AddServlet" method ="Post">

        <label class="U">Sname</label> <br>
        <input class="A1" type="text" name="Sname" placeholder="enter your name" required="required"> <br>
        <label class="B">Branch</label> <br>
        <input class="A1" type="text" name="Branch" placeholder="enter your branch" required="required"> <br>
        <label class="R">Rollno</label> <br>
        <input class="A1" type="text" name="Rollno" placeholder="enter your rollno" required="required"> <br>
        <label class="M">Marks</label> <br>
        <input class="A1" type="text" name="Marks" placeholder="enter your marks" required="required"> <br>

        <button>ADD</button>


    </form>

</fieldset>

</body>
</html>