<%-- 
    Document   : newjsp
    Created on : May 15, 2018, 7:20:42 PM
    Author     : shimaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="${cp}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/form-elements.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        
        
               <script src="${cp}/resources/bootstrap/js/glm-ajax.js" type="text/javascript"></script>
    <a href="${cp}/resources/bootstrap/fonts/glyphicons-halflings-regular.svg"></a>
    <link href="${cp}/resources/bootstrap/css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
    <link href="${cp}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <link href="${cp}/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
    <link href="${cp}/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
    <link href="${cp}/resources/bootstrap/css/mstyle.css" rel="stylesheet" type="text/css"/>
    <script src="${cp}/resources/bootstrap/jquery-1.12.0.min.js" type="text/javascript"></script>
    <script src="${cp}/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="${cp}/resources/bootstrap/js/npm.js" type="text/javascript"></script>
    <script src="${cp}/resources/bootstrap/js/bootstrap.js" type="text/javascript"></script>
    <link href="${cp}/resources/bootstrap/MyCss.css" rel="stylesheet" type="text/css"/>

        <style>
            header{
                border: 3px solid #ddd;  
            }

        </style>
    </head>
    <body>
        <%
            HttpSession se = request.getSession();

            String n = (String) se.getAttribute("Uname");
            String pass = (String) se.getAttribute("pass");
            se.setAttribute("name", n);

        %>

        <header >
            <img src="${cp}/resources/image/Spectralogo.jpg " width="200">
            <b>Welcome <% out.print(n);%> </b>
        </header>

        <%--
        <div class="page-header bg-grey">
            <img src="Image/Spectralogo.jpg " width="200">
            img {
    border: 1px solid #ddd;
    border-radius: 4px;
    padding: 5px;
    width: 200px;
    
}
        </div> 
    
        --%>

