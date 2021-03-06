<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ko">
	<head> 
		<meta charset="UTF-8">
		<title>Doppio</title>
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/recipe_list_css.css">
		<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/am-pagination.css">
		<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
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
			           $(location).attr('href', "http://localhost:9000/doppio/admin/admin_package/package_list_de.th?rpage="+e.page);         
			    });
				
		 	});
		</script>
		<style>
			.pagenumber{margin-left: auto; margin-right: auto;}
		</style>
		</head>
	<body>
		
		<!-- header -->
		<jsp:include page="../doppio_header.jsp"></jsp:include>
		
		<!-- content -->
		<div class="recipe_list">
			<div class="list_div">
		
			<div class="recipe_header">
				<img alt="dessert" src="http://localhost:9000/doppio/resources/img/package_dessert_bn.png">
			</div>
		
		<!-- 옵션 박스 -->
		<div class="lioption_div">
			<div class="lioption_div2">
				<!-- <section class="lioption_sc">
						<ul class="liopli">
							
							<li>
								<select name="oplist" id="oplist" style= "width: 200px; height: 30px;">
								<option value="전체보기">전체보기</option>
								<option value="쿠키&브래드">쿠키&브래드</option>
								<option value="샐러드&샌드위치">샐러드&샌드위치</option></select>
							</li>
							
						</ul>
					</section> -->
			</div>
		</div>
		<!-- 판매 리스트 -->
			<div class="imgcon_div">
				<section class="imgcon_sc">
				<c:forEach var="vo" items="${list}">
					<div class="imgcon1">
						<input type="hidden" name="rno" value="${vo.rno }">
						<input type="hidden" name="pnum" value="${vo.pnum }">
						<input type="hidden" name="psfile" value="${vo.psfile }">
						<input type="hidden" name="ptitle" value="${vo.ptitle }">
						<c:if test="${vo.psfile != null}">
							<a href="http://localhost:9000/doppio/package/package_content_de.th?pnum=${vo.pnum }&rno=${vo.rno}">
								<img src="http://localhost:9000/doppio/resources/upload/${vo.psfile }" class="package_img" width="300" height="300"/>
							</a>
						</c:if>
						<br>
						<a href="http://localhost:9000/doppio/package/package_content_de.th?pnum=${vo.pnum }&rno=${vo.rno}">${vo.ptitle }</a>
					</div>
				</c:forEach>
					
				</section>
			</div>
			</div>
		</div>
		
		<table class="pagenumber">
			<tr>
				<td colspan="4"><div id="ampaginationsm"></div></td>
			</tr>
		</table>
		
		<br><br><br><br><br><br>
			
		<!-- footer -->
		<jsp:include page="../doppio_footer.jsp"></jsp:include>
		
	</body>
</html>