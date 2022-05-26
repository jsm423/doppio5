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
		<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
		<script src="http://localhost:9000/doppio/resources/js/doppio.js"></script>
	</head>
	<body>
	
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<br>
		<a href="http://localhost:9000/doppio/recipe/recipe_list_cf.th?rcate=cf" id="tolist" class="tolist2"> >목록으로</a>
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
       	<div class="subtitle">&nbsp;댓글 ${vo.rnum }</div>
        	<div class="commentfield">
        		<c:if test="${sessionScope.sid != null }">
				<form name="comment_write_cf" action="doppio/recipe/recipe_write_cf.th" method="post">
			        		<input type="hidden" name="cmcate_num" value="${vo.rnum}">
			        		<input type="hidden" name="id" id="id" value="${sessionScope.sid }">
			           	<textarea rows="1" cols="40" style="width: 600px;" placeholder="내용을 입력해 주세요" id="cmcomment" name="cmcomment"></textarea>
			          		<button type="button" class="enter" id="btnComm3" data-rnum="${vo.rnum}">등록</button>  
			    </form> 
			    </c:if> 

        		<table class="commtable" >
        			        			
        			<c:forEach var="vo" items="${list }">
        			<tr class="commbtn">
        				<td colspan="2" class="commbtntd"><p>${vo.cmdate }</p>&nbsp;
        				<c:if test="${sessionScope.sid == vo.id }">
        				<button class="commbtnup" data-cnum="${vo.cmnum}">수정</button>
        				<button type="submit" data-cnum="${vo.cmnum}" class="commbtndel">삭제</button></td>
        				</c:if>
        			</tr>
        			
        			<tr class="cmtArea"> <!-- style="vertical-align: text-top;" -->
        				<tr class="${vo.cmnum}">
	        				<th class="commth" data-cnum="${vo.cmnum}">${vo.id}</th>
	        				<td class="commtd" data-cnum="${vo.cmnum}">${vo.cmcomment}</td>
        				</tr>
        				
        				<%-- <td>
        				<textarea style="width: 520px; vertical-align:top;">${vo.cmcomment}</textarea>
        				<button type="button" style="width: 50px; height: 61px;" id="cmtSave">저장</button>
        				</td> --%>
        				
        			</tr>
        			</c:forEach>
        		 </table>        		
     		
        	</div>
     		</div>
   		</div>
  		</div>
  		
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
	</body>
</html>