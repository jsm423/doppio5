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
	 * 게시판 - 글쓰기 폼체크
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
 	$("#btnRecipe").click(function(){
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
			recipe_write.submit();
		}
	});
	
		
	$("#btnCancel").click(function(){
 		location.href="http://localhost:9000/doppio/admin/admin_recipe/recipe_list.th"
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}); //ready function


















