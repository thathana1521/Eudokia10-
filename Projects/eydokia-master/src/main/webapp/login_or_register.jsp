

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/LoginRegister/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/LoginRegister/style.css" />
        <link rel="stylesheet" type="text/css" href="css/LoginRegister/animate-custom.css" />
    </head>
    <body>
        <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
        <div class="container">
            
            <header>
                <h1>Login and Registration Form</h1>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                             <form action="${pageContext.request.contextPath}/login" method="post" autocomplete="on">
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your username </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
                                    <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
                                    <label for="loginkeeping">Keep me logged in</label>
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
                                </p>
                                <p class="change_link">
                                    Not a member yet ?
                                    <a href="#toregister" class="to_register">Join us</a>
                                </p>
                            </form>
                        </div>
                            
                        
                        <div id="register" class="animate form">
                            <form action="${pageContext.request.contextPath}/register" method="post" autocomplete="on">
                                
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="fullnamesignup" data-icon="fn">Your Full Name</label><br>
                                    <input type="text" id="fullnamesignup" name="fullnamesignup" required="required" placeholder="eg. Al Pacino">
                                </p>
                                <p> 
                                    <label for="phone" data-icon="fn">Phone</label><br>
                                    <input type="text" id="phone" name="phone" required="required" placeholder="eg. 6900000001">
                                </p>
                                <p> 
                                    <label for="infosignup" data-icon="fn">Extra Info</label><br>
                                    <input type="text" id="infosignup" name="infosignup" required="required" placeholder="Extra information">
                                </p>
                                <p class="signin button"> 
                                    <input type="submit" value="Sign up"/> 
                                </p>
                                <p class="change_link">  
                                    Already a member ?
                                    <a href="login" class="to_register"> Go and log in </a>
                                </p>
                            </form>
                        </div>
                            
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>
