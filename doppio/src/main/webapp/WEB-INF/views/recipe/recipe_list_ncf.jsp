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
				<img alt="dessert" src="http://localhost:9000/doppio/resources/img/recipe_noncoffee_bn.png">
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
						<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th"><img src="http://localhost:9000/doppio/resources/img/nc1.jpg" class="recipe_img" width="300" height="300"/></a>
						<br>
						<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th">마음이 편안해지는 시간, <br>흰 민들레 꽃차</a>
					</div>
					<div class="imgcon2">
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th"><img src="/doppio/resources/img/nc2.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th">에이드 계의 새로운 강자, <br>패션후르츠 스파클링</a>
					</div>
					<div class="imgcon3">
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th"><img src="/doppio/resources/img/nc3.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th">로판 속 주인공이 되어 보아요, <br>스위트 홍차</a>
					</div>
					<div class="imgcon4">
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th"><img src="/doppio/resources/img/nc4.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/recipe/recipe_content_ncf.th">홈 파티에 필수죠, <br>이색 칵테일</a>
					</div>
					
				</section>
			</div>
			</div>
		</div>
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
		
	</body>
</html>