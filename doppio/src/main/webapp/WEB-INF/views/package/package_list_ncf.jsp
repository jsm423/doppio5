<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
	<head> 
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_list_css.css">
		</head>
	<body>
		
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<div class="recipe_list">
			<div class="list_div">
		
			<div class="recipe_header">
				<img alt="dessert" src="http://localhost:9000/doppio/resources/img/package_noncoffee_bn.png">
			</div>
		
		<!-- 옵션 박스 -->
		<div class="lioption_div">
			<div class="lioption_div2">
				<section class="lioption_sc">
						<ul class="liopli">
							
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="전체보기">전체보기</option>
								<option value="알콜">알콜</option>
								<option value="논알콜">논알콜</option></select>
							</li>
							
						</ul>
					</section>
			</div>
		</div>
		<!-- 판매 리스트 -->
			<div class="imgcon_div">
				<section class="imgcon_sc">
				
					<div class="imgcon1">
						<a href="http://localhost:9000/doppio/package/package_content_ncf.th"><img src="http://localhost:9000/doppio/resources/img/nc1.jpg" class="recipe_img" width="300" height="300"/></a>
						<br>
						<a href="http://localhost:9000/doppio/package/package_content_ncf.th">흰 민들레 꽃차 심플리 패키지<br>11000won</a>
					</div>
					<div class="imgcon2">
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th"><img src="/doppio/resources/img/nc2.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th">패션 후르츠 스파클링 빅 패키지<br>15000won</a>
					</div>
					<div class="imgcon3">
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th"><img src="/doppio/resources/img/nc3.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th">스위트 홍차 가드닝 패키지<br>17500won</a>
					</div>
					<div class="imgcon4">
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th"><img src="/doppio/resources/img/nc4.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_ncf.th">이색 칵테일 홈 파티 패키지<br>22000won</a>
					</div>
					
				</section>
			</div>
			</div>
		</div>
			<!--
				<div class="imgcon5">
						<img src="/doppio/img/d5.jpg" width="300" height="300"/>
						<br>
						<a href="#">딸기가 딸기딸기, <br>황 치즈 크로플</a> 
				</div>
				<div class="imgcon6">
						<img src="/doppio/img/d6.jpg" width="300" height="300"/>
						<br>
						<a href="#">몽글몽글 쫀득쫀득, <br>크림치즈 찹쌀떡</a>
				</div>
				<div class="imgcon7">
						<img src="/doppio/img/d7.jpg" width="300" height="300"/>
						<br>
						<a href="#">집들이 음식으로 딱, <br>핑거 케이크</a>
				</div>
				<div class="imgcon8">
						<img src="/doppio/img/d8.jpg" width="300" height="300"/>
						<br>
						<a href="#">이름부터 너무 귀여워, <br>타마고 샌드와 에그 스튜</a>
				</div> -->
			
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
		
	</body>
</html>