<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);
	
	var recStock1 = $("#recStock1");
	
	alert(recStock1);
	
	function drawChart() {
		/* var data = google.visualization.arrayToDataTable([
				  [ 'Mon', 20, 28, 38, 45 ]
				, [ 'Tue', 31, 38, 55, 66 ]
				, [ 'Wed', 50, 55, 77, 80 ]
				, [ 'Thu', 77, 77, 66, 50 ]
				, [ 'Fri', 68, 66, 22, 15 ]
		// Treat first row as data as well.
		], true); */

		var data = google.visualization.arrayToDataTable( recStock1, true);
		
		var options = {
			legend : 'none'
		};

		var chart = new google.visualization.CandlestickChart(document
				.getElementById('chart_div1'));

		chart.draw(data, options);
	}
</script>

</head>
<body>

	<input type="hidden" value=${recStock1 } id="recStock1">

	<div id="chart_div1" style="width: 900px; height: 500px;"></div>

</body>
</html>