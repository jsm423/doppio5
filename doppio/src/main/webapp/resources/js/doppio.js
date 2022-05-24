$(document).ready(function(){

		
	/**************
	 * 회원가입 - 폼체크
	 ************/
	$("#btnJoin").click(function(){
		
		if($("#id").val() == ""){
			alert("아이디를 입력해주세요");
			$("#id").focus();
			return false;
		}else if($("#pass").val() == ""){
			alert("패스워드를 입력해주세요");
			$("#pass").focus();
			return false;
		}else if($("#cpass").val() == ""){
			alert("패스워드 확인을 입력해주세요");
			$("#cpass").focus();
			return false;
		}else if($("#name").val() ==""){
			alert("이름을 입력해주세요");
			$("#name").focus();
			return false;
		}else if($("#address").val() == ""){
			alert("주소를 입력해주세요");
			$("#address").focus();
			return false;
		}else if($("#hp1").val() == ""){
			alert("핸드폰 번호를 입력해주세요");
			$("#hp1").focus();
			return false;
		}else if($("#hp2").val() == ""){
			alert("핸드폰 번호를 입력해주세요");
			$("#hp2").focus();
			return false;
		}else if($("#hp3").val() == ""){
			alert("핸드폰 번호를 입력해주세요");
			$("#hp3").focus();
			return false;
		}else if($("#email1").val() == ""){
			alert("이메일을 입력해주세요");
			$("#email1").focus();
			return false;
		}else if($("#email2").val() == ""){
			alert("이메일주소를 입력해주세요");
			$("#email2").focus();
			return false;
		}else{
			join_form.submit();
		}			
	});
	
		
	/**************
	 * 로그인 - 폼체크
	 ************/
	$("#btnLogin").click(function(){
		if($("#id").val() == ""){
			alert("아이디를 입력해주세요");
			$("#id").focus();
			return false;
		}else if($("#pass").val() == ""){
			alert("패스워드를 입력해주세요");
			$("#pass").focus();
			return false;
		}else{
			login_form.submit();
		}
	});
	
	
	/*******************
	 * 큐엔에이 - 글쓰기 폼체크
	 ********************/	
 	$("#btnQna").click(function(){
		if($("#qtitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#qtitle").focus();
			return false;
		}else if($("#qcontent").val() == ""){
			alert("내용을 입력해주세요");
			$("#qcontent").focus();
			return false;
		}else{
			qna_write.submit();
		}
	});
	 
	/*******************
	 * 게시판 - 글쓰기 폼체크
	 ********************/	
 	$("#btnBoard").click(function(){
		if($("#btitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#btitle").focus();
			return false;
		}else if($("#bcontent").val() == ""){
			alert("내용을 입력해주세요");
			$("#bcontent").focus();
			return false;
		}else{
			board_write.submit();
		}
	});
	
	
	/*******************
	 * 레시피 - 글쓰기 폼체크
	 ********************/	
 	$("#btnRecipecf").click(function(){
 		if($("#rname").val() == ""){ 
			alert("레시피명을 입력해주세요");
			$("#rname").focus();
				return false;
		}else if($("#rtitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#rtitle").focus();
			return false;
		}else if($("#rcontent1").val() == ""){
			alert("재료를 입력해주세요");
			$("#rcontent1").focus();
			return false;
		}else if($("#rcontent2").val() == ""){
			alert("레시피를 입력해주세요");
			$("#rcontent2").focus();
			return false;
		}else{
			recipe_write_cf.submit();
		}
	});
	
	/*******************
	 * 레시피 - 글쓰기 폼체크
	 ********************/	
 	$("#btnRecipencf").click(function(){
 		if($("#rname").val() == ""){ 
			alert("레시피명을 입력해주세요");
			$("#rname").focus();
				return false;
		}else if($("#rtitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#rtitle").focus();
			return false;
		}else if($("#rcontent1").val() == ""){
			alert("재료를 입력해주세요");
			$("#rcontent1").focus();
			return false;
		}else if($("#rcontent2").val() == ""){
			alert("레시피를 입력해주세요");
			$("#rcontent2").focus();
			return false;
		}else{
			recipe_write_ncf.submit();
		}
	});
	
	/*******************
	 * 레시피 - 글쓰기 폼체크
	 ********************/	
 	$("#btnRecipede").click(function(){
 		if($("#rname").val() == ""){ 
			alert("레시피명을 입력해주세요");
			$("#rname").focus();
				return false;
		}else if($("#rtitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#rtitle").focus();
			return false;
		}else if($("#rcontent1").val() == ""){
			alert("재료를 입력해주세요");
			$("#rcontent1").focus();
			return false;
		}else if($("#rcontent2").val() == ""){
			alert("레시피를 입력해주세요");
			$("#rcontent2").focus();
			return false;
		}else{
			recipe_write_de.submit();
		}
	});
	
	
	/*******************
	 * 패키지 - 등록 폼체크
	 ********************/	
 	$("#btnPackageNcf").click(function(){
 		if($("#pname").val() == ""){ 
			alert("상품명을 입력해주세요");
			$("#pname").focus();
				return false;
		}else if($("#ptitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#ptitle").focus();
				return false;
		}else if($("#pcontent").val() == ""){
			alert("소제목을 입력해주세요");
			$("#pcontent").focus();
				return false;
		}else if($("#pcate").val() == ""){
			alert("상품 구분을 입력해 주세요");
			$("#pcate").focus();
				return false;
		}else if($("#pstock").val() == ""){
			alert("재고 현황을 입력해 주세요");
			$("#pstock").focus();
				return false;
		}else if($("#pprice").val() == ""){
			alert("상품 가격을 입력해 주세요");
			$("#pprice").focus();
				return false;
		}else{
			package_write_ncf.submit();
		}
	});
	
	/*******************
	 * 패키지 - 등록 폼체크
	 ********************/	
 	$("#btnPackageCf").click(function(){
 		if($("#pname").val() == ""){ 
			alert("상품명을 입력해주세요");
			$("#pname").focus();
				return false;
		}else if($("#ptitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#ptitle").focus();
				return false;
		}else if($("#pcontent").val() == ""){
			alert("소제목을 입력해주세요");
			$("#pcontent").focus();
				return false;
		}else if($("#pcate").val() == ""){
			alert("상품 구분을 입력해 주세요");
			$("#pcate").focus();
				return false;
		}else if($("#pstock").val() == ""){
			alert("재고 현황을 입력해 주세요");
			$("#pstock").focus();
				return false;
		}else if($("#pprice").val() == ""){
			alert("상품 가격을 입력해 주세요");
			$("#pprice").focus();
				return false;
		}else{
			package_write_cf.submit();
		}
	});
	
	/*******************
	 * 패키지 - 등록 폼체크
	 ********************/	
 	$("#btnPackageDe").click(function(){
 		if($("#pname").val() == ""){ 
			alert("상품명을 입력해주세요");
			$("#pname").focus();
				return false;
		}else if($("#ptitle").val() == ""){
			alert("제목을 입력해주세요");
			$("#ptitle").focus();
				return false;
		}else if($("#pcontent").val() == ""){
			alert("소제목을 입력해주세요");
			$("#pcontent").focus();
				return false;
		}else if($("#pcate").val() == ""){
			alert("상품 구분을 입력해 주세요");
			$("#pcate").focus();
				return false;
		}else if($("#pstock").val() == ""){
			alert("재고 현황을 입력해 주세요");
			$("#pstock").focus();
				return false;
		}else if($("#pprice").val() == ""){
			alert("상품 가격을 입력해 주세요");
			$("#pprice").focus();
				return false;
		}else{
			package_write_de.submit();
		}
	});
	
	
	/*******************
	 * 레시피 - 댓글쓰기 폼체크
	 ********************/	
 	$("#btnComm").click(function(){
 	
 		if($("#cmcomment").val() == ""){
			alert("댓글내용을 입력해주세요");
			$("#cmcomment").focus();
			return false;
		}else{
			$.ajax({
					url : "/doppio/admin/admin_recipe/recipe_content_cf_cmtWrite.th",
					type: "POST",
					data : JSON.stringify({
						"rnum" : $(this).data("rnum"),
						"cmcomment" : $('#cmcomment').val()
					}),
					contentType : 'application/json',
					success : function(result){
						location.reload();
					}
				});//ajax
		
		
			//comment_write_cf.submit();
		}
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}); //ready function


















