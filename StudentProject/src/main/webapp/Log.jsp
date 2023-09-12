<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="Log.css">


<script type="text/javascript">
        function Validate(){
            
            var user=document.getElementById("Uname").value;
                var password=document.getElementById("Pass").value;
            if(user=="")
            {
                alert("Enter the User Id");
                 return false;// if we dont write return statement it will true for both if we leave blank for both the fields
            }
         
            if(password=="")
            {
                 alert("Enter the Password");
              return true;
            }
            
        }
       
        </script>


</head>
<body>

<fieldset>

        <form action="./LogServlet" method="Post" onsubmit="return Validate();">

        <p class="line">Login</p>

        <div class="name">
        <label class="un">Username</label> <br>
        <input type="text" name="Uname" id="Uname" placeholder="Type your username"> <br>
        </div>

        <div class="pass">
        <label class="pw">Password</label> <br>
        <input type="password" name="Pass" id="Pass" onsubmit="return Validate();" placeholder="Type your password">
        </div>

        <div class="forgot">
        <p class="forgot">Forgot password?</p> <br>
        </div>

        <button class="button">Login</button>
    
    </form>
</fieldset>

</body>
</html>