var flag = [0,0,0,0];
$(document).ready(function() {
	var fp_width = $(".form-page").outerWidth();//获取form_page的宽度
	
	//下一步
	$("body").on("click",".next-btn",function() {
		$(".complete-info-box form").animate({
			left: "-=" + fp_width
		},500)
		return false;
	})

	//上一步
	$("body").on("click",".prev-btn",function() {
		$(".complete-info-box form").animate({
			left: "+=" + fp_width
		},500)
		return false;
	})

	//姓名验证
	$("#user-name").blur(function() {
		var user_name = /[^\u4e00-\u9fa5]/g;//如何设置全中文？
		if($(this).val().length == 0) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;输入不能为空');
			flag[0] = 0;
		}
		else if(user_name.test($(this).val())) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;请输入正确的姓名');
			flag[0] = 0;
		}
		else {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-check-circle" aria-hidden="true"></i>&nbsp;输入正确');
			flag[0] = 1;
		}
	})

	//手机验证
	$("#user-phone").blur(function() {
		var user_phone = /^1[3|4|5|7|8][0-9]{9}$/;
		if($(this).val().length == 0) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;输入不能为空');
			flag[1] = 0;
		}
		else if(!user_phone.test($(this).val())) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;请输入正确的手机');
			flag[1] = 0;
		}
		else {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-check-circle" aria-hidden="true"></i>&nbsp;输入正确');
			flag[1] = 1;
		}
	})

	//邮箱验证
	$("#user-email").blur(function() {
		var user_email = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
		if($(this).val().length == 0) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;输入不能为空');
			flag[2] = 0;
		}
		else if(!user_email.test($(this).val())) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;请输入正确的邮箱');
			flag[2] = 0;
		}
		else {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-check-circle" aria-hidden="true"></i>&nbsp;输入正确');
			flag[2] = 1;
		}
	})

	//学校验证
	$("#user-school").blur(function() {
		var user_school = /[^\u4e00-\u9fa5]/g;
		if($(this).val().length == 0) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;输入不能为空');
			flag[3] = 0;
		}
		else if(user_school.test($(this).val())) {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-times-circle" aria-hidden="true"></i>&nbsp;请输入正确的学校');
			flag[3] = 0;
		}
		else {
			$(this).parents("tr").find(".interpret").html('<i class="fa fa-check-circle" aria-hidden="true"></i>&nbsp;输入正确');
			flag[3] = 1;
		}
	})

	//输入简介验证
	$(".user-intro").blur(function() {
		if($(this).val().length == 0) {
			alert("简介不能为空");
			flag[5] = 0;
		}
		else {
			flag[5] = 1;
		}
	})

	//上传附件
	$("#user-file").on("change",function(e) {
		//e.currentTarget.files 是一个数组，如果支持多个文件，则需要遍历
    	var file_name = e.currentTarget.files[0].name;
    	console.log(file_name);
    	$(".file-name").html(file_name);
	})

	//提交按钮
	$("#sub-btn").click(function() {
		var identity_radio = $("input[type='radio']");
		if(flag[0] == 0 || flag[1] == 0 || flag[2] == 0 || flag[3] == 0) {
			alert("请正确填写信息");
			return false;
		}
		else if(!(identity_radio[0].checked || identity_radio[1].checked)) {
			alert("请选择您的身份");
			return false;
		}
		else if($(".user-intro").val().length == 0) {
			alert("请输入您的简介");
			return false;
		}
		else {
			alert("填写成功");
			$(".complete-info-box form").submit();
		}
	})

	//选择身份时添加选中样式
	$("#teacher-radio").click(function() {
		$(this).parents("span").find("label").css("background-color","rgba(255,255,255,.3)");
		$("#student-radio").parents("span").find("label").css("background-color","rgb(110,190,222)");
	})
	$("#student-radio").click(function() {
		$(this).parents("span").find("label").css("background-color","rgba(255,255,255,.3)");
		$("#teacher-radio").parents("span").find("label").css("background-color","rgb(110,190,222)");
	})

})
