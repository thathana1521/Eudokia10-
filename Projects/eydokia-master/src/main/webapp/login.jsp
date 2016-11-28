<%-- 
    Document   : login
    Created on : Nov 28, 2016, 6:35:13 PM
    Author     : tom
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    
    </head>
    <body>
        <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <form action="${pageContext.request.contextPath}/login" method="post">
        <form action="action_page.php">
            
            <div class="container">
                <label><b>Username</b></label>
                <input type="text" placeholder="Enter Username" name="uname" required>
        
                <label><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required>
        
                <button type="submit">Login</button>
                <input type="checkbox" checked="checked"> Remember me
            </div>
      
            <div class="container" style="background-color:#f1f1f1">
                <button type="button" class="cancelbtn">Cancel</button>
                <span class="psw">Forgot <a href="#">password?</a></span>
            </div>
        </form>
    </body>
</html>
