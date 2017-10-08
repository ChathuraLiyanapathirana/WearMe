<%-- 
    Document   : home
    Created on : Sep 19, 2017, 7:15:47 PM
    Author     : Chathura Buddhika <cbuddhika3@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700' rel='stylesheet' type='text/css'>

        <!-- css reset -->
        <link rel="stylesheet" href="../asset/admin-css/reset.css"> 
        <!-- bootstrap style -->
        <link href="../asset/admin-css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- Resource style -->
        <link rel="stylesheet" href="../asset/admin-css/style.css"> 
        <!-- Custom style -->
        <link href="../asset/admin-css/custom-admin.css" rel="stylesheet" type="text/css"/>
        <!-- Sweet style -->
        <link href="../asset/admin-css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <!-- Modernizer -->
        <script src="../asset/admin-js/modernizr.js"></script> 
        <!-- Data Table Design-->
        <script src="../asset/admin-css/jquery-table/bootstrap-table.css"></script> 

        <title>Wear Me</title>
    </head>
    <body>
        <header class="cd-main-header">
            <a href="#0" class="cd-logo"><img src="image/logo.png" alt="Logo"></a>

            <!-- cd-search -->
            <div class="cd-search is-hidden">
                <form action="#0">
                    <input type="search" placeholder="Search...">
                </form>
            </div>

            <a href="#0" class="cd-nav-trigger"><span></span></a>

            <nav class="cd-nav">
                <ul class="cd-top-nav">
                    <li><a href="#0">Tour</a></li>
                    <li><a href="#0">Support</a></li>
                    <li class="has-children account">
                        <a href="#0">
                            <img src="img/cd-avatar.png" alt="">
                            ${logedUser.name}
                        </a>
                        <ul>
                            <li><a href="#0">My Account</a></li>
                            <li><a href="#0">Edit Account</a></li>
                            <li><a href="#0">Logout</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </header>
        <!-- .cd-main-header -->

        <main class="cd-main-content">
            <nav class="cd-side-nav">
                <ul>
                    <li class="cd-label">Main Menu</li>

                    <li class="has-children">
                        <a href="#0">Order</a>
                        <ul>
                            <li><a href="#0">UpComing<span class="count">3</span></a></li>
                            <li><a href="#0">OnGoing</a></li>
                            <li><a href="#0">Completed</a></li>
                        </ul>
                    </li>

                    <li class="has-children">
                        <a href="#0">Category</a>
                        <ul>
                            <li><a href="#0" id="mcm-view-btn">Main Category</a></li>
                            <li><a href="#0" id="scm-view-btn">Sub Category</a></li>
                            <li><a href="#0" id="gm-view-btn">Garment</a></li>
                        </ul>
                    </li>

                    <li class="has-children comments">
                        <a href="#0" id="brand-view-btn">Brand</a>
                    </li>
                    <li class="has-children comments">
                        <a href="#0" id="offer-view-btn">Offer</a>
                    </li>
                </ul>

                <ul>
                    <li class="cd-label">Secondary</li>
                    <li class="has-children bookmarks">
                        <a href="#0">Bookmarks</a>

                        <ul>
                            <li><a href="#0">All Bookmarks</a></li>
                            <li><a href="#0">Edit Bookmark</a></li>
                            <li><a href="#0">Import Bookmark</a></li>
                        </ul>
                    </li>
                    <li class="has-children images">
                        <a href="#0">Images</a>

                        <ul>
                            <li><a href="#0">All Images</a></li>
                            <li><a href="#0">Edit Image</a></li>
                        </ul>
                    </li>

                    <li class="has-children users">
                        <a href="#0">Users</a>

                        <ul>
                            <li><a href="#0">All Users</a></li>
                            <li><a href="#0">Edit User</a></li>
                            <li><a href="#0">Add User</a></li>
                        </ul>
                    </li>
                </ul>

                <ul>
                    <li class="cd-label">Action</li>
                    <li class="action-btn"><a href="#0">+ Button</a></li>
                </ul>
            </nav>

            <div class="content-wrapper">

                <!--Main category Hidden Panel-->
                <div class="container-fluid" id="mcm-div">
                    <h3 class="alert alert-dismissible alert-info">Main Category Section</h3>
                    <div class="container-fluid">
                        <div class="col-lg-5">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Add New Main Category</h3>
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
                        <div class="col-lg-7">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Current Main Category</h3>
                                </div>
                                <div class="panel-body">
                                    <table class="table table-striped table-bordered" id="mcm-table">
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
                </div>

                <!--Sub category Hidden Panel-->
                <div class="container-fluid" id="scm-div">
                    <h3 class="alert alert-dismissible alert-info">Sub Category Section</h3>
                    <div class="container-fluid">
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Manage Sub Category</h3>
                                </div>
                                <div class="panel-body">
                                    <form id="scm-view-form">
                                        <div class="form-group">
                                            <label class="control-label">Main Category Name</label>
                                            <select name="mcm_name" class="form-control" id="mcm-name-combo">
                                                <button>+</button>
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Sub Category Name</label>
                                            <input type="text" class="form-control" name="scm_name" id="scm_name">
                                        </div>
                                        <div class="form-group">
                                            <button class="btn btn-info" type="button" id="scm-submit-btn">Confirm Add</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Sub Category Detail</h3>
                                </div>
                                <div class="panel-body">
                                    <select id="scm-mcm-name"></select>
                                    <table class="table" id="scm-table">
                                        <thead>
                                        <th>Sub Category Name</th>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!--Offer Hidden Panel-->
                <div class="container-fluid" id="offer-div">
                    <h3 class="alert alert-dismissible alert-info">Offer Section</h3>
                    <div class="container-fluid">
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Add New Offer</h3>
                                </div>
                                <div class="panel-body">
                                    <form id="mcm-view-form">
                                        <div class="form-group">
                                            <label class="control-label">Offer Name</label>
                                            <input type="text" class="form-control" name="offer_name" id="offer_name">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Offer Value<i>(without '%' sign)</i></label>
                                            <input type="text" class="form-control" name="offer_value" id="offer_value">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Offer Start Date</label>
                                            <input type="text" class="form-control" name="start_date" id="start_date">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Offer End Date</label>
                                            <input type="text" class="form-control" name="end_date" id="end_date">
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Minimum Order Price</label>
                                            <input type="text" class="form-control" name="unit_count" id="unit_count">
                                        </div>
                                        <div class="form-group">
                                            <button class="btn btn-info" type="button" id="offer-submit-btn">Add New</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Current Offer List</h3>
                                </div>
                                <div class="panel-body">
                                    <table class="table" id="offer-table">
                                        <thead>
                                        <th>Offer Name</th>
                                        <th>Start Date</th>
                                        <th>End Date</th>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!--Brand Hidden Panel-->
                <div class="container-fluid" id="brand-div">
                    <h3 class="alert alert-dismissible alert-info">Brand Section</h3>
                    <div class="container-fluid">
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Add New Brand</h3>
                                </div>
                                <div class="panel-body">
                                    <form id="brand-view-form">
                                        <div class="form-group">
                                            <label class="control-label">Brand Name</label>
                                            <input type="text" class="form-control" name="brand_name" id="brand_name">
                                        </div>
                                        <div class="form-group">
                                            <button class="btn btn-info" type="button" id="brand-submit-btn">Add New</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Current Brands</h3>
                                </div>
                                <div class="panel-body">
                                    <table class="table table-striped table-bordered" id="brand-table">
                                        <thead>
                                        <th>Brand Name</th>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!--Garment Hidden Panel-->
                <div class="container-fluid" id="garment-div">
                    <h3 class="alert alert-dismissible alert-info">Garment Item Section</h3>
                    <div class="container-fluid">
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Add New Garment Item</h3>
                                </div>
                                <div class="panel-body">
                                    <form id="mcm-view-form">
                                        <div class="form-group">
                                            <label class="control-label">Main Category Name</label>
                                            <select name="mcm_name"></select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Sub Category Name Name</label>
                                            <select name="scm_name"></select>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label">Garment Item Name</label>
                                            <input type="text" class="form-control" name="garment_name" id="garment_name">
                                        </div>
                                        <div class="form-group">
                                            <button class="btn btn-info" type="button" id="garment-submit-btn">Add New</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="panel panel-primary">
                                <div class="panel-heading">
                                    <h3 class="panel-title">Current Garments</h3>
                                </div>
                                <div class="panel-body">
                                    <table class="table" id="brand-table">
                                        <thead>
                                        <th>Garment</th>
                                        <th>Sub Category</th>
                                        <th>Main Category</th>
                                        </thead>
                                        <tbody>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>



                <!--Modal Design Area-->

                <!--Main Category Manage Pop Up Modal-->
                <div class="modal fade" id="mcm-manage-modal">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                <h4 class="modal-title">Manage Main Category</h4>
                            </div>
                            <div class="modal-body">
                                <form id="mcm-update-form">
                                    <div class="form-group">
                                        <label class="control-label">Main Category Name</label>
                                        <input type="text" class="form-control" name="mcm_name" id="mcm_name" readonly>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Replace Name</label>
                                        <input type="text" class="form-control" name="mcm_new_name" id="mcm_new_name">
                                    </div>
                            </div>
                            <div class="modal-footer">
                                <button type="reset" class="btn btn-warning" id="mcm-update-btn">Update</button>
                                <button type="reset" class="btn btn-danger" id="mcm-delate-btn">Delete</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>

                <!--Brand Manage Pop Up Modal-->
                <div class="modal fade" id="brand-manage-modal">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                <h4 class="modal-title">Manage Brand</h4>
                            </div>
                            <div class="modal-body">
                                <form id="brand-update-form">
                                    <div class="form-group">
                                        <label class="control-label">Brand Name</label>
                                        <input type="text" class="form-control" name="brand_name" id="brand_name">
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label">Replace Name</label>
                                        <input type="text" class="form-control" name="brand_new_name" id="brand_new_name">
                                    </div>
                            </div>
                            <div class="modal-footer">
                                <button type="reset" class="btn btn-warning" id="brand-update-btn">Update</button>
                                <button type="reset" class="btn btn-danger" id="brand-delate-btn">Delete</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>


            </div> 
            <!-- .content-wrapper -->
        </main>
        <!-- .cd-main-content -->

        <!--scripts goes here-->
        <script src="../asset/admin-js/jquery-2.1.4.js"></script>
        <script src="../asset/admin-js/jquery.menu-aim.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="../asset/admin-js/main.js"></script>
        <script src="../asset/admin-js/custom.js"></script>
        <script src="../asset/admin-js/jquery-table/jquery-table-js.js"></script>
        <script src="../asset/admin-js/jquery-table/table-bootstrap.js"></script>
        <script src="../asset/admin-js/sweetalert.js"></script>
    </body>
</html>

