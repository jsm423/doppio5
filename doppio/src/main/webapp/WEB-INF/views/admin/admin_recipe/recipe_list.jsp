<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">
	<head> 
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_list_css.css">
		<style>
			div.mypage_nav a:nth-child(3) {text-decoration: underline;}
		</style>
		</head>
	<body>
		
		<!-- header -->
		<jsp:include page="../../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<div class="recipe_list">
			<div class="list_div">
		
			<div class="recipe_header">
				<img alt="dessert" src="http://localhost:9000/doppio/resources/img/recipe_dessert_bn.png">
			</div>
			<br><br>
		<div class="mypage_nav">
			<a href="#">coffee</a>&emsp;&emsp;
			<a href="#">non-coffee</a>&emsp;&emsp;
			<a href="#">dessert</a>
		</div>
		
		<!-- 옵션 박스 -->
		<div class="purchasebtn">
				<a href="http://localhost:9000/doppio/admin/admin_recipe/recipe_write.th"><button type="button">글쓰기</button></a>
		</div>
		<div class="lioption_div">
			<div class="lioption_div2">
				<section class="lioption_sc">
						<ul class="liopli">
							
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="전체보기">전체보기</option>
								<option value="쿠키&브래드">쿠키&브래드</option>
								<option value="샐러드&샌드위치">샐러드&샌드위치</option></select>
							</li>
							
						</ul>
					</section>
			</div>
		</div>
		<!-- 판매 리스트 -->
			<div class="imgcon_div">
				<section class="imgcon_sc">
				
					<div class="imgcon1">
						<a href="#"><img src="http://localhost:9000/doppio/resources/img/d1.jpg" class="recipe_img" width="300" height="300"/></a>
						<br>
						<a href="#">쿠션을 베어문 듯한 식감, <br>몰랑 수플레</a>
					</div>
					<div class="imgcon2">
							<a href="http://localhost:9000/doppio/admin/admin_recipe/recipe_content.th"><img src="/doppio/resources/img/d2.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/admin/admin_recipe/recipe_content.th">버석바삭! 커피와 함께, <br>크랙 쿠키</a>
					</div>
					<div class="imgcon3">
							<a href="#"><img src="/doppio/resources/img/d3.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="#">홍차 한 잔이 떠올라요, <br>얼그레이 타르트</a>
					</div>
					<div class="imgcon4">
							<a href="#"><img src="/doppio/resources/img/d4.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="#">아침도 점심도 뚝딱, <br>베이글 샌드위치</a>
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
		<jsp:include page="../../doppio_footer.jsp"></jsp:include>
		
	</body>
</html>