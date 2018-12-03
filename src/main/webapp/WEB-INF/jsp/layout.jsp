<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 26/11/18
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title" ignore="true"/></title>
    <style>
        .sidenav {
            float: left;
            padding: 10px;
            width: 20%;
            height: 70%;
            z-index: 1;
            top: 5%;
            bottom: 5%;
            background-color: whitesmoke;
            overflow-x: hidden;
            padding-top: 20px;
            border-right: 1px double green;
        }

        .header {
            left: 0;
            bottom: 0;
            background-color: whitesmoke;
            color: white;
            padding: 15px;
        }

        .main {
            padding: 15px;
            width: 79%;
            height: 70%;
            border-left: 1px double green;
            overflow: scroll;
        }

        .footer {
            background-color: #555;
            color: white;
            padding: 12px;
            width: 100%;
            text-align: center;
        }
    </style>
</head>
<body>
<div>

    <div class="header">
        <tiles:insertAttribute name="header"/>
    </div>

    <div class="sidenav">
        <tiles:insertAttribute name="menu"/>
    </div>

    <div class="main">
        <tiles:insertAttribute name="body"/>
    </div>

    <div class="footer">
        <tiles:insertAttribute name="footer"/>
    </div>

</div>
</body>
</html>