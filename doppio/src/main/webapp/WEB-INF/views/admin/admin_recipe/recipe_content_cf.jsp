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
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/am-pagination.css">
<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
<script src="http://localhost:9000/doppio/resources/js/doppio.js"></script>
<script src="http://localhost:9000/doppio/resources/js/am-pagination.js"></script>
<script>
	$(document).ready(function(){
		
		var pager = jQuery('#ampaginationsm').pagination({
		
		    maxSize: 7,	    		// max page size
		    totals: '${dbCount}',	// total pages	
		    page: '${reqPage}',		// initial page		
		    pageSize: '${pageSize}',			// max number items per page
		
		    // custom labels		
		    lastText: '&raquo;&raquo;', 		
		    firstText: '&laquo;&laquo;',		
		    prevText: '&laquo;',		
		    nextText: '&raquo;',
				     
		    btnSize:'sm'	// 'sm'  or 'lg'		
		});
		
		jQuery('#ampaginationsm').on('am.pagination.change',function(e){
			   jQuery('.showlabelsm').text('The selected page no: '+e.page);
	           $(location).attr('href', "http://localhost:9000/doppio/admin/admin_recipe/recipe_content_cf.th?&rpage="+e.page);         
	    });
		
 	});
</script>
</head>
<body>
	
		<!-- header -->
	<jsp:include page="../../doppio_header.jsp"></jsp:include>
	
	<!-- content -->
	<br>
	<a href="http://localhost:9000/doppio/admin/admin_recipe/recipe_list_cf.th?rcate=cf" id="tolist" class="tolist2"> >목록으로</a>
<div class="recipe_content">
	
	<div class="content_div">
			<h2>${vo.rtitle},${vo.rcate }</h2>
		
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
		<form name="delForm" action="/doppio/admin/admin_recipe/recipe_content_cf.th?rnum=${vo.rnum }" method="post">
			<div class="admin_button">
				<button type="button" id="btnUpdate" onclick="location.href='http://localhost:9000/doppio/admin/admin_recipe/recipe_update_cf.th?rnum=${vo.rnum }&rno=${rno}'">수정</button>
				<button type="submit">삭제</button>
			</div>
		</form>
		</div>
		</div>
</div>
	
	<div class="content" style="width: 100%;">
  			<div style="width: 800px; margin: 0 auto;">
    		 <div class="재료">
	         <div class="subtitle">&nbsp;재료</div>
			 <div>
		         <ul class="uling" style="line-height: 30px;">
		            <li class="ingredient">${vo.rcontent1}</li>
		         
		         </ul>
    			 </div>
     		</div>
     		<br>
   		  <div class="레시피">
	         <div class="subtitle">&nbsp;레시피</div>
	         <div style="margin-bottom: 100px;">
		         <ul class="ulreci" style="line-height: 30px;">
		            <li class="recipe">${vo.rcontent2 }</li>
		         </ul>
      			 </div>
    		 </div>
    		 
     <form name="comment_write_cf" action="doppio/admin/admin_recipe/recipe_write_cf.th" method="post">
    	<div class="댓글">
       	<div class="subtitle">&nbsp;댓글</div>
        	<div class="commentfield">
        	

        		<table class="commtable">
        			<tr class="commbtn">
        				<td colspan="2" class="commbtntd"><p>2022-05-19</p>&nbsp;<button class="commbtnup">수정</button><button class="commbtndel">삭제</button></td>
        			</tr>
        			<tr>
        				<th class="commth" >작성자 id</th><td class="commtd">댓글내용입니다</td>
        			</tr>
        		</table>        		

        		<input type="hidden" name="cmcate_num" value="${vo.rnum }">
           	<textarea rows="1" cols="40" style="width: 600px;" placeholder="내용을 입력해 주세요" id="cmcontent" name="cmcontent"></textarea>
          		<button type="button" class="enter" id="btnComm">등록</button>  
          		
        	</div>
     		</div>
	</form>
	
		<table class="pagenumber">
			<tr>
				<td colspan="4"><div id="ampaginationsm"></td>
			</tr>
		</table>
	
  		</div>
 		</div>
 		
	<!-- footer -->
	<jsp:include page="../../doppio_footer.jsp"></jsp:include>
</body>
</html>