<%-- 
    Document   : Login
    Created on : May 16, 2018, 12:05:08 AM
    Author     : shimaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />
<!DOCTYPE html>
<html>
    <head>
        <link href="${cp}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/form-elements.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>


    </head>
    <body >



        <div class="top-content">
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <img src="${cp}/resources/image/Spectralogo.jpg " width="400">
                                    <h3>Login to our site</h3>

                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-key"></i>
                                </div>
                            </div>

                            <div class="form-bottom">
                                <form:form action="Login" Method ="POST" class="login-form">
                                    <div class="form-label-group">
                                        <label class="sr-only"  >Username</label>
                                        <form:input type="text" name="username" placeholder="Username..." class="form-username form-control" id="form-username">
                                    </div>
                                    <br>
                                    <div class="form-label-group">
                                        <label class="sr-only" >Password</label>
                                        <form:input type="password" name="password" placeholder="Password..." class="form-password form-control" id="form-password">
                                    </div>
                                    <br>
                                    <button type="submit" class="btn btn-lg btn-primary btn-block">Sign in!</button>

                                </form:form>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </div>

        <!-- Javascript -->
        <script src="${cp}/resources/js/jquery-1.11.1.min.js"></script>
        <script src="${cp}/resources/bootstrap/js/bootstrap.min.js"></script>
        <script src="${cp}/resources/js/jquery.backstretch.min.js"></script>
        <script src="${cp}/resources/js/scripts.js"></script>
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->




    </body>
</html>
