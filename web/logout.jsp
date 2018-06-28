<%-- 
    Document   : logout
    Created on : 16 Apr, 2017, 2:29:21 PM
    Author     : Mayank Jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% session.invalidate();
   response.sendRedirect("index.html");
%>