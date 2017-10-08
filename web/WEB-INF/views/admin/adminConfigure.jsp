<%-- 
    Document   : adminConfigure
    Created on : Sep 27, 2017, 9:58:23 AM
    Author     : Chathura Buddhika <cbuddhika3@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../asset/admin-css/reset.css" rel="stylesheet" type="text/css"/>
        <link href="../asset/admin-css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../asset/admin-css/custom-admin.css" rel="stylesheet" type="text/css"/>
        <title>Administrator Configuration</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="col-lg-3"></div>
            <div class="col-lg-6">
                <img src="../asset/admin-img/signin-logo.png" alt="Somethig goes wrong">
                <h1>You're Welcome!</h1>
                <h5>Please setup your sign up detail.</h5>
                <form action="../user/register" method="POST">
                    <div class="form-group">
                        <label class="control-label">User Name</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label class="control-label">User Role</label>
                        <input type="text" class="form-control" name="role">
                    </div>
                    <div class="form-group">
                        <label class="control-label">Email</label>
                        <input type="email" class="form-control" name="email">
                    </div>
                    <div class="form-group">
                        <label class="control-label">Password</label>
                        <input type="password" class="form-control">
                    </div>
                    <div class="form-group">
                        <label class="control-label">Confirm Password</label>
                        <input type="password" class="form-control" name="password">
                    </div>
                    <div>
                        <button class="tn btn-info" type="submit">Configure</button>
                    </div>
                </form>
            </div>
            <div class="col-lg-3"></div>
        </div>
        <script src="../asset/admin-js/jquery-2.1.4.js" type="text/javascript"></script>
    </body>
</html>
