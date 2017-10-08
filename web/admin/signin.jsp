<%-- 
    Document   : signin
    Created on : Sep 26, 2017, 12:33:22 PM
    Author     : Chathura Buddhika <cbuddhika3@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../asset/admin-css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../asset/admin-css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="../asset/admin-css/custom-admin.css" rel="stylesheet" type="text/css"/>
        <title>Sign In</title>
    </head>
    <body>
        <div class="login-wrap" data-animate="fadeInUp">
            <div class="container-fluid">
                <div class="container-fluid">
                    <img src="../asset/admin-img/signin-logo.png" alt="Ware Me Slogan" class="login-slogan">
                </div>
                <form action="../user/login" method="POST">
                    <div class="form-group">
                        <select class="form-control" name="role">
                            <option>Administrator</option>
                            <option>Employee</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="User Name" name="name">
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Password" name="password">
                    </div>
                    <a href="#" class="align-center"><p>Forgot UserName Or Password!</p></a>
                    <div class="form-group align-center">
                        <button type="submit" class="btn btn-info">Sign In</button>
                    </div>
                </form>
            </div>
        </div>
        <script src="../asset/admin-js/jquery-2.1.4.js" type="text/javascript"></script>
    </body>
</html>
