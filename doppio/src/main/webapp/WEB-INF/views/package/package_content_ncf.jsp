<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
	<head> 
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_buy_css.css">
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		
		<!-- content -->
		<div class="recipe_buy">
			<div class="buy_div">
				
				<!-- 판매 상품 이미지 -->			
				<div class="buy_img">
					<img src="http://localhost:9000/doppio/resources/img/nc2.jpg" width="500px" height="500px">
				</div>
				
				<!-- 설명창 -->
				<div class="buy_title">
					<h2>에이드 계의 새로운 강자, <br>패션후르츠 스파클링</h2><br>
					
				<p style="font-size: 15px">새콤달콤한 게 끌린다구요? 톡톡 짜릿, 집에서도 어렵지 않아요.</p><br>
					
				<div class="buy_stitle">
					<h3>할인 받고 저렴하게 구매하세요!</h3>
				</div>
				</div>
				
				<!-- 옵션 박스 -->
				<div class="option_div">
					<section class="option_sc">
						<ul class="opli">
						
							<li class="ol">옵션선택 : </li>
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="---------">구매 수량을 선택해 주세요.</option>
								<option value="1세트">1세트</option>
								<option value="2세트">2세트 (+6500원)</option>
								<option value="3세트">3세트 (+12000원)</option>
								<option value="4세트">4세트 (+18000원)</option>
								<option value="5세트">5세트 (+23000원)</option>
								</select>
							</li>
							<li class="ol"></li>
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="---------">음료를 추가해 보세요.</option>
								<option value="아메리카노">아메리카노 3팩 (+3000원)</option>
								<option value="밀크티">밀크티 300ml (+3500원)</option>
								<option value="딸기라떼">라떼 아트 키트 (+5000원)</option>
								<option value="밀크티">스파클링 와인 (+9000원)</option>
								<option value="밀크티">하이볼 패키지 (+14000원)</option>
								</select>
							</li>
							<!-- <li class="ol"></li>
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="---------">함께 읽으면 좋은 책이에요.</option>
								<option value="베스트셀러">4월의 베스트 셀러 - 파친코 (+11000원)</option>
								<option value="오늘의책1">오늘의 책 - 마음의 법칙 (+12000원)</option>
								<option value="오늘의책2">오늘의 책 - 저주토끼 (+13000원)</option>
								<option value="오늘의책3">오늘의 책 - 여름이 온다 (+13000원)</option>
								<option value="오늘의책4">오늘의 책 - 백광 (+13000원)</option>
								</select>
							</li>
							<li class="ol"></li>
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="---------">데코 용품은 어떠세요?</option>
								<option value="포스터">인스타 감성, 킨포크 포스터 (+3000원)</option>
								<option value="트레이">사진과 같아요, 우드 트레이 (+4000원)</option>
								<option value="조화">무향의 아름다움, 조화 다발 (+6000원)</option>
								<option value="피규어">촬영 필수템, 피규어 5종 (+12000원)</option>
								</select>
							</li> -->
						</ul>
					</section>
				</div>
				<div class="option_sum">
					<h3 style="font-size: 25px;"> 15000 + 5000 + 0 + 0 <br> 
					= <span style="font-size: 35px; font-weight: bold;">20000 won</span></h3> 
				</div>
				<div class="option_btn">
				<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th"><button type="submit" class="btn_style">장바구니</button></a>
				<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th"><button type="submit" class="btn_style">바로구매</button></a>
				</div>
			</div>
			</div>
			<br><br><br>
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
	
	</body>
</html>