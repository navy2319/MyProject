<%--
  Created by IntelliJ IDEA.
  User: scheffs
  Date: 5/9/2016
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!--Above is all bootstrap-->

    <link href="stylesheet1.css" rel="stylesheet">

    <title>Log in</title>
</head>

<body>

<div class="container">

    <br /><br />
    <FORM ACTION="j_security_check" METHOD="POST" class="form-horizontal">
        <TABLE class="form-group">
            <TR><TD class="control-label">User name: <INPUT TYPE="TEXT" NAME="j_username" class="text-field">
            <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password" class="text-field">
            <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In" class="btn btn-default">
        </TABLE>
    </FORM>
</div>

</body>
</html>