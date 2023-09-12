<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="Update.css">
</head>
<body>

<h1>Update Student Details</h1>

    <fieldset>
        <form action="UpdateServ" method="Post">

            <label class="rn">RollNo</label> <br>
            <input class="tr" type="text" name="Rollno" placeholder="enter the rollnumber" required="required"> <br>
            <label class="mk">Marks</label> <br>
            <input class="tm" type="text" name="Marks" placeholder="enter the marks" required="required"> <br>

            <button>Update</button>
        </form>


    </fieldset>


</body>
</html>