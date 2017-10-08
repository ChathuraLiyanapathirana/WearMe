<%-- 
    Document   : register
    Created on : Sep 21, 2017, 2:01:58 PM
    Author     : Chathura Buddhika <cbuddhika3@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../asset/client-css/font-awesome.css" rel="stylesheet">
        <link href="../asset/client-css/bootstrap.min.css" rel="stylesheet">
        <link href="../asset/client-css/animate.min.css" rel="stylesheet">
        <link href="../asset/client-css/owl.carousel.css" rel="stylesheet">
        <link href="../asset/client-css/owl.theme.css" rel="stylesheet">

        <!-- theme stylesheet -->
        <link href="../asset/client-css/style.default.css" rel="stylesheet" id="theme-stylesheet">

        <!-- your stylesheet with modifications -->
        <link href="../asset/client-css/custom.css" rel="stylesheet">

        <title>Wear Me</title>
    </head>
    <body>
        <div id="top">
            <div class="container">
                <div class="col-md-6 offer" data-animate="fadeInDown">
                    <a href="#" class="btn btn-danger btn-sm" data-animate-hover="pulse">Offer of the day</a>  <a href="#">Get flat 35% off on orders over $50!</a>
                </div>
                <div class="col-md-6" data-animate="fadeInDown">
                    <ul class="menu">
                        <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                        </li>
                        <li><a href="register.jsp">Register</a>
                        </li>
                        <li><a href="contact.html">Contact</a>
                        </li>
                        <li><a href="#">Recently viewed</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="Login" aria-hidden="true">
                <div class="modal-dialog modal-sm">

                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                            <h4 class="modal-title" id="Login">Customer login</h4>
                        </div>
                        <div class="modal-body">
                            <form action="customer-orders.html" method="post">
                                <div class="form-group">
                                    <input type="text" class="form-control" id="email-modal" placeholder="email">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" id="password-modal" placeholder="password">
                                </div>

                                <p class="text-center">
                                    <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Log in</button>
                                </p>

                            </form>

                            <p class="text-center text-muted">Not registered yet?</p>
                            <p class="text-center text-muted"><a href="register.html"><strong>Register now</strong></a>! It is easy and done in 1&nbsp;minute and gives you access to special discounts and much more!</p>

                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!-- *** TOP BAR END *** -->

        <!-- *** NAVBAR ***-->

        <div class="navbar navbar-default yamm" role="navigation" id="navbar">
            <div class="container">
                <div class="navbar-header">

                    <a class="navbar-brand home" href="index.html" data-animate-hover="swing">
                        <img src="img/logo.png" alt="Wear Me" class="hidden-xs">
                        <img src="img/logo-small.png" alt="Obaju logo" class="visible-xs"><span class="sr-only">Obaju - go to homepage</span>
                    </a>
                    <div class="navbar-buttons">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                            <span class="sr-only">Toggle navigation</span>
                            <i class="fa fa-align-justify"></i>
                        </button>
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                            <span class="sr-only">Toggle search</span>
                            <i class="fa fa-search"></i>
                        </button>
                        <a class="btn btn-default navbar-toggle" href="basket.html">
                            <i class="fa fa-shopping-cart"></i>  <span class="hidden-xs">3 items in cart</span>
                        </a>
                    </div>
                </div>
                <!--/.navbar-header -->

                <div class="navbar-collapse collapse" id="navigation">

                    <ul class="nav navbar-nav navbar-left">
                        <li class="active"><a href="index.html">Home</a>
                        </li>
                        <li class="dropdown yamm-fw">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Men <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="yamm-content">
                                        <div class="row">
                                            <div class="col-sm-3">
                                                <h5>Clothing</h5>
                                                <ul>
                                                    <li><a href="category.html">T-shirts</a>
                                                    </li>
                                                    <li><a href="category.html">Shirts</a>
                                                    </li>
                                                    <li><a href="category.html">Pants</a>
                                                    </li>
                                                    <li><a href="category.html">Accessories</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <h5>Shoes</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <h5>Accessories</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <h5>Featured</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                </ul>
                                                <h5>Looks and trends</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.yamm-content -->
                                </li>
                            </ul>
                        </li>

                        <li class="dropdown yamm-fw">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Ladies <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="yamm-content">
                                        <div class="row">
                                            <div class="col-sm-3">
                                                <h5>Clothing</h5>
                                                <ul>
                                                    <li><a href="category.html">T-shirts</a>
                                                    </li>
                                                    <li><a href="category.html">Shirts</a>
                                                    </li>
                                                    <li><a href="category.html">Pants</a>
                                                    </li>
                                                    <li><a href="category.html">Accessories</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <h5>Shoes</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <h5>Accessories</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                    <li><a href="category.html">Casual</a>
                                                    </li>
                                                </ul>
                                                <h5>Looks and trends</h5>
                                                <ul>
                                                    <li><a href="category.html">Trainers</a>
                                                    </li>
                                                    <li><a href="category.html">Sandals</a>
                                                    </li>
                                                    <li><a href="category.html">Hiking shoes</a>
                                                    </li>
                                                </ul>
                                            </div>
                                            <div class="col-sm-3">
                                                <div class="banner">
                                                    <a href="#">
                                                        <img src="img/banner.jpg" class="img img-responsive" alt="">
                                                    </a>
                                                </div>
                                                <div class="banner">
                                                    <a href="#">
                                                        <img src="img/banner2.jpg" class="img img-responsive" alt="">
                                                    </a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- /.yamm-content -->
                                </li>
                            </ul>
                        </li>

                    </ul>
                    </li>
                    </ul>

                </div>
                <!--/.nav-collapse -->

                <div class="navbar-buttons">

                    <div class="navbar-collapse collapse right" id="basket-overview">
                        <a href="basket.html" class="btn btn-primary navbar-btn"><i class="fa fa-shopping-cart"></i><span class="hidden-sm">3 items in cart</span></a>
                    </div>
                    <!--/.nav-collapse -->

                    <div class="navbar-collapse collapse right" id="search-not-mobile">
                        <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                            <span class="sr-only">Toggle search</span>
                            <i class="fa fa-search"></i>
                        </button>
                    </div>

                </div>

                <div class="collapse clearfix" id="search">

                    <form class="navbar-form" role="search">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search">
                            <span class="input-group-btn">

                                <button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

                            </span>
                        </div>
                    </form>

                </div>
                <!--/.nav-collapse -->
            </div>
            <!-- /.container -->
        </div>

        <div class="container-fluid" data-animate="fadeIn">
            <form action="../customer/register" method="POST">
                <legend>Register Now!</legend>
                <div class="col-lg-4">
                    <h3>Personal Detail</h3>
                    <hr>
                    <div class="form-group">
                        <label>First Name</label>
                        <input class="form-control" type="text" placeholder="First Name" name="first_name">
                    </div>
                    <div class="form-group">
                        <label>Last Name</label>
                        <input class="form-control" type="text" placeholder="First Name" name="last_name">
                    </div>
                    <div class="form-group">
                        <label>Date Of Birth<i>(keep remember)</i></label>
                        <input class="form-control" type="text" placeholder="First Name" name="dob">
                    </div>
                </div>
                <div class="col-lg-4">
                    <h3>Contact Detail</h3>
                    <hr>
                    <div class="form-group">
                        <label>Street Address</label>
                        <input class="form-control" type="text" placeholder="Street Address" name="street_address1">
                    </div>
                    <div class="form-group">
                        <label>Street Address</label>
                        <input class="form-control" type="text" placeholder="Street Address" name="street_address2">
                    </div>
                    <div class="form-group">
                        <label>City</label>
                        <input class="form-control" type="text" placeholder="City" name="city">
                    </div>
                    <div class="form-group">
                        <label>Telephone No.</label>
                        <input class="form-control" type="tel" placeholder="Telephone No." name="tel_no1" maxlength="10">
                    </div>
                    <div class="form-group">
                        <label>Telephone No.<i>(Optional)</i></label>
                        <input class="form-control" type="tel" placeholder="Telephone No." name="tel_no2" maxlength="10">
                    </div>
                    <div class="form-group">
                        <label>EMail</label>
                        <input class="form-control" type="email" placeholder="EMail" name="email">
                    </div>
                    <div class="form-group">
                        <button type="submit" class="btn btn-success full-width">Register Me</button>
                    </div>
                </div>
                <div class="col-lg-4">
                    <h3>Security Detail</h3>
                    <hr>
                    <div class="form-group">
                        <label>User Name</label>
                        <input class="form-control" type="text" placeholder="User Name" name="user_name">
                    </div>
                    <div class="form-group">
                        <label>Password</label>
                        <input class="form-control" type="text" placeholder="Password">
                    </div>
                    <div class="form-group">
                        <label>Confirm Password</label>
                        <input class="form-control" type="text" placeholder="Confirm Password" name="password">
                    </div>
                </div>

            </form>
        </div>

        <!--footer-->
        <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Pages</h4>

                        <ul>
                            <li><a href="#">About us</a>
                            </li>
                            <li><a href="#">Terms and conditions</a>
                            </li>
                            <li><a href="#">FAQ</a>
                            </li>
                            <li><a href="#">Contact us</a>
                            </li>
                        </ul>

                        <hr>

                        <h4>User section</h4>

                        <ul>
                            <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                            </li>
                            <li><a href="#">Regiter</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Main categories</h4>
                        <ul>
                            <li><h5><a>Men</a></h5></li>
                            <li><h5><a>Women</a></h5></li>
                            <li><h5><a>Prince</a></h5></li>
                            <li><h5><a>Princess</a></h5></li>
                        </ul>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Where to find us</h4>

                        <p><strong>Wear Me</strong>
                            <br>123/E,
                            <br>Nagoda,
                            <br>Kalutara.
                            <br>
                            <strong>Western Province</strong>
                        </p>

                        <a href="contact.html">Go to contact page</a>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->



                    <div class="col-md-3 col-sm-6">

                        <h4>Get the news</h4>

                        <p class="text-muted">Give us your email we'll send you all the new products detail!</p>

                        <form>
                            <div class="input-group">
                                <input type="text" class="form-control">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">Subscribe!</button>
                                </span>
                            </div>
                            <!-- /input-group -->
                        </form>

                        <hr>

                        <h4>Stay in touch</h4>

                        <p class="social">
                            <a href="#" class="facebook external" data-animate-hover="swing"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="twitter external" data-animate-hover="swing"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="instagram external" data-animate-hover="swing"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="swing"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="email external" data-animate-hover="swing"><i class="fa fa-envelope"></i></a>
                        </p>


                    </div>
                    <!-- /.col-md-3 -->

                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>





        <!-- *** SCRIPTS TO INCLUDE *** -->
        <script src="../asset/client-js/jquery-1.11.0.min.js"></script>
        <script src="../asset/client-js/bootstrap.min.js"></script>
        <script src="../asset/client-js/jquery.cookie.js"></script>
        <script src="../asset/client-js/waypoints.min.js"></script>
        <script src="../asset/client-js/modernizr.js"></script>
        <script src="../asset/client-js/bootstrap-hover-dropdown.js"></script>
        <script src="../asset/client-js/owl.carousel.min.js"></script>
        <script src="../asset/client-js/front.js"></script>

    </body>
</html>

