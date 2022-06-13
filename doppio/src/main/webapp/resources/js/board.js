$(document).ready(function(){
	
	
	//검색버튼 클릭 이벤트
	$("#searchBtn").click(function(){
 	
 		console.log("검색 조건" + $('select[name=searchType]').val());
 		console.log("검색 키워드" + $('input[name=keyword]').val());
 		
		$.ajax({
				url : "/doppio/board/board_list_search.th",
				type: "POST",
				data : JSON.stringify({
					"searchType" : $('select[name=searchType]').val(),
					"keyword" : $('input[name=keyword]').val(),
					"start" : "1",
					"end"   : "5"
				}),
				contentType : 'application/json',
				success : function(result){
				
					console.log(result.searchList);
					
					var res = result.searchList;
					
					//일단 그리려는 영역 비우기
					$('#board_table').empty();
					
					var html = '<tr id="board_head"><th>번호</th><th width="60%">제목</th><th>작성자</th><th>등록일</th><th>조회수</th></tr>' 
					html+='<tr class="boardhover">';
					
					$.each(res,function(i){
						html+='<td>'+(i+1)+'</td>';
						html+='<td>';
						html+='<a href="http://localhost:9000/doppio/board/board_content.th?bnum=';
						html+=this.bnum+'&rno='+this.rno+'class="boardtitle">'+this.btitle+'</a>';
						html+='</td>';
						html+='<td>'+this.id+'</td>';
						html+='<td>'+this.bdate+'</td>';
						html+='<td>'+this.bhits+'</td>';	
					});
					
					html+='</tr>';
					html+='<tr><td colspan="5"><div id="ampaginationsm"></div></td></tr>';
					
					console.log(html);
					
					
					$('#board_table').append(html);
					
				}
		});//ajax
		
	});
	

});