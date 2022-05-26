<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>      
<!DOCTYPE html>
<html lang="ko">
	<head> 
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_buy_css.css">
		<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
		<script src="http://localhost:9000/doppio/resources/js/doppio.js"></script>  	
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		
		<!-- content -->
		<div class="recipe_buy">
			<div class="buy_div">
				<a href="http://localhost:9000/doppio/package/package_list_cf.th" id="btnBack"> >> BACK </a>
				<form name="package_cart_cf" action="/package/package_content_cf.th" method="post">
				<!-- 판매 상품 이미지 -->		
				<input type="hidden" name="pname" value="${vo.ptitle }">	
				<div class="buy_img">
					<c:if test="${vo.psfile != null}">
							<img src="http://localhost:9000/doppio/resources/upload/${vo.psfile}"
							     width="500px" height="500px">
					</c:if>
				</div>
				
				<!-- 설명창 -->
				<div class="buy_title">
					<h2>${vo.ptitle}</h2><br>
					<input type="hidden" name="pnum" id="pnum" value="${vo.pnum}">
					
				<p style="font-size: 15px">${vo.pcontent}</p><br>
					
				<div class="buy_stitle">
					<h3>할인 받고 저렴하게 구매하세요!</h3>
				</div>
				</div>
				
				<!-- 옵션 박스 -->
				<div class="option_div">
					<section class="option_sc">
						<ul class="opli">
						
						<div class="count_option" style="text-align: left;">
							<label> 희망 옵션을 선택해 주세요: </label> <br><br>
							<select class="cacount" id="cacount"  name="cacount" style= "width: 200px; height: 30px;">
							<c:forEach begin="1" end="${vo.pstock }" var="count">
								<option>${count }</option></c:forEach>
							</select>
						</div>
						
						<li class="ol"></li>
						<li>
							<input type="hidden" name="popid" value="${vo.popid}">
							<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<c:forEach var="vo" items="${list}">
								<option>${vo.popname }</option>
								</c:forEach>
							</select>
						</li>
						</ul>
					</section>
				</div>
				<div class="option_sum">
					<h2>임시 가격 : ${vo.pprice}</h2>
				</div>
				
				</div>
			
				<div class="option_btn">
				
				<button type="button" class="pkbt" id="cart_btn_cf">장바구니</button>
				<script>
				$("#cart_btn_cf").click(function(){
					
					var check = confirm("상품이 장바구니에 담겼습니다. 확인하시겠습니까?");  
			        
			        if (check == true) {
			        	
			        	package_cart_cf.submit();
			        	location.assign("/doppio/mypage/doppio_mypage_basket.th?pnum=${vo.pnum}&id=${sessionScope.sid}");
			        } 
				});
		     	</script> 
				<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th"><button type="submit" class="pkbt">바로구매</button></a>
				</form>
				</div>
			</div>
			<br><br><br>
			
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
	
	</body>
</html>