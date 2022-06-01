<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
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
	           $(location).attr('href', "http://localhost:9000/doppio/qna/qna_list.th?rpage="+e.page);         
	    });
		
 	});
</script>
<script>
	$(document).ready(function() {

		var page = $('#board_head').hover(function() {

			$(this).css("background-color","#f7f7f7");

		}, function() {

		$(this).css("background-color","#ffffff");

	});
		var page1 = $('.boardhover').hover(function() {

			$(this).css("background-color","#f7f7f7");

		}, function() {

		$(this).css("background-color","#ffffff");

	});

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
			<div id="writebtn">
			<c:if test="${sessionScope.sid != null }">
			<button type="button" class="write_button" onclick="location.href='http://localhost:9000/doppio/qna/qna_write.th'">글쓰기</button><br><br>
			</c:if>
			</div>
			<table id="board_table">
				<tr id="board_head">
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
				</tr>
			</table>
			<br><br><br><br><br><br>
		</section>
		
	</div>
	
	
	<!-- footer -->
	<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>