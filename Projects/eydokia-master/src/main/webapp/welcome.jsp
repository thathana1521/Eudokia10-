<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%--<c:redirect url="/register" />--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eydokia</title>
        <link type="text/css" rel="stylesheet" 
              href="${pageContext.request.contextPath}/css/Accordion.css" />
        
       
    </head>
    <body>
        
        <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
        <h1>Welcome to Eudokia!</h1>
        
        <button class="accordion">Aithousa A</button>
        <div class="panel">
            <p>Xaraktiristika aithousas A</p>
            
        </div>
        <script src="${pageContext.request.contextPath}/js/Accordion/accordion.js"></script>
        
    </body>
</html>
