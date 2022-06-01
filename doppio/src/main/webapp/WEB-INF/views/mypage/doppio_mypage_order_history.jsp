<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
<style>
	div.mypage_nav a:nth-child(3) {text-decoration: underline;}
</style>
</head>
<body>
	<!-- header -->
	<jsp:include page="../doppio_header.jsp"></jsp:include>
	
	<!-- content -->
	<br><br>
	<div id="orderdiv">
		<div class="title"> 
		<p>My Page</p>
	</div>
	<br><br>
	<div class="mypage_nav">
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_info.th?mnum=${sessionScope.mnum}">정보수정</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th">장바구니</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_order_history.th">주문내역</a>
	</div>
		<table id="order_table">
			<tr id="order_list">
				<th>주문일</th><th>주문상품</th><th>결제금액</th><th>주문상태</th>
			</tr>
			<c:forEach var="vo" items="${list}">
			<tr class="order_data">		
				<td>${vo.odate }</td><td>${vo.ptitle }</td><td>${ vo.pprice * vo.cacount + vo.popprice }원</td><td>결제완료</td>
			</tr>
			</c:forEach>
		</table>
		<input type="hidden" name="pprice" value="${vo.vo.pprice }">
		<input type="hidden" name="popprice" value="${vo.popprice }">
		<input type="hidden" name="cacount" value="${vo.cacount }">
		<br><br><br><br><br><br><br><br>
	</div>
	<!-- footer -->
	<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>