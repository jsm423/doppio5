$(document).ready(function(){
	
	
	//검색버튼 클릭 이벤트
	$("#searchBtn").click(function(){
 	
 		console.log("검색 조건" + $('select[name=searchType]').val());
 		console.log("검색 키워드" + $('input[name=keyword]').val());
 		
		$.ajax({
				url : "/doppio/board/board_list_search.th",
				type: "GET",
				data : JSON.stringify({
					"searchType" : $('select[name=searchType]').val(),
					"keyword" : $('input[name=keyword]').val()
				}),
				contentType : 'application/json',
				success : function(result){
				
					console.log(result);
				
					//location.reload();
				}
		});//ajax
		
	});
	

});