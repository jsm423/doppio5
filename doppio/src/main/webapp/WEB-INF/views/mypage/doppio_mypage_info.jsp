<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOPPIO</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		
		//회원탈퇴 신청 처리
		$("#join_status").click(function(){
			//var choice = confirm("정말로 회원탈퇴를 신청하시겠습니까?");
			//alert(choice);
			//var bname = $("#join_status").text();
			var status = 0;
			if($("#join_status").text() == "취소"){ //신청 : 0; 취소 : 1
				status = 1;
			}
			
			if(confirm("정말로 회원탈퇴를 신청/취소 하시겠습니까?")){
				//cgv_member 테이블에서 test라는 계정의 join_status 값을 1로 수정
				//url : join_status.do				
				$.ajax({
					url : "/doppio/mypage/doppio_mypage_info.th?mnum=m_30&status="+status, //test, 1
					success : function(result){
						if(result == 1){
							alert("처리가 완료되었습니다.");
							if(status == 0){
								$("#join_status").text("탈퇴취소");	
							}else{
								$("#join_status").text("회원탈퇴");	
							}
						}
					}
				});//ajax
					
				
			}
		});
	});
</script>
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
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_info?mnum=${sessionScope.mnum}.th">정보수정</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th">장바구니</a>&emsp;&emsp;
		<a href="http://localhost:9000/doppio/mypage/doppio_mypage_order_history.th">주문내역</a>
	</div>

<form name="" action="/doppio/mypage/doppio_mypage_info.th?mnum=${vo.mnum }" method="post">
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
				<td class="join_td1">
				비밀번호</td>
				<td class="join_td2">
					<input type="text" name="pass" value="${vo.pass }">
					<!-- <input type="text"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">이름</td>
				<td class="join_td2">
					<input type="text" name="name" value="${vo.name }">
					<!-- <input type="text"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">주소</td>
				<td class="join_td2">
					<input type="text" name="address" value="${vo.address }" class="mypage_address">
					<!-- <input type="text" class="join_input1"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">전화번호</td>
				<td class="join_td2">
					<input type="text" name="hp" value="${vo.hp }">
					<!-- <input type="text" name="hp1" value="${vo.hp1 }">-
					<input type="text" name="hp2" value="${vo.hp2 }">-
					<input type="text" name="hp3" value="${vo.hp3 }"> -->
				</td>
			</tr>
			<tr class="join_tr">
				<td class="join_td1">이메일</td>
				<td class="join_td2">
					<input type="text" name="email" value="${vo.email }" class="mypage_email">
					<!--<input type="text" name="email1" value="${vo.email1 }">@
					<input type="text" name="email2" value="${vo.email2 }"> -->
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
</form>

<!-- footer -->
<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>