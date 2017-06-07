<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<link href="../css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../css/sb-admin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="../css/plugins/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
<!-- jQuery -->
<script src="../js/jquery.js"></script>

<!-- date.js -->
<script src="../js/date.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../js/bootstrap.min.js"></script>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
$(function(){
	
	var chartData = $.ajax({
		  type : 'get'
		, url : '/stock/chartAjax'
		, dataType : 'json'
		, data : {	
			code : '241180'
		  /* , term : 5 */
		}
		, success : function(result){
			var chart = new Array();
			
			for(i=0; i<result.length; i++){
				var dto = result[i];
				var day = new Array();
				
				day.push(dto.price_dt);
				day.push(dto.price_low);
				day.push(dto.price_open);
				day.push(dto.price_close);
				day.push(dto.price_high);
				
				alert("day : " + day);
				
				/* chart.push(day); */
				chart[i] = day;
			}
			
			alert(chart);
			
			return chart;
		}
	});
	
	alert("chartData : " + chartData);
	
	/* var chartData = $.getJSON("chartAjax?code=241180", function(json){
		var data = new Array();
		
		for(i=0; i<data.length; i++){
			var dto = json[i];
			var day = new Array();
			
			day.push(dto.price_dt);
			day.push(dto.price_low);
			day.push(dto.price_open);
			day.push(dto.price_close);
			day.push(dto.price_high);
			
			data.push(day);
		}
		
		return data;
	});
	 */
	/* alert("chartData" + chartData); */
	
	/* var data1 = new Array();
	
	for(i=0; i<$("#data1 tr").length; i++){
		var day = new Array();
		
		day.push($("data1 .price_dt").eq(i).text());
		day.push($("data1 .price_low").eq(i).text());
		day.push($("data1 .price_open").eq(i).text());
		day.push($("data1 .price_close").eq(i).text());
		day.push($("data1 .price_high").eq(i).text());
		
		data1.push(day);
	}
	
	alert($("#price_opened").text()); */
	
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);
	
	
	function drawChart() {
		/* var data = google.visualization.arrayToDataTable([
				  [ 'Mon', 20, 28, 38, 45 ]
				, [ 'Tue', 31, 38, 55, 66 ]
				, [ 'Wed', 50, 55, 77, 80 ]
				, [ 'Thu', 77, 77, 66, 50 ]
				, [ 'Fri', 68, 66, 22, 15 ]
		// Treat first row as data as well.
		], true); */
		
		

		var data = google.visualization.arrayToDataTable( chartData, true);
		
		var options = {
			legend : 'none'
		};

		var chart = new google.visualization.CandlestickChart(document
				.getElementById('chart_div1'));

		chart.draw(data, options);
	}

});
</script>

</head>
<body>


	<c:forEach items="${recStock1 }" var="list"	>
		<c:forEach items="${recStock1 }" var="list"	>
	
		</c:forEach>
	</c:forEach>
	
	<table class="data" id="data1">
		<c:forEach var="list" items="${recStock1 }" >
			<tr>
				<td>
					<input type="hidden" class="price_dt"	 value="<fmt:formatDate value="${list.price_date }"/>"/>
					<input type="hidden" class="price_low"	 value="${list.price_low }"/>
					<input type="hidden" class="price_opened"value="${list.price_open }"/>
					<input type="hidden" class="price_close" value="${list.price_close }"/>
					<input type="hidden" class="price_high"	 value="${list.price_high }"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<table class="data" id="data2">
		<c:forEach items="${recStock2 }" var="list"	>
			<tr>
				<td>
					<input type="hidden" class="price_dt" value="<fmt:formatDate value="${list.price_date }"/>"/>
					<input type="hidden" class="price_low" value=${list.price_low }/>
					<input type="hidden" class="price_open" value=${list.price_open }/>
					<input type="hidden" class="price_close" value=${list.price_close }/>
					<input type="hidden" class="price_high" value=${list.price_high }/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<table class="data" id="data3">
		<c:forEach items="${recStock3 }" var="list"	>
			<tr>
				<td>
					<input type="hidden" class="price_dt"	 value="<fmt:formatDate value="${list.price_date }"/>"/>
					<input type="hidden" class="price_low"	 value=${list.price_low }/>
					<input type="hidden" class="price_open"	 value=${list.price_open }/>
					<input type="hidden" class="price_close" value=${list.price_close }/>
					<input type="hidden" class="price_high"	 value=${list.price_high }/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<table class="data" id="data4">
		<c:forEach items="${recStock4 }" var="list"	>
			<tr>
				<td>
					<input type="hidden" class="price_dt" value="<fmt:formatDate value="${list.price_date }"/>"/>
					<input type="hidden" class="price_low" value=${list.price_low }/>
					<input type="hidden" class="price_open" value=${list.price_open }/>
					<input type="hidden" class="price_close" value=${list.price_close }/>
					<input type="hidden" class="price_high" value=${list.price_high }/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<table class="data" id="data5">
		<c:forEach items="${recStock5 }" var="list"	>
			<tr>
				<td>
					<input type="hidden" class="price_dt" value="<fmt:formatDate value="${list.price_date }"/>"/>
					<input type="hidden" class="price_low" value=${list.price_low }/>
					<input type="hidden" class="price_open" value=${list.price_open }/>
					<input type="hidden" class="price_close" value=${list.price_close }/>
					<input type="hidden" class="price_high" value=${list.price_high }/>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<div id="wrapper">

		<%@include file="../include/custom-header.jsp"%>


		<div id="page-wrapper">

			<div class="container-fluid">

				<!--Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							관심종목 <small>Statistics Overview</small>
						</h1>
						<ol class="breadcrumb">
							<li class="active"><i class="fa fa-dashboard"></i> Dashboard
							</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<div class="col-lg-6">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								<i class="fa fa-clock-o fa-fw"></i> Tasks Panel
							</h3>
						</div>
						
						<div class="panel-body">
							<div id="test"></div>
							<div id="chart_div1" style="width: 900px; height: 500px;"></div>
							<div class="text-right">
								<a href="#">View All Activity <i
									class="fa fa-arrow-circle-right"></i></a>
							</div>
						</div>
					</div>
				</div>
				
				<%@include file="../include/footer.jsp"%>
				<!-- /.row -->

			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#wrapper -->
	</div>
	
	<script type="text/javascript">
		alert($("#price_opened").text());
	
	</script>

</body>

</html>