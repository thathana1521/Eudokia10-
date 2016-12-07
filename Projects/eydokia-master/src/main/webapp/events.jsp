<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%= getEvents(request) %>
<%@ page import="com.dhtmlx.planner.*,com.dhtmlx.demo.*" %>
<%!
    String getEvents(HttpServletRequest request) throws Exception {
    EventsManager evs = new EventsManager(request);
    return evs.run();
  }
%>
