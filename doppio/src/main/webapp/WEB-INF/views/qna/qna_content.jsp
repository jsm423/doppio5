<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="http://localhost:9000/doppio/resources/css/doppio_css.css">
</head>
<body>
	<!-- header -->
	<jsp:include page="../doppio_header.jsp"></jsp:include>
	
	<!-- content -->
	<div id="containdiv">
		<section>
			<div class="title">
				<p>Q & A</p><br><br>
			</div>
			<table id="headtable">
				<tr>
					<td colspan="4"><a href="http://localhost:9000/doppio/qna/qna_list.th" id="tolist">> 목록으로</a></td>
				</tr>
				
				<tr id="hits">
					<td colspan="4"></td>
					<td>조회수 : ${vo.qhits }</td>
				</tr>
				<tr class="containerhead">
					<td width="5%">${rno }</td>
					<td width="60%" style="font-size:20px">${vo.qtitle }</td>
					<td width="20%" class="t_right">test</td>
					<td width="15%" class="t_right" colspan="2">${vo.qdate }</td>
				</tr>
			</table>
			<hr id="middleline">
			<form name="delForm" action="/doppio/qna/qna_content.th?qnum=${vo.qnum }" method="post">
			<table id="contenttable">
				<tr id="contenthead">
					<td width="82%"></td>
					<td><a href="http://localhost:9000/doppio/qna/qna_update.th?qnum=${vo.qnum}&rno=${rno}" width="9%">수정</a></td>
					<td><a width="9%"><button type="submit" class="delbtn">삭제</button></a></td>
				</tr>
			</table>
			</form>
			<table id="contentmain">
				<tr>
					<td>${vo.qcontent }</td>
				</tr>
			</table>
			<br><br><br><br><br><br>
			<div id="comment">
			<h4>댓글</h4><br>
			<div id="comment_1">
				<div class=innerc>
					<textarea rows="4" cols="170" class="ment"></textarea>

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