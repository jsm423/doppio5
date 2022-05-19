<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html> 
	<head>
		<meta charset="UTF-8">
		<title>DOPPIO</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_content_css.css">
		<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
		<script src="http://localhost:9000/doppio/resources/js/doppio.js"></script>
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<br>
		<a href="http://localhost:9000/doppio/recipe/recipe_list_ncf.th?rcate=ncf" id="tolist" class="tolist2"> >목록으로</a>
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
			            <li class="ingredient">${vo.rcontent1}</li>
			         </ul>
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
           		<a href="#"></a><button type="button" onclick="location.href='#'">등록</button>         
         	</div>
      		</div>
   		</div>
  		</div>
  		
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
	</body>
</html>