<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="logged" scope="page" value="${sessionScope.user.userId > 0}"/>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EYDOKIA - book a room</title>
        <link type="text/css" rel="stylesheet" 
              href="${pageContext.request.contextPath}/css/main.css" />
    </head>
    <body>
        <%@ include file="/WEB-INF/jspf/menu.jspf" %>
        <%@ include file="/WEB-INF/jspf/header.jspf" %>
            
        <h2 class="error-msg">${requestScope.errorMsg}</h2>
        <c:choose>
            
        <c:when test="${logged}">
            <p>Room:</p><select name="room_id" form="book_room">
                <c:forEach var="room" items="${requestScope.rooms_list}"> 
                    <option value="${room.roomId}">${room.name}</option>
                </c:forEach>
            </select>
            <p>Schedule:</p><select name="schedule_type_id" form="book_room">
                <c:forEach var="schedule_type" items="${requestScope.schedule_types_list}"> 
                    <option value="${schedule_type.scheduleTypeId}">${schedule_type.name}</option>
                </c:forEach>
            </select>
            <form action="${pageContext.request.contextPath}/book_room" method="post" id="book_room">
                <fieldset>
                    <p> 
                        <label for="startingDate" data-icon="sd">StartingDate (DD-MM-YYYY) </label><br>
                        <input type="date" id="startingDate" name="start_date" required="required" >
                    </p>
                    <p> 
                        <label for="endDate" data-icon="ed">EndingDate (DD-MM-YYYY)</label><br>
                        <input type="date" id="endDate" name="end_date" required="required" >
                    </p>
                    <p> 
                        <label for="startingTime" data-icon="st">StartingTime (HH:MM)</label><br>
                        <input type="time" id="startingTime" name="start_time" required="required" >
                    </p>
                    <p> 
                        <label for="endingTime" data-icon="et">EndingTIme (HH:MM)</label><br>
                        <input type="time" id="endingTime" name="end_time" required="required" >
                    </p>
                    <p> 
                        <label for="Description" data-icon="des">Descritpion</label><br>
                        <input type="text" id="Description" name="description" required="required" >
                    </p>
      
                    <input type="submit" name="book" value="Book" />
                </fieldset>
            </form>
            <%@ include file="/WEB-INF/jspf/room_entries.jspf" %>
        
        
        </c:when>
        
        <c:otherwise>
            
            <h1>You must be logged in to book a room.</h1>
            <p>Please login</p>
            <ul><li><a href="${path}/login">here</a></li></ul>
            <br />
                
        </c:otherwise>
        </c:choose>
            </body>
</html>

    
