<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
</head>
<body>
	<!-- header -->
	<jsp:include page="../../doppio_header.jsp"></jsp:include>
	
	<!-- content -->
	<div>
		<div class="title">
				<p>관리자-회원정보</p>
		</div>
		<br><br>
			<table class="join_table">
					<tr class="join_tr">
						<td class="join_td1">번호</td>
						<td class="join_td2">1
							
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">아이디</td>
						<td class="join_td2">
							hong
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">이름</td>
						<td class="join_td2">
							홍길동
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">성별</td>
						<td class="join_td2">
							남
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">핸드폰</td>
						<td class="join_td2">
							010-1234-5678
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">주소</td>
						<td class="join_td2">
							서울시 강남구
						</td>
					</tr>
					<tr class="join_tr">
						<td class="join_td1">가입일</td>
						<td class="join_td2">
							2022-04-27
						</td>
					</tr>
				</table>
				<br>
				<table class="content_write" id="lasttable">
					<tr>					
						<td colspan="2">
							<a href="http://localhost:9000/doppio/member.th"><button type="button" class="btn_style3" onclick="boardFormCheck()">리스트</button></a>
							<a href="http://localhost:9000/doppio/admin/admin.th"><button type="button" class="btn_style3">관리자 홈</button></a>
						</td>
					</tr>
				</table>
				<br><br>
		</div>
	
	
	
	<!-- footer -->
	<jsp:include page="../../doppio_footer.jsp"></jsp:include>
</body>
</html>