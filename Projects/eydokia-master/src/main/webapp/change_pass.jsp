<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
       
        <title>Change Password Form (With Validation)</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
            
        </style>
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
        
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <h1>Change Password</h1>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3">
                    <p class="text-center">Use the form below to change your password.</p>
                    <form method="post" id="passwordForm">
                        
                        <input type="password" class="input-lg form-control" name="old_password" id="old_password" placeholder="Old Password" autocomplete="off">
                        <input type="password" class="input-lg form-control" name="password" id="password1" placeholder="New Password" autocomplete="off">
                        
                        
                        <input type="password" class="input-lg form-control" name="_password" id="password2" placeholder="Repeat Password" autocomplete="off">
                        <div class="row">
                            <div class="col-sm-12">
                                <span id="pwmatch" class="glyphicon glyphicon-remove" style="color:#FF0004;"></span> Passwords Match
                            </div>
                        </div>
                        <input type="submit" class="col-xs-12 btn btn-primary btn-load btn-lg" name="change_password" data-loading-text="Changing Password..." value="Change Password">
                    </form>
                </div><!--/col-sm-6-->
            </div><!--/row-->
        </div>
        <script type="text/javascript">
            $("input[type=password]").keyup(function(){
                var ucase = new RegExp("[A-Z]+");
                var lcase = new RegExp("[a-z]+");
                var num = new RegExp("[0-9]+");
              
                
                if($("#password1").val() == $("#password2").val()){
                    $("#pwmatch").removeClass("glyphicon-remove");
                    $("#pwmatch").addClass("glyphicon-ok");
                    $("#pwmatch").css("color","#00A41E");
                }else{
                    $("#pwmatch").removeClass("glyphicon-ok");
                    $("#pwmatch").addClass("glyphicon-remove");
                    $("#pwmatch").css("color","#FF0004");
                }
            });
        </script>

    </body>
</html>
