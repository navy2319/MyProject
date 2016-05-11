<%--
  Created by IntelliJ IDEA.
  User: scheffs
  Date: 5/9/2016
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap Core CSS -->
    <link href="stylesheet1.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Shep's - Add a New Post</title>
    <link rel="stylesheet" type="text/css" href="form_style.css" />
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