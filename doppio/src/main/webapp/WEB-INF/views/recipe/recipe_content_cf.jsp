<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html> 
	<head>
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_content_css.css">
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
	<div class="recipe_content">
		<div class="content_div">
				
				<h2>SNS 화제의 그 음료, <br>달고나 라떼</h2>
				
				<div class="table_div">
						<table class="content_table">
							<tr>
								<th> 조회수 </th><td> 88461 </td>
								<th> 추천수 </th><td> 34687 </td>
							</tr>
						</table>
				</div>
				
			<iframe height="500" src="https://www.youtube.com/embed/2eouyMZRg6Q" 
				title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; 
				clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			
			<div class="share">
				<a href="#"><img alt="url" src="http://localhost:9000/doppio/resources/img/url_con.png" class="share_con" width="50px" height="50px"></a>	
				<a href="#"><img alt="twitter" src="http://localhost:9000/doppio/resources/img/twt_con.png" class="share_con" width="50px" height="50px"></a>	
				<a href="#"><img alt="kakao" src="http://localhost:9000/doppio/resources/img/kt_con.png" class="share_con" width="50px" height="50px"></a>	
			<div class="purchasebtn">
        		<a href= "http://localhost:9000/doppio/package/package_content.th"><button type="button">구매하기</button></a>
     	 	</div>
			</div>
			</div>
		</div>
		
		<div class="content" style="width: 100%;">
   			<div style="width: 800px; margin: 0 auto;">
     		 <div class="재료">
		         <div class="subtitle">재료</div>
				 <div>
			         <ul class="uling" style="line-height: 30px;">
			            <li class="ingredient">박력분 66g</li>
			            <li class="ingredient">베이킹 파우더 3g</li>
			            <li class="ingredient">달걀 70g</li>
			            <li class="ingredient">황설탕 65g</li>
			            <li class="ingredient">소금 1꼬집</li>
			            <li class="ingredient">무염 버터 40g</li>
			            <li class="ingredient">설탕 70g</li>
			            <li class="ingredient">바닐라 익스트랙 1ts</li>
			            <li class="ingredient"><취향에 따라 추가해 보세요.> 코코아 파우더 9g, 초코칩 60g, 다크 초콜릿 160g</li>
			         </ul>
     			 </div>
      		</div>
      		<br>
    		  <div class="레시피">
		         <div class="subtitle">레시피</div>
		         <div style="margin-bottom: 100px;">
			         <ul class="ulreci" style="line-height: 30px;">
			            <li class="recipe">볼에 버터를 넣고 중탕하여 완전히 녹입니다. (초콜릿 첨가 가능)</li>
			            <li class="recipe">다른 볼에 달걀과 설탕, 바닐라 익스트랙을 넣고 핸드믹서로 잘 섞어줍니다.</li>
			            <li class="recipe">중탕으로 녹인 버터 (+ 초콜릿) 을 넣고 저속으로 저어줍니다.</li>
			            <li class="recipe">박력분, 베이킹 파우더, 소금 (+ 코코아 파우더)을 체쳐 넣고 섞습니다.</li>
			            <li class="recipe">초콜릿 칩 첨가시 여기서 넣어주세요.</li>
			            <li class="recipe">완성된 반죽을 아이스크림 스쿱으로 떠서 오븐 팬에 팬닝합니다.</li>
			            <li class="recipe">180도로 예열해둔 오븐에 12 ~ 14분 구워줍니다.</li>
			            <li class="recipe">구워져 나오면 쿠키 위에 소금을 살짝 뿌리고 팬 위에서 10분 가량 식힌 후, 식힘망으로 옮기면 완성!</li>
			         </ul>
       			 </div>
     		 </div>
      
     	 <div class="댓글">
        	<div class="subtitle">댓글</div>
         	<div class="commentfield">
            	<textarea rows="1" cols="40" style="width: 600px;" placeholder="내용을 입력해 주세요"></textarea>
           		<a href="#"></a><button type="button" onclick="location.href='#'">등록</button>         
         	</div>
      		</div>
   		</div>
  		</div>
  		
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
	</body>
</html>