<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-06
  Date: 30/11/18
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <style>
        .button {
            background-color: #4CAF50;
            width: 100%;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<a href="<c:url value="/"/>"><input type="button" class="button" value="Home"></a>
<a href="<c:url value="/addstudent"/>"><input type="button" class="button" value="Add Student"></a>
<a href="<c:url value="#"/>"><input type="button" class="button" value="Check Student details" data-toggle="modal" data-target="#myModal"></a>
<div class="modal" id="myModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title"><center>Check Student Details</center></h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <div class="modal-body">
                <form>
                    <table>
                        <tr><td>Enter Student Id </td>
                        </tr>
                        <tr>
                            <td><input type="text" name="id" ></td>
                        </tr>
                        <tr>
                            <td>
                                <a href="<c:url value="#"/>"><input type="submit" value="Check"></a>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>


            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
            </div>

        </div>
    </div>
</div>

</body>
</html>
