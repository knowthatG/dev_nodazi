<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Bootstrap Admin Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

       <%@include file="../include/custom-header.jsp"%>


        <div id="page-wrapper">

            <div class="container-fluid">

 <!--                Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            	추천종목 <small>Statistics Overview</small>
                        </h1>
                    </div>
                </div>
            <!-- 패널 -->
                <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-fw fa-bar-chart-o"></i> 추천종목1</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                </div>
                            </div>
                        </div>
				</div>
                <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-fw fa-bar-chart-o"></i> 추천종목2</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                </div>
                            </div>
                        </div>
				</div>
				
				 <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-fw fa-bar-chart-o"></i> 추천종목3</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                </div>
                            </div>
                        </div>
				</div>
				
				                <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-fw fa-bar-chart-o"></i> 추천종목4</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                </div>
                            </div>
                        </div>
				</div>
				
				                <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-fw fa-bar-chart-o"></i> 추천종목5</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                </div>
                            </div>
                        </div>
				</div>
                <!-- 패널 끝 -->

                            </div>
		<%@include file="../include/footer.jsp"%>
                        </div>

                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>