<%-- 
    Document   : index
    Created on : May 15, 2018, 7:19:02 PM
    Author     : shimaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="${cp}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/form-elements.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/css/style.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="${cp}/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    </head>

    <body >
        <div class="top-content">
            <div class="inner-bg " >
                <div class="container" >
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 form-box" >
                            <div class="form-top">
                                <div class="form-top-left">
                                    <img src="${cp}/resources/image/Spectralogo.jpg " width="400">
                                    <h2>Welcome to Spectra Technologies Company </h2>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-home"></i>
                                </div>

                                <div>
                                    <div class="col-sm-4">
                                        <a href="/WebTicketRevamp/login" class="d-block mb-4 h-100"> <img class="img-fluid img-thumbnail  "  src="${cp}/resources/image/Login.jpg " ></a>
                                    </div>
                                    <div class="col-sm-4">
                                        <a href="/WebTicketRevamp/ChooseLang" class="d-block mb-4 h-100" ><img class="img-fluid img-thumbnail "  src="${cp}/resources/image/ProblemSub.jpg "></a>
                                    </div>
                                    <div class="col-sm-4 ">
                                        <a href="/WebTicketRevamp/LiveChat"  class="d-block mb-4 h-100" > <img  class="img-fluid img-thumbnail "src="${cp}/resources/image/LiveChat.png " ></a>

                                    </div>
                                </div>

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
