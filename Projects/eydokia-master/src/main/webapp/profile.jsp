<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="logged" scope="page" value="${sessionScope.user.userId > 0}"/>
<c:set var="path" scope="page" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    
        <head>
            
        <meta charset="UTF-8">
            
        <title>Profile</title>
            
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link type="text/css" rel="stylesheet" 
              href="${pageContext.request.contextPath}/css/prof.css" />
        <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        
    </head>
    
    <%@ include file="/WEB-INF/jspf/menu.jspf" %>
    <%@ include file="/WEB-INF/jspf/header.jspf" %>
    <c:choose>
        
        <c:when test="${logged}">
            
            <body>
                <div class="container">
                    <div class="row">
                        
                        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
                            
                            
                            <div class="panel panel-info">
                                <div class="panel-heading">
                                    <h3 class="panel-title"> <a> ${sessionScope.user.fullName}</a></h3>
                                        
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="Images/profile.svg" class="img-circle img-responsive"> </div>
                                        
                                        <div class=" col-md-9 col-lg-9 "> 
                                            <table class="table table-user-information">
                                                <tbody>
                                                    
                                                    <tr>
                                                        <td>Email</td>
                                                        <td><a> ${sessionScope.user.email}</a></td>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td>Phone Number</td>
                                                        <td><a> ${sessionScope.user.phone}</a>
                                                        </td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td>Extra Information</td>
                                                        <td><a> ${sessionScope.user.extraInfo}</a></td>
                                                    </tr>
                                                        
                                                </tbody>
                                            </table>
                                            
                                            <a href="${path}/change_password" class="btn btn-primary">Change Password?</a>
                                        </div>
                                    </div>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
                <script src="${pageContext.request.contextPath}/js/prof.js"></script>
            </body>
            
        </c:when>
        
        <c:otherwise>
            
            <h1>You must be logged in to check your profile.</h1>
            <p>Please login</p>
            <ul>
                <li><a href="${path}/login">here</a></li>
            </ul>
            <br />
            
        </c:otherwise>
    </c:choose>
    
    
</html>