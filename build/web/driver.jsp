<%-- 
    Document   : driver
    Created on : 15 Apr, 2017, 9:35:04 PM
    Author     : Mayank Jain
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%! Connection con; %>
<% Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sis","root","mayank");
    %>
