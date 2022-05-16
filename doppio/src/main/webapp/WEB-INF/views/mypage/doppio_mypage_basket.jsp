<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/mypage_basket_css.css">
		
		<style type="text/css">
			div.mypage_nav{text-align: center; width: 100%; margin-top: -25px; margin-bottom: 50px;}
			div.mypage_nav a{text-decoration: none; color: black;}
			div.mypage_nav a:hover{text-decoration: underline;}
			
			/* 마이페이지 개별css */
			div.mypage_nav a:nth-child(2) {text-decoration: underline;}
		</style>
	</head>
	<body>

	<!-- header -->
	<jsp:include page="../doppio_header.jsp"></jsp:include> 

	<!-- content -->
		<div class="title">
			<p>My Info</p>
		</div>
		<br><br>
		<div class="mypage_nav">
			<a href="http://localhost:9000/doppio/mypage/doppio_mypage_info.th">정보수정</a>&emsp;&emsp;
			<a href="http://localhost:9000/doppio/mypage/doppio_mypage_basket.th">장바구니</a>&emsp;&emsp;
			<a href="http://localhost:9000/doppio/mypage/doppio_mypage_order_history.th">주문내역</a>
		</div>
		
			
			<div class="mypage_basket">
			
			<div class="basket_fix">
				<div class="basket_div">
				<section class="basket_sc">
				<table class="basket_table" style="width: 75%; margin: auto;">
					<thead>
						<tr>
							<th colspan="2" style="text-align: center;" style="line-height: 100px;">상품명</th>
							<th style="line-height: 100px;">가격</th>
							<th style="line-height: 100px;">수량</th>
							<th style="line-height: 100px;">상품정보</th>
						</tr>
					</thead>
				
					<tbody>
						<tr>
							<td><img alt="basket_img" src="http://localhost:9000/doppio/resources/img/d2.jpg" 
									class="basket_con"></td>
							<td>버석바삭! 커피와 함께, 크랙 쿠키</td>
							<td>14000원</td>
							<td><select>
								<option>수량</option>
								</select></td>
							<td>제품 정보</td>
						</tr>
						<tr style="line-height: 200px;"><td colspan="5"><h3>상품을 결제해 주세요!</h3></td></tr>
					</tbody>
				</table>
				</section>
				</div>
			</div>
			
			<div class="row" style="text-align: center; margin: 80px 0;">
				<a href="http://localhost:9000/doppio/mypage/doppio_mypage_order_history.th"><button class="btn">주문하기</button></a>
				<a href="http://localhost:9000/doppio/package/package_list.th"><button class="btn btn-default">쇼핑을 계속하기</button></a>
			</div>
			
		</div>


	<!-- footer -->
	<jsp:include page="../doppio_footer.jsp"></jsp:include>
	</body>
	</html>