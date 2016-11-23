<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>

<c:if test="${sessionScope.user.userId > 0}" >
    <!-- don't let someone logged in to login/register -->
    <c:redirect url="/profile?username=${sessionScope.user.username}" />
</c:if>

<!DOCTYPE html>
<html>
    
    <head>
        
        <link rel="stylesheet" type="text/css" href=${pageContext.request.contextPath}"mystyle.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EYDOKIA - login or register</title>
        <link type="text/css" rel="stylesheet" 
              href="${pageContext.request.contextPath}/css/Menu.css" />
    </head>
    
    <body>

        <ul class="topnav" id="myTopnav">
            <li><a href="#home">Home</a></li>
            <li><a href="#calendar">Calendar</a></li>
            <li><a href="#register">Register</a></li>
            <li><a href="#login">Login</a></li>
            <li class="icon">
                <a href="javascript:void(0);" onclick="myFunction()">&#9776;</a>
            </li>
        </ul>
        <script src="${pageContext.request.contextPath}/js/menu/menu.js"></script>
        
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
        <h2 class="error-msg">${requestScope.errorMsg}</h2>
        
        <h1>Register:</h1>
        <form action="${pageContext.request.contextPath}/register" method="post">
            <fieldset>
                <input type="text" name="username" placeholder="Username" />
                <input type="email" name="email" placeholder="Email" />
                <input type="password" name="password" placeholder="Password" />
                <input type="password" name="_password" placeholder="Password again" />
                <input type="text" name="full_name" placeholder="Full name" />
                <input type="tel" name="phone" placeholder="Phone" />
                <input type="text" name="extra_info" placeholder="Additional infos" />
                <input type="submit" name="register" value="Register" />
            </fieldset>
        </form>
        
        <div class="vertical-line"></div>
        <h1>Login:</h1>
        <form action="${pageContext.request.contextPath}/login" method="post">
            <fieldset>
                <input type="text" name="username" placeholder="Username" />
                <input type="password" name="password" placeholder="Password" />
                <input type="checkbox" name="remember" />Remember me?
                <input type="submit" name="login" value="Login" />
            </fieldset>
        </form>
    </body>
</html>
