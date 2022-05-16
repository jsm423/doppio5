<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {

	
		var page1 = $('.boardhover').hover(function() {

			$(this).css("background-color","#f7f7f7");

		}, function() {

		$(this).css("background-color","#ffffff");

	});

});
</script>
</head>
<body>
	<!-- header -->
	<jsp:include page="../../doppio_header.jsp"></jsp:include>
	
	<div id="boarddiv">
		<section class="board_list">
			<div class="title">
				<p>회원관리</p>
			</div>
			<br>
			<table id="board_table">
				<tr id="board_head">
					<th>번호</th>
					<th>아이디</th>
					<th>이름</th>	
					<th>성별</th>
					<th>핸드폰</th>
					<th>주소</th>
					<th>가입일</th>
				</tr>
				<tr class="boardhover">
					<td>1</td>
					<td><a href="http://localhost:9000/doppio/member_content.th" class="boardtitle">hong</a></td>
					<td>홍길동</td>
					<td>남</td>
					<td>010-1234-5678</td>
					<td>서울시 강남구</td>
					<td>2022-04-27</td>
				</tr>
				<tr class="boardhover">
					<td>2</td>
					<td><a href="#" class="boardtitle">SJKim</a></td>
					<td>김성진</td>
					<td>남</td>
					<td>010-9876-5432</td>
					<td>서울시 강동구</td>
					<td>2022-04-26</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				<tr>
				</tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				<tr>
					<td colspan="7"><이전  1  2  3  4  5 다음></td>
				</tr>
			</table>
			<br><br><br><br><br><br>
		</section>
		
	</div>
	
	
	<!-- footer -->
	<jsp:include page="../../doppio_footer.jsp"></jsp:include>
</body>
</html>