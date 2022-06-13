<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOPPIO</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/am-pagination.css">
<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
<script src="http://localhost:9000/doppio/resources/js/doppio.js"></script>
<script src="http://localhost:9000/doppio/resources/js/qna.js"></script>
<script src="http://localhost:9000/doppio/resources/js/am-pagination.js"></script>
<script>
	$(document).ready(function(){
		
		/* var pager = jQuery('#ampaginationsm').pagination({
		
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
	           $(location).attr('href', "http://localhost:9000/doppio/qna/qna_list.th?rpage="+e.page);         
	    }); */
		
 	});
</script>

</head>
<body>
	<!-- header -->
	<jsp:include page="../doppio_header.jsp"></jsp:include>
	
	<div id="boarddiv">
		<section class="board_list">
			<div class="title">
				<p>Q & A</p><br>
			</div>
			<h3 style="text-align: center;">이용에 있어 궁금한 사항이 있으신가요? QNA 게시판을 통해 질문해 주세요</h3>
			<div id="writebtn">
			<c:if test="${sessionScope.sid != null }">
			<button type="button" class="write_button" onclick="location.href='http://localhost:9000/doppio/qna/qna_write.th'">문의글 작성</button><br><br>
			</c:if>
			</div>
			<table id="board_table">
				<%-- <tr id="board_head">
					<th>번호</th>
					<th width="60%">제목</th>
					<th>작성자</th>	
					<th>등록일</th>
					<th>조회수</th>
				</tr>
				<c:forEach var="vo" items="${list}">
					<tr class="boardhover">
						<td>${vo.rno }</td>
						<td><a href="http://localhost:9000/doppio/qna/qna_content.th?qnum=${vo.qnum }&rno=${vo.rno}" class="boardtitle">${vo.qtitle }</a></td>
						<td>${vo.id }</td>
						<td>${vo.qdate }</td>
						<td>${vo.qhits }</td>
					</tr>
				</c:forEach>
				
				<tr>
					<td colspan="5"><div id="ampaginationsm"  class="pagenum"></td>					
				</tr> --%>
			</table>
			<div style="text-align: center;">
			<ul class="paging" >
				
			</ul>
			</div> 
			
			<div style="text-align: center;">
			  <select name="searchType">
			      <option value="title">제목</option>
			      <option value="content">내용</option>
			      <option value="id">작성자</option>
			  </select>
			  
			  <input type="text" name="keyword"/>
			  
			  <button id="searchBtn" >검색</button>
			</div>
			<br><br>
		</section>
		
		<!-- <div id="ampaginationsm"></div> -->
	</div>
	
	
	<!-- footer -->
	<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>