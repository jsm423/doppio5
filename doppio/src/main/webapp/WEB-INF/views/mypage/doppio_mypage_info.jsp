<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOPPIO</title>
<link rel="stylesheet" href="http://localhost:9000/myspring/resources/css/doppio_css.css">
<style type="text/css">
	
	/* 마이페이지 개별css */
	div.mypage_nav a:first-child {text-decoration: underline;}
</style>
</head>
<body>
<!-- header -->
<jsp:include page="../doppio_header.jsp"></jsp:include> 
<!-- content -->
	<div class="title">
		<p>My Page</p>
	</div>
	<br><br>
	<div class="mypage_nav">
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_info.th">정보수정</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th">장바구니</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_order_history.th">주문내역</a>
	</div>
	<div class="join_frame">
		<table class="join_table">
			<tr class="join_tr">
				<td class="join_td1">아이디</td>
				<td class="join_td2">${vo.id }
					<!-- <input type="text" max="15">
					<button type="button" onclick="location='#'">중복확인</button> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">비밀번호</td>
				<td class="join_td2">
					${vo.pass }
					<!-- <input type="text"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">이름</td>
				<td class="join_td2">
					${vo.name }
					<!-- <input type="text"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">주소</td>
				<td class="join_td2">
					${vo.address }
					<!-- <input type="text" class="join_input1"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">전화번호</td>
				<td class="join_td2">
					${vo.hp }
					<!-- <input type="text" class="join_input2"> - 
					<input type="text" class="join_input2"> - 
					<input type="text" class="join_input2"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">이메일</td>
				<td class="join_td2">
					${vo.email }
					<!-- <input type="text"> @ 
					<input type="text" class="join_input3"> -->
				</td>
			</tr>
		</table>
		
		<div class="join_btn"> 
			<c:choose>
				<c:when test="${vo.join_status == 0 }">
					<button type="button" id="join_status">회원탈퇴</button>
				</c:when>
				<c:otherwise>
					<button type="button" id="join_status">탈퇴취소</button>
				</c:otherwise>
			</c:choose>
<!-- 			<button type="submit">회원탈퇴</button> -->
			<button type="submit">저장하기</button>
		</div>
	</div>


<!-- footer -->
<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>