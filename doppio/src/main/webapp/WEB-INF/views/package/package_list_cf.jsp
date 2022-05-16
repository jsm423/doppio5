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
				<img alt="coffee" src="http://localhost:9000/doppio/resources/img/package_coffee_bn.png">
			</div>
		
		<!-- 옵션 박스 -->
		<div class="lioption_div">
			<div class="lioption_div2">
				<section class="lioption_sc">
						<ul class="liopli">
							
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="전체보기">전체보기</option>
								<option value="원두커피">원두커피</option>
								<option value="믹스커피">믹스커피</option></select>
							</li>
							
						</ul>
					</section>
			</div>
		</div>
		<!-- 판매 리스트 -->
			<div class="imgcon_div">
				<section class="imgcon_sc">
				
					<div class="imgcon1">
						<a href="http://localhost:9000/doppio/package/package_content_cf.th"><img src="http://localhost:9000/doppio/resources/img/c1.jpg" class="recipe_img" width="300" height="300"/></a>
						<br>
						<a href="http://localhost:9000/doppio/package/package_content_cf.th">에스프레소 베이직 패키지<br>10000won</a>
					</div>
					<div class="imgcon2">
							<a href="http://localhost:9000/doppio/package/package_content_cf.th"><img src="/doppio/resources/img/c2.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_cf.th">하드 아포가토 미니 패키지<br>12000won</a>
					</div>
					<div class="imgcon3">
							<a href="http://localhost:9000/doppio/package/package_content_cf.th"><img src="/doppio/resources/img/c3.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_cf.th">딥 다크 초코 라떼 올 뉴 패키지<br>14000won</a>
					</div>
					<div class="imgcon4">
							<a href="http://localhost:9000/doppio/package/package_content_cf.th"><img src="/doppio/resources/img/c4.jpg" class="recipe_img" width="300" height="300"/></a>
							<br>
							<a href="http://localhost:9000/doppio/package/package_content_cf.th">달고나 라떼 핫 패키지<br>9000won</a>
					</div>
					
				</section>
			</div>
			</div>
		</div>
		
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
		
	</body>
</html>