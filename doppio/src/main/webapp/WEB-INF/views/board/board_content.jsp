<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DOPPIO</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
<script src="http://localhost:9000/doppio/resources/js/jquery-3.6.0.min.js"></script>
</head>
<body>
	<!-- header -->
	<jsp:include page="../doppio_header.jsp"></jsp:include>
	
	<!-- content -->
	<div id="containdiv">
		<section>
			<div class="title">
				<p>게시판</p><br><br>
			</div>
			<table id="headtable">
				<tr>
					<td colspan="4"><a href="http://localhost:9000/doppio/board/board_list.th" id="tolist">목록으로</a></td>
				</tr>
				<tr>
					<td colspan="4"></td>
				</tr>
				<tr>
					<td colspan="4"></td>
				</tr>
				<tr id="hits">
					<td colspan="4"></td>
					<td>조회수:${vo.bhits }</td>
				</tr>
				<tr class="containerhead">
					<td width="5%">${rno }</td>
					<td width="60%" style="font-size:20px">${vo.btitle }</td>
					<td width="20%" class="t_right">test</td>
					<td width="15%" class="t_right" colspan="2">${vo.bdate }</td>
				</tr>
			</table>
			<hr id="middleline">
			<form name="delForm" action="/doppio/board/board_content.th?bnum=${vo.bnum }" method="post">
			<table id="contenttable">
				<tr id="contenthead">
					<td width="82%"></td>
					<td><a href="http://localhost:9000/doppio/board/board_update.th?bnum=${vo.bnum}&rno=${rno}" width="9%">수정</a></td>
					<td><a width="9%"><button type="submit" class="delbtn">삭제</button></a></td>
				</tr>
			</table>
			</form>
			<table id="contentmain">
				<tr>
				<td colspan="5"><br>
					<td>${vo.bcontent }<br><br><br><br>
					
					<c:if test="${vo.bsfile != null}">
							<img src="http://localhost:9000/doppio/resources/upload/${vo.bsfile}"
							     width="250px" height="250px">
					</c:if>
				</td>
				</tr>
			</table>
			<br><br><br><br><br>
			<div id="comment">
			<h4>댓글</h4><br>
			<div id="comment_1">
				<div class=innerc>
					<textarea rows="4" cols="170" class="mentbnt"></textarea>
					<button id="cbut" class="mentbtn">등록</button>
				</div>	
			</div>
			</div>
			<br><br><br><br><br>
		</section>
		
	</div>
	
	
	
	
	<!-- footer -->
	<jsp:include page="../doppio_footer.jsp"></jsp:include>
</body>
</html>