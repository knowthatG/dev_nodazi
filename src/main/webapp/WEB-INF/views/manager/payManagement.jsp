<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>주가 예측 프로젝트 - 노다지</title>

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

<script type="text/javascript"
	src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
	
	
</script>

</head>

<body>
	<div id="wrapper">

		<%@include file="../include/custom-header.jsp"%>

		<div id="page-wrapper">

			<div class="container-fluid">

				<!--Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">
							결제 관리<small>Payment Management</small>
						</h1>
						<ol class="breadcrumb">
							<li class="active"><i class="fa fa-dashboard"></i> Dashboard
							</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->

				<div class="col-lg-12">
						
						<div class="box">
							<div class="box-header form-inline">
								<select name="searchType" class="form-control">
									<option value="ind" selected="selected"
										<c:out value="${cri.searchType eq ''?'selected':''}"/>>
										전체
									</option>
									<option value="i"
										<c:out value="${cri.searchType eq 'i'?'selected':''}"/>>
										아이디
									</option>
									<option value="n"
										<c:out value="${cri.searchType eq 'n'?'selected':''}"/>>
										입금주
									</option>
									<option value="b"
										<c:out value="${cri.searchType eq 'b'?'selected':''}"/>>
										입금은행
									</option>
								</select> <input type="text" name='keyword' id="keywordInput" class="form-control"
									value='${cri.keyword }'>
								<button id="searchBtn" class="btn btn-default">Search</button>
							</div>
							<div class="box-body">
								<table class="table table-hover">
									<tr>
										<th class="col-lg-0"></th>
										<th>no</th>
										<th>id</th>
										<th>입금액</th>
										<th>입금은행</th>
										<th>입금주</th>
										<th>신청일</th>
										<th>승인일</th>
										<th>만기일</th>
										<th>상태</th>
									</tr>
									
									<!--상태 비교를 위해 현재 날짜를 가져옴 -->
									<%
									Date now = new Date();
									%>
									<c:set var="now" value="<%=now%>"/>
									
									<!-- 결제 리스트를 출력 -->
									<c:forEach items="${list}" var="paymentDto" varStatus="status">
										<tr>
											<td>
												<input type="checkbox" >
											</td>
											<td>
												${status.index+1}
											</td>
											<td>${paymentDto.u_id}</td>
											<td>${paymentDto.p_price}</td>
											<td>${paymentDto.p_dep_bank}</td>
											<td>${paymentDto.p_dep_nm}</td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${paymentDto.p_regdt}"/></td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${paymentDto.p_depdt}"/></td>
											<td><fmt:formatDate pattern="yyyy-MM-dd" value="${paymentDto.p_enddt}"/></td>
											<td id="paymentstate">
												<c:if test="${paymentDto.p_enddt==Null}">입금전</c:if>
												<c:if test="${paymentDto.p_enddt!=Null}">
													<c:if test="${paymentDto.p_enddt>=now}">입금완료</c:if>
													<c:if test="${paymentDto.p_enddt<now}">만기</c:if>
												</c:if>
											</td>
										</tr>
									</c:forEach>
								</table>
							</div>
							<!-- /.box-body -->
			
							<div class="box-footer">
			
								<div class="text-center">
									<ul class="pagination">
			
										<c:if test="${pageMaker.prev}">
											<li><a
												href="paymentList${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
										</c:if>
										
										<c:forEach begin="${pageMaker.startPage }"
											end="${pageMaker.endPage }" var="idx">
											<li
												<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
												<a href="paymentList${pageMaker.makeSearch(idx)}">${idx}</a>
											</li>
										</c:forEach>
			
										<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
											<li><a
												href="paymentList${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
										</c:if>
			
									</ul>
								</div>
			
							</div>
							<!-- /.box-footer-->
						</div>
					
				</div>


				<%@include file="../include/footer.jsp"%>
				<!-- /.row -->

			</div>
			<!-- /.container-fluid -->
		</div>
		<!-- /#wrapper -->
	</div>
	<!-- jQuery -->
	<script src="../js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../js/bootstrap.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="../js/plugins/morris/raphael.min.js"></script>
	<script src="../js/plugins/morris/morris.min.js"></script>
	<script src="../js/plugins/morris/morris-data.js"></script>
	
</body>

<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script>

$(document).ready(function(){
			
	$("#searchBtn").on("click",
		function(event) {
		alert("paymentList"
				+ '${pageMaker.makeQuery(1)}'
				+ "&searchType="
				+ $("select option:selected").val()
				+ "&keyword=" + $('#keywordInput').val());
		self.location = "paymentList"
			+ '${pageMaker.makeQuery(1)}'
			+ "&searchType="
			+ $("select option:selected").val()
			+ "&keyword=" + $('#keywordInput').val();
		}
	);
		
		
			
			
});	

</script>

</html>