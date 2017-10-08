<%-- 
    Document   : MainCategoryDiv
    Created on : Sep 28, 2017, 3:45:11 PM
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
        <link href="../asset/admin-css/sweetalert.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h3 class="alert alert-dismissible alert-info">Main Category Section</h3>
        <div class="container-fluid">
            <div class="col-lg-6">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Manage Main Category</h3>
                    </div>
                    <div class="panel-body">
                        <form id="mcm-view-form">
                            <div class="form-group">
                                <label class="control-label">Main Category Name</label>
                                <input type="text" class="form-control" name="mcm_name" id="mcm_name">
                            </div>
                            <div class="form-group">
                                <button class="btn btn-info" type="button" id="mcm-submit-btn">Add New</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Current Main Category</h3>
                    </div>
                    <div class="panel-body">
                        <table class="table" id="table">
                            <thead>
                            <th>Main Category Name</th>
                            </thead>
                            <tbody>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>

        <script src="../asset/admin-js/jquery-2.1.4.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="../asset/admin-js/custom.js"></script>
        <script src="../asset/admin-js/sweetalert.js"></script>
    </body>
</html>
