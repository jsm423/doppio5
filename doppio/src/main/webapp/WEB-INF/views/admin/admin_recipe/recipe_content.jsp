<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>       
<!DOCTYPE html>
<html> 
	<head>
		<meta charset="UTF-8">
		<title>DOPPIO</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_content_css.css">
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<br>
		<a href="http://localhost:9000/doppio/admin/admin_recipe/recipe_list.th" id="tolist" class="tolist2"> >목록으로</a>
	<div class="recipe_content">
		
		<div class="content_div">
				<h2>${vo.rtitle}</h2>
			
				<div class="table_div">
						<table class="content_table">
							<tr>
								<th> 조회수 </th><td> ${vo.rhits} </td>
							</tr>
						</table>
				</div><br>
			<div class="iframediv">
				<iframe height="500" width="100%" src="https://www.youtube.com/embed/${vo.rurl }" 
						title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; 
						encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
			</div>
			<br><br>
			<div class="share">
				<a href="#"><img alt="url" src="http://localhost:9000/doppio/resources/img/url_con.png" class="share_con" width="30px" height="30px"></a>	
				<a href="#"><img alt="twitter" src="http://localhost:9000/doppio/resources/img/twt_con.png" class="share_con" width="30px" height="30px"></a>	
				<a href="#"><img alt="kakao" src="http://localhost:9000/doppio/resources/img/kt_con.png" class="share_con" width="30px" height="30px"></a>	
			<form name="delForm" action="/doppio/admin/admin_recipe/recipe_content.th?rnum=${vo.rnum }" method="post">
				<div class="admin_button">
					<button onclick="http://localhost:9000/doppio/admin/admin_recipe/recipe_update.th?rnum=${vo.rnum }&rno=${rno}">수정</button>
					<button type="submit">삭제</button>
				</div>
			</form>
			</div>
			</div>
		</div>
		
		<div class="content" style="width: 100%;">
   			<div style="width: 800px; margin: 0 auto;">
     		 <div class="재료">
		         <div class="subtitle">재료</div>
				 <div>
			         <ul class="uling" style="line-height: 30px;">
			            <li class="ingredient">${vo.rcontent1}</li>
			         
			         </ul>
			         <!-- <ul class="uling" style="line-height: 30px;">
			            <li class="ingredient">박력분 66g</li>
			            <li class="ingredient">베이킹 파우더 3g</li>
			            <li class="ingredient">달걀 70g</li>
			            <li class="ingredient">황설탕 65g</li>
			            <li class="ingredient">소금 1꼬집</li>
			            <li class="ingredient">무염 버터 40g</li>
			            <li class="ingredient">설탕 70g</li>
			            <li class="ingredient">바닐라 익스트랙 1ts</li>
			            <li class="ingredient"><취향에 따라 추가해 보세요.> 코코아 파우더 9g, 초코칩 60g, 다크 초콜릿 160g</li>
			         </ul> -->
     			 </div>
      		</div>
      		<br>
    		  <div class="레시피">
		         <div class="subtitle">레시피</div>
		         <div style="margin-bottom: 100px;">
			         <ul class="ulreci" style="line-height: 30px;">
			            <li class="recipe">${vo.rcontent2 }</li>
			         </ul>
       			 </div>
     		 </div>
      
     	 <div class="댓글">
        	<div class="subtitle">댓글</div>
         	<div class="commentfield">
            	<textarea rows="1" cols="40" style="width: 600px;" placeholder="내용을 입력해 주세요"></textarea>
           		<button type="button" onclick="location.href='#'">등록</button>         
         	</div>
      		</div>
   		</div>
  		</div>
  		
		<!-- footer -->
		<jsp:include page="../../doppio_footer.jsp"></jsp:include>
	</body>
</html>